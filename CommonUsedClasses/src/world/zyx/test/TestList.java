package world.zyx.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestList
 * @Description: 测试ArrayList
 * @Author: Achilles
 * @Date: 12/12/2019  16:51
 * @Version: 1.0
 **/

public class TestList {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");

        List<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("dd");
        list2.add("ee");
        System.out.println("list1" + list1);
        list1.retainAll(list2);
        System.out.println(list1);
        list1.addAll(list2);
        System.out.println(list1.containsAll(list2));
    }

    public static void test2() {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list);
        list.add(2, "邹宇轩");//源码涉及到扩容
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.set(2, "zyx");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("zyx"));

    }
}
