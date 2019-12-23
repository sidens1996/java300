package zyx.world.synchro;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName: HappyCinema2
 * @Description: 使用同步方法来实现电影院购票功能
 * @Author: Achilles
 * @Date: 22/12/2019  16:41
 * @Version: 1.0
 **/

public class HappyCinema2 {
    public static void main(String[] args) {
        Cinema2 cinema2 = new Cinema2();
        Set<Integer> customer1 = new HashSet<>();
        customer1.add(2);
        customer1.add(3);
        Set<Integer> customer2 = new HashSet<>();
        customer2.add(2);
        customer2.add(6);
        new Customer2(cinema2, customer1, "wbq").start();
        new Customer2(cinema2, customer2, "zyx").start();
    }
}

class Cinema2 implements Runnable{//为了达到要求，同步方法必须写到Cinema2里面
    private int available;
    private Set<Integer> seats;

    public Cinema2() {
        this.seats = new HashSet<>();
        this.seats.add(1);
        this.seats.add(2);
        this.seats.add(3);
        this.seats.add(4);
        this.seats.add(5);
        this.seats.add(6);
        this.seats.add(7);
        this.available = seats.size();
    }

    @Override
    public synchronized void run() {
        Customer2 customer2 = (Customer2) Thread.currentThread();
        Set<Integer> temp = new HashSet<>();
        temp.addAll(this.seats);
        this.seats.removeAll(customer2.seats);
        if (temp.size() != this.seats.size() + customer2.seats.size()) {//出票失败
            System.out.println(customer2.getName() + "出票失败-->" + customer2.seats);
        } else {
            System.out.println(customer2.getName() + "出票成功-->" + customer2.seats);
        }
    }
}

class Customer2 extends Thread {
    private Runnable cinema2;
    public Set<Integer> seats;

    public Customer2(Runnable cinema2, Set<Integer> seats, String name) {//注意这里的写法
        super(cinema2, name);
        this.cinema2 = cinema2;
        this.seats = seats;
    }
}
