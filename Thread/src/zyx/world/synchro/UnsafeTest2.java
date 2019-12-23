package zyx.world.synchro;

/**
 * @ClassName: UnsafeTest2
 * @Description: 测试线程不安全，银行取钱
 * @Author: Achilles
 * @Date: 21/12/2019  16:56
 * @Version: 1.0
 **/

public class UnsafeTest2 {
    public static void main(String[] args) {
        Account account = new Account("zyx", 100);
        DrawingMoney zyx = new DrawingMoney(account, 90);
        DrawingMoney wbq = new DrawingMoney(account, 50);
        new Thread(zyx, "zyx").start();
        new Thread(wbq, "wbq").start();
    }
}

class Account {
    public String name;
    public int money;

    public Account(String name, int money) {
        this.name = name;
        this.money = money;
    }
}

class DrawingMoney implements Runnable {

    private Account account;
    private int drawingMoney;//取的钱
    private int pocketMoney;//取的总数

    public DrawingMoney(Account account, int drawingMoney) {
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        if (account.money -drawingMoney > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(account.money);
            this.account.money -= drawingMoney;
            pocketMoney += drawingMoney;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(account.money);
            System.out.println(Thread.currentThread().getName() + "取了->" + pocketMoney);
            System.out.println(Thread.currentThread().getName() + "剩余->" + account.money);
        }
    }
}
