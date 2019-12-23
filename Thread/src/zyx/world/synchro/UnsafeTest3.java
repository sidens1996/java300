package zyx.world.synchro;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UnsafeTest3
 * @Description: 线程不安全，操作容器
 * @Author: Achilles
 * @Date: 21/12/2019  17:11
 * @Version: 1.0
 **/

public class UnsafeTest3 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        System.out.println(list.size());//不为10000，说明有覆盖或者丢失，线程不安全
    }
}
