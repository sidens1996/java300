package world.zyx.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestMap
 * @Description: 测试HashMap
 * @Author: Achilles
 * @Date: 13/12/2019  19:47
 * @Version: 1.0
 **/

public class TestMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "lly");
        map.put(2, "wbq");

        System.out.println(map.get(1));

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(3, "zyx");
        map.putAll(map1);
        System.out.println(map);

        Employee employee = new Employee(1001, "zyx", 20000);
        Employee employee1 = new Employee(1002, "lly", 20000);
        Employee employee2 = new Employee(1003, "wbq", 20000);

        Map<Integer, Employee> map2 = new HashMap<>();
        map2.put(employee.getId(), employee);
        map2.put(employee1.getId(), employee1);
        map2.put(employee2.getId(), employee2);
    }
}

class Employee{
    private int id;
    private String ename;
    private double salary;

    public int getId() {
        return id;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int id, String ename, double salary) {
        this.id = id;
        this.ename = ename;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:" + id + ",name:" + ename + ",salary" + salary;
    }
}
