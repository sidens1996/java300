package zyx.world.thread;

/**
 * @ClassName: TestLambda4
 * @Description: 测试Lambda
 * @Author: Achilles
 * @Date: 19/12/2019  16:12
 * @Version: 1.0
 **/

public class TestLambda4 {

    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("一边学习lambda");
            }
        }).start();
        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("一边崩溃！");
            }
        }).start();
    }
}
