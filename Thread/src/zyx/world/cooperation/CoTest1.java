package zyx.world.cooperation;

/**
 * @ClassName: CoTest1
 * @Description: 线程协作，生产消费者模型
 * 实现方式一：管程法
 * 更宽的思路：每个生产者后面都有一个小的消息队列，所有小的消息队列都对接大的消息队列
 * @Author: Achilles
 * @Date: 22/12/2019  20:22
 * @Version: 1.0
 **/

public class CoTest1 {
    public static void main(String[] args) {
        ProductQueue productQueue = new ProductQueue();
        Producer producer1= new Producer("producer1", productQueue);
        Customer customer1= new Customer("customer1", productQueue);
        Producer producer2 = new Producer("producer2", productQueue);
        new Thread(producer1, "producer1").start();
        new Thread(producer2, "producer2").start();
        new Thread(customer1, "customer1").start();
    }
}

