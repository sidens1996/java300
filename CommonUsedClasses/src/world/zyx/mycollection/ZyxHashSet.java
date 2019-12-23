package world.zyx.mycollection;

import java.util.HashMap;

/**
 * @ClassName: ZyxHashSet
 * @Description: 自定义HashSet
 * @Author: Achilles
 * @Date: 14/12/2019  19:13
 * @Version: 1.0
 **/

public class ZyxHashSet<E> {

    HashMap<E,Object> map;
    private static final Object PRESENT = new Object();

    public ZyxHashSet() {
        map = new HashMap();
    }

    public void add(E e) {
        map.put(e, PRESENT);
    }

    public int size() {
        return map.size();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for (E e : map.keySet()) {
            stringBuilder.append(e).append(",");
        }
        stringBuilder.setCharAt(stringBuilder.length() - 1, ']');
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ZyxHashSet<String> hashSet = new ZyxHashSet();
        hashSet.add("zyx");
        hashSet.add("lly");
        hashSet.add("wbq");
        System.out.println(hashSet);
    }
}
