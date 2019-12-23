package world.zyx.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName: TestCollections
 * @Description: 辅助类的使用
 * @Author: Achilles
 * @Date: 14/12/2019  20:28
 * @Version: 1.0
 **/

public class TestCollections {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add("a" + i);
        }
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(Collections.binarySearch(list,"a0"));
    }
}
