package zyx.world.synchro;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: SynBlockTest2
 * @Description: 使用同步块来实现ArrayList的线程安全
 * @Author: Achilles
 * @Date: 21/12/2019  20:56
 * @Version: 1.0
 **/

public class SynBlockTest2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                synchronized (list) {
                    list.add(Thread.currentThread().getName());
                }
            }).start();
        }
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
