package world.zyx.test;

import java.util.*;

/**
 * @ClassName: TestIterator
 * @Description: 测试迭代器
 * @Author: Achilles
 * @Date: 14/12/2019  19:48
 * @Version: 1.0
 **/

public class TestIterator {
    public static void main(String[] args) {
        //testIteratorList();
        //testIteratorSet();
        testIteratorMap();
    }

    public static void testIteratorList() {
        List<String> list = new ArrayList<>();
        list.add("zyx");
        list.add("lly");
        list.add("wbq");

        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorSet() {
        Set<String> set = new HashSet<>();
        set.add("zyx");
        set.add("lly");
        set.add("wbq");

        for (Iterator<String> iterator = set.iterator(); iterator.hasNext(); ) {
            String temp = iterator.next();
            System.out.println(temp);
        }
    }

    public static void testIteratorMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "zyx");
        map.put(2, "lly");
        map.put(3, "wbq");
        map.put(0, "none");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Iterator<Map.Entry<Integer, String>> iterator = set.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> temp = iterator.next();
            System.out.println(temp);
        }
    }

}
