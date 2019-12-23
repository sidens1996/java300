package zyx.world.cooperation;

/**
 * @ClassName: Producer
 * @Description: 生产者类
 * @Author: Achilles
 * @Date: 23/12/2019  15:05
 * @Version: 1.0
 **/ //生产者
class Producer implements Runnable {

    private String name;
    private ProductQueue productQueue;

    public Producer(String name,ProductQueue productQueue) {
        this.name = name;
        this.productQueue = productQueue;
    }

    @Override
    public void run() {//不能在这个方法里锁定资源，会造成死锁
        //为什么会造成死锁，因为没有锁定count,在一个线程里count==0等待，另一个线程里count==10也在等待
        for (int i = 0; i < 100; i++) {
            Product product = new Product(name, i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.productQueue.push(product);
            System.out.println(this.name + "制造了-->" + product);
        }
    }
}
