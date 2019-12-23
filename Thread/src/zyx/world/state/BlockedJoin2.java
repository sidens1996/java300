package zyx.world.state;

/**
 * @ClassName: BlockedJoin2
 * @Description: 测试join，插队
 * @Author: Achilles
 * @Date: 20/12/2019  12:44
 * @Version: 1.0
 **/

public class BlockedJoin2 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
        Thread thread = new Thread(new Print());
        thread.start();
        thread.join();
        for (int i = 20; i < 30; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}

class Print implements Runnable {

    @Override
    public void run() {
        for (int i = 10; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
