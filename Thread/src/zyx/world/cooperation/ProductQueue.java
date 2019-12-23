package zyx.world.cooperation;

/**
 * @ClassName: ProductQueue
 * @Description: 消息队列
 * @Author: Achilles
 * @Date: 23/12/2019  15:05
 * @Version: 1.0
 **/ //消息队列
class ProductQueue {
    public static final int ARRAY_SIZE = 10;
    private Product[] array = new Product[ARRAY_SIZE];
    private int count = 0;

    public int getSize() {
        return this.count;
    }

    public synchronized void push(Product product) {
        //如果消息队列满了，则等待
        while (this.count >= 10) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (this.count < 10) {
                break;
            }
        }
        //如果消息队列新加了元素，则通知消费者可以消费了
        this.array[count++] = product;
        this.notifyAll();
    }

    public synchronized Product pop() {
        //如果消息队列为空，则等待
        if (this.count <= 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        //如果消费了，则通知生产者可以生产了
        //如果消费了一件商品，然后通知两家厂商都生产，消息队列会报异常
        //加入双重检测机制即可解决
        this.notifyAll();
        return this.array[count];
    }

}
