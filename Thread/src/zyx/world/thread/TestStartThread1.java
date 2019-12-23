package zyx.world.thread;

/**
 * @ClassName: TestStartThread
 * @Description: 测试创建线程方式一：继承Thread，重写run方法
 *
 * @Author: Achilles
 * @Date: 18/12/2019  21:48
 * @Version: 1.0
 **/

public class TestStartThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {

        // 启动
        TestStartThread1 testStartThread1 = new TestStartThread1();
        testStartThread1.start();
        for (int i = 0; i < 40; i++) {
            System.out.println("一边写代码");
        }
    }
}
