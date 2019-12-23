package zyx.world.state;

/**
 * @ClassName: YieldDemo2
 * @Description: 测试yield方法
 * @Author: Achilles
 * @Date: 19/12/2019  21:47
 * @Version: 1.0
 **/

public class YieldDemo2 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("lambda-->" + i);
            }
        }).start();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                Thread.yield();
            }
            System.out.println("main-->" + i);
        }
    }
}
