package zyx.world.synchro;

/**
 * @ClassName: SynTest1
 * @Description: 使用synchronized方法来完成对抢票软件的模拟
 * @Author: Achilles
 * @Date: 21/12/2019  19:24
 * @Version: 1.0
 **/

public class SynTest1 {
    public static void main(String[] args) {
        SynWeb12306 synWeb12306 = new SynWeb12306();
        new Thread(synWeb12306, "一号").start();
        new Thread(synWeb12306, "二号").start();
        new Thread(synWeb12306, "三号").start();
    }
}

class SynWeb12306 implements Runnable {

    private int ticketNums = 100;
    private Boolean flag = true;

    @Override
    public void run() {
        while (flag) {
            core();
        }
    }

    private synchronized void core() {
        if (ticketNums <= 0) {
            this.flag = false;
            return;
        }
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "抢到了-->第" + this.ticketNums + "张票");
        this.ticketNums--;
    }
}
