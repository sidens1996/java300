package zyx.world.synchro;

/**
 * @ClassName: DeadLock
 * @Description: 死锁：过多的同步可能造成相互不释放资源
 * 从而相互等待，一般发生于同步中持有多个对象的锁
 * @Author: Achilles
 * @Date: 22/12/2019  18:35
 * @Version: 1.0
 **/

public class DeadLock {
    public static void main(String[] args) {

        new Thread(new Makeup("lly", 0), "lly").start();
        new Thread(new Makeup("wbq", 1), "wbq").start();
    }
}

class Mirror {

}

class LipStick {

}

class Makeup implements Runnable {

    private static Mirror mirror = new Mirror();
    private static LipStick lipStick = new LipStick();
    private String girl;
    private int choice;

    public Makeup(String girl, int choice) {
        this.girl = girl;
        this.choice = choice;
    }

    @Override
    public void run() {
        if (choice == 0) {
            synchronized (mirror) {
                System.out.println(Thread.currentThread().getName() + "照镜子");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (lipStick) {
                System.out.println(Thread.currentThread().getName() + "涂口红");
            }
        } else if (choice == 1) {
            synchronized (lipStick) {
                System.out.println(Thread.currentThread().getName() + "涂口红");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            synchronized (mirror) {
                System.out.println(Thread.currentThread().getName() + "照镜子");
            }
        }
    }
}
