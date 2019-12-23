package zyx.world.state;

/**
 * @ClassName: AllState
 * @Description: 测试线程的状态
 * @Author: Achilles
 * @Date: 21/12/2019  15:36
 * @Version: 1.0
 **/

public class AllState {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("线程体");
            }
        });
        System.out.println(thread.getState());
        thread.start();
        while (thread.getState() != Thread.State.TERMINATED) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(thread.getState());
        }
        System.out.println(thread.getState());
    }
}
