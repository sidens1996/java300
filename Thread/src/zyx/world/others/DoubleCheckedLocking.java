package zyx.world.others;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @ClassName: DoubleCheckedLocking
 * @Description: 单例模式：懒汉式套路基础上加入并发控制。保证在多线程环境下，对外存在一个对象
 * 1.构造器私有化-->避免外部new构造器
 * 2.提供私有的静态属性-->存储对象的地址
 * 3.提供共有的静态方法-->获取属性
 * @Author: Achilles
 * @Date: 23/12/2019  18:20
 * @Version: 1.0
 **/

public class DoubleCheckedLocking {

    //私有静态属性
    private static volatile DoubleCheckedLocking instance;//防止在初始化对象期间指令重排造成的Bug
    //没有volatile，其他线程可能访问到一个没有初始化的对象
    //构造器私有化
    private DoubleCheckedLocking() {
    }

    //公有的静态方法
    public static DoubleCheckedLocking getInstance() {
        //多重检测
        if (null != instance) {
            return instance;//避免不必要的同步，已经存在对象
        }
        synchronized (DoubleCheckedLocking.class) {
            if (null == instance) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                instance = new DoubleCheckedLocking();
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                System.out.println(DoubleCheckedLocking.getInstance());
            }).start();
        }
        AtomicInteger atomicInteger = new AtomicInteger();
    }
}
