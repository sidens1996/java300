package zyx.world.state;

/**
 * @ClassName: BlockedSleep1
 * @Description: 测试sleep阻塞
 * sleep模拟网络延时，放大了发生问题的可能性
 * @Author: Achilles
 * @Date: 19/12/2019  18:07
 * @Version: 1.0
 **/

public class BlockedSleep1 {
    public static void main(String[] args) {
        Web12306 web12306 = new Web12306();
        new Thread(web12306, "1号").start();
        new Thread(web12306, "2号").start();
        new Thread(web12306, "3号").start();
    }
}

class Web12306 implements Runnable {

    private int ticketNums = 100;

    @Override
    public void run() {
        while (true) {
            if (this.ticketNums < 0) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }
}
