package zyx.world.thread;

/**
 * @ClassName: LambdaThread
 * @Description: 测试Lambda表达式用于多线程,简化线程的使用
 * @Author: Achilles
 * @Date: 19/12/2019  15:01
 * @Version: 1.0
 **/

public class LambdaThread {

    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 20; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
