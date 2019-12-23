package zyx.world.synchro;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @ClassName: HappyCinema
 * @Description: 模拟影院抢票，
 * 使用容器存储影院位置
 * synchronized块
 * @Author: Achilles
 * @Date: 21/12/2019  21:17
 * @Version: 1.0
 **/

public class HappyCinema1 {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Set<Integer> cinemaCustomer1 = new HashSet<>();
        cinemaCustomer1.add(2);
        cinemaCustomer1.add(3);
        Set<Integer> cinemaCustomer2 = new HashSet<>();
        cinemaCustomer2.add(2);
        cinemaCustomer2.add(6);
        new Thread(new Customer(cinema, cinemaCustomer1), "zyx").start();
        new Thread(new Customer(cinema, cinemaCustomer2), "wbq").start();
    }
}

class Customer implements Runnable {
    private Cinema cinema;
    private Set<Integer> seats;

    public Customer(Cinema cinema, Set<Integer> seats) {
        this.cinema = cinema;
        this.seats = seats;
    }

    @Override
    public void run() {
        if (core()) {
            System.out.println(Thread.currentThread().getName() + "-->出票成功！" + this.seats);
        } else {
            System.out.println(Thread.currentThread().getName() + "-->出票失败！" + this.seats);
        }
        System.out.println("剩余座位-->" + this.cinema.seats);
    }

    private  boolean core() {
        synchronized (cinema) {
            //将影院座位和顾客选的座位进行比较
            Set<Integer> temp = new HashSet<>();
            temp.addAll(this.cinema.seats);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.cinema.seats.removeAll(this.seats);
            if (temp.size() != this.cinema.seats.size() + this.seats.size()) {//出票失败
                this.cinema.seats.addAll(temp);//座位不允许重复
                return false;
            }
            this.cinema.available -= this.seats.size();
            return true;
        }
    }
}

class Cinema {
    Set<Integer> seats;
    int available;

    public Cinema() {
        this.seats = new HashSet<>();
        this.seats.add(1);
        this.seats.add(2);
        this.seats.add(3);
        this.seats.add(4);
        this.seats.add(5);
        this.seats.add(6);
        this.seats.add(7);
    }

    public Cinema(Set<Integer> seats) {
        this.seats = seats;
        this.available = seats.size();
    }
}
