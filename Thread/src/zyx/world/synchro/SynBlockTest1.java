package zyx.world.synchro;

/**
 * @ClassName: SynBlockTest1
 * @Description: TODO
 * @Author: Achilles
 * @Date: 21/12/2019  20:43
 * @Version: 1.0
 **/

public class SynBlockTest1 {
    public static void main(String[] args) {
        SynAccount synAccount = new SynAccount("zyx", 100);
        new Thread(new SynDrawingMoney(synAccount, 90), "wbq").start();
        new Thread(new SynDrawingMoney(synAccount, 50), "zyx").start();
    }
}

class SynAccount {
    public String name;
    public int money;

    public SynAccount(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

class SynDrawingMoney implements Runnable {

    public SynAccount synAccount;
    public int drawingMoney;
    public int pocketMoney;

    public SynDrawingMoney(SynAccount synAccount, int drawingMoney) {
        this.synAccount = synAccount;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        core();
    }

    private void core() {
        if (this.synAccount.money - drawingMoney < 0) {
            return;
        }//提升性能
        synchronized (synAccount) {
            if (this.synAccount.money - drawingMoney >= 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.synAccount.money -= drawingMoney;
                this.pocketMoney += drawingMoney;
                System.out.println(Thread.currentThread().getName() + "取了-->" + this.pocketMoney);
                System.out.println("账户剩余-->" + this.synAccount.money);
            }
        }
    }
}
