package zyx.world.state;

/**
 * @ClassName: BlockedSleep2
 * @Description: 时间上的概念
 * @Author: Achilles
 * @Date: 19/12/2019  18:15
 * @Version: 1.0
 **/

public class BlockedSleep2 {
    public static void main(String[] args) {

        Racer racer = new Racer();
        new Thread(racer, "rabbit").start();
        new Thread(racer, "turtle").start();
    }
}

class Racer implements Runnable {

    private String winner;

    @Override
    public void run() {
        for (int steps = 1; steps <= 100; steps++) {
            //模拟休息
            if (Thread.currentThread().getName().equals("rabbit") && steps % 10 == 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"-->"+steps);
            if (gameOver(steps)) {
                break;
            }
        }
    }

    private boolean gameOver(int steps) {
        if (winner != null) {
            return true;
        } else {
            if (steps == 100) {
                winner = Thread.currentThread().getName();
                System.out.println("winner-->" + winner);
                return true;
            }
        }
        return false;
    }

}
