package zyx.world.cooperation;

/**
 * @ClassName: Customer
 * @Description: 消费者类
 * @Author: Achilles
 * @Date: 23/12/2019  15:05
 * @Version: 1.0
 **/ //消费者
class Customer implements Runnable {

    private String name;
    private ProductQueue productQueue;

    public Customer(String name, ProductQueue productQueue) {
        this.name = name;
        this.productQueue = productQueue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.name + "消费了-->" + this.productQueue.pop());
        }
    }
}
