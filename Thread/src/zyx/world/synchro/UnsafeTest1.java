package zyx.world.synchro;

/**
 * @ClassName: UnsafeTest1
 * @Description: 测试线程不安全，抢票，线程不安全
 * @Author: Achilles
 * @Date: 21/12/2019  16:42
 * @Version: 1.0
 **/

public class UnsafeTest1 {
    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        Thread thread = new Thread(web12306, "1号");
        Thread thread1 = new Thread(web12306, "2号");
        Thread thread2 = new Thread(web12306, "3号");
        thread.start();
        thread1.start();
        thread2.start();
    }
}

class Web12306 implements Runnable {
    private int ticketNums = 100;
    private boolean flag = true;

    @Override
    public void run() {
        while (this.flag) {
            test();
        }
    }

    public void test() {
        if (this.ticketNums < 0) {
            flag = false;
            return;
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "成功抢到-->第" + this.ticketNums + "张票");
        this.ticketNums--;
    }

}
