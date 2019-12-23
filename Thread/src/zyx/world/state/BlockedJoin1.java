package zyx.world.state;

/**
 * @ClassName: BlockedJoin1
 * @Description: join合并线程，插队线程
 * @Author: Achilles
 * @Date: 20/12/2019  12:31
 * @Version: 1.0
 **/

public class BlockedJoin1 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("thread-->" + i);
            }
        });
        thread.start();
        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                thread.join();
            }
            System.out.println("main-->" + i);
        }
    }
}
