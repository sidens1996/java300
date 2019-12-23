package world.zyx.test;

import java.util.Set;
import java.util.TreeSet;

/**
 * @ClassName: TestTreeSet
 * @Description: 测试TreeSet
 * @Author: Achilles
 * @Date: 14/12/2019  19:35
 * @Version: 1.0
 **/

public class TestTreeSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(100);
        set.add(0);
        set.add(500);
        set.add(200);
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}
