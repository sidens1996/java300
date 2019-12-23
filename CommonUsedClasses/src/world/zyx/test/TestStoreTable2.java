package world.zyx.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestStoreTable2
 * @Description: 测试存储表格数据2
 * 使用JavaBean存储表格一行
 * 使用List或者Map存储整个表格
 * @Author: Achilles
 * @Date: 15/12/2019  13:56
 * @Version: 1.0
 **/

public class TestStoreTable2 {
    public static void main(String[] args) {
        User user = new User(1001, "zyx", 20000, "2018.01.10");
        User user1 = new User(1002, "lly", 4000, "2019.01.10");
        User user2 = new User(1003, "wbq", 10000, "2019.10.10");

        List<User> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);

        for (User u : list) {
            System.out.println(u);
        }
    }
}

class User {
    private int id;
    private String name;
    private double salary;
    private String hireData;

    //一个完整的Java Bean,要有set和get方法，以及无参构造器
    public User() {
    }

    public User(int id, String name, double salary, String hireData) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireData = hireData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getHireData() {
        return hireData;
    }

    public void setHireData(String hireData) {
        this.hireData = hireData;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", hireData='" + hireData + '\'' +
                '}';
    }
}
