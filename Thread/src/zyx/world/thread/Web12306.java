package zyx.world.thread;

import java.lang.management.ThreadInfo;

/**
 * @ClassName: Web12306
 * @Description: 测试资源共享
 * @Author: Achilles
 * @Date: 19/12/2019  14:16
 * @Version: 1.0
 **/

public class Web12306 implements Runnable{

    private int ticketsNums = 100;

    @Override
    public void run() {
        while (true) {
            if (ticketsNums < 0) {
                return;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "抢到一张" + "-->剩余" + ticketsNums--);
        }
    }

    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        new Thread(web12306, "1号").start();
        new Thread(web12306, "2号").start();
        new Thread(web12306, "3号").start();
    }
}
