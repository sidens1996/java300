package zyx.world.others;

/**
 * @ClassName: HappenBefore
 * @Description: 指令重排，代码执行顺序与预期不一致
 * @Author: Achilles
 * @Date: 23/12/2019  16:48
 * @Version: 1.0
 **/

public class HappenBefore {

    public static int a = 0;
    public static boolean flag = false;

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            a = 1;
            flag = true;
        });
        Thread thread1 = new Thread(() -> {
            if (flag) {
                a = 1;
            }
            if (a == 0) {
                System.out.println("happens-before a-->" + a);
            }
        });
        thread.start();
        thread1.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
