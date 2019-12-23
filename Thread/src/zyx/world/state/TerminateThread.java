package zyx.world.state;

/**
 * @ClassName: TerminateThread
 * @Description: 终止线程
 * 1.线程正常执行完毕-->次数
 * 2.外部干涉-->加入标志位
 * 不要使用stop,destroy
 * @Author: Achilles
 * @Date: 19/12/2019  16:48
 * @Version: 1.0
 **/

public class TerminateThread implements Runnable{

    private Boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (this.flag) {
            System.out.println(name + "-->");
        }
    }

    private void terminate() {
        this.flag = false;
    }

    public static void main(String[] args) {
        TerminateThread zyx = new TerminateThread("zyx");
        new Thread(zyx).start();
        for (int i = 0; i < 100; i++) {
            if (i == 88) {
                zyx.terminate();
            }
            System.out.println("main-->" + i);
        }
    }
}
