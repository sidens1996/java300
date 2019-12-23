package world.zyx.test;

import java.util.*;

/**
 * @ClassName: TestStoreTable
 * @Description: 测试用集合存储表格的方法
 * 使用map存储表格的一行
 * 然后用List存储整个表格
 * @Author: Achilles
 * @Date: 15/12/2019  13:41
 * @Version: 1.0
 **/

public class TestStoreTable1 {

    public static void main(String[] args) {
        Map<String, Object> map1 = new HashMap<>();
        map1.put("ID", 1000);
        map1.put("name", "zyx");
        map1.put("salary", "20000");

        Map<String, Object> map2 = new HashMap<>();
        map2.put("ID", 1001);
        map2.put("name", "lly");
        map2.put("salary", 4000);

        Map<String, Object> map3 = new HashMap<>();
        map3.put("ID", 1002);
        map3.put("name", "wbq");
        map3.put("salary", 10000);

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(map1);
        list.add(map2);
        list.add(map3);

        //遍历
        for (Map<String, Object> stringObjectMap : list) {
            Set<String> keySet = stringObjectMap.keySet();
            for (String s : keySet) {
                System.out.print(s + ":" + stringObjectMap.get(s) + "\t");
            }
            System.out.println();
        }
    }
}
