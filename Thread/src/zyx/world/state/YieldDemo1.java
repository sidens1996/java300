package zyx.world.state;

/**
 * @ClassName: YieldDemo1
 * @Description: 测试yield方法
 * @Author: Achilles
 * @Date: 19/12/2019  21:42
 * @Version: 1.0
 **/

public class YieldDemo1 {

    public static void main(String[] args) {
        MyYield myYield = new MyYield();
        new Thread(myYield, "线程一").start();
        new Thread(myYield, "线程二").start();
    }
}

class MyYield implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->start");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + "-->end");
    }
}