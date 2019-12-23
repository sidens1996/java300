package world.zyx.test;

import java.util.Map;
import java.util.TreeMap;

/**
 * @ClassName: TestTreeMap
 * @Description: 测试TreeMap
 * @Author: Achilles
 * @Date: 14/12/2019  17:28
 * @Version: 1.0
 **/

public class TestTreeMap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "zyx");
        map.put(2, "lly");
        map.put(3, "wbq");

        for (Integer integer : map.keySet()) {
            System.out.println("key:" + integer + ",value:" + map.get(integer));
        }

        Map<Emp, String> map1 = new TreeMap<>();
        map1.put(new Emp(1001, "zyx", 20000), "zyx");
        map1.put(new Emp(1002, "lly", 20000), "lly");
        map1.put(new Emp(1003, "wbq", 20000), "wbq");
        for (Emp emp : map1.keySet()) {
            System.out.println("key:" + emp + ",value:" + map1.get(emp));
        }
    }
}

class Emp implements Comparable<Emp> {

    private int id;
    private String name;
    private double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:" + id + ",name:" + name + ",salary:" + salary;
    }

    @Override
    public int compareTo(Emp o) {
        if (this.salary > o.salary) {
            return 1;
        } else if (this.salary < o.salary) {
            return -1;
        } else {
            if (this.id > o.id) {
                return 1;
            } else if (this.id < o.id) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

