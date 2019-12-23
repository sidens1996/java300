package cn.sxt.oo2;

import java.util.Objects;

/**
 * @ClassName: TestEquals
 * @Description: 测试equals方法
 * @Author: Achilles
 * @Date: 05/07/2019  17:15
 * @Version: 1.0
 **/

public class TestEquals {
    public static void main(String[] args) {
        Object obj;
        String str;

        User u1 = new User(100,"zyx","gghhjj");
        User u2 = new User(100,"zyx","gghhjj");

        System.out.println(u1 == u2);
        System.out.println(u1.equals(u2));

        String str1 = new String("sxt");
        String str2 = new String("sxt");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}

class User{
    int id;
    String name;
    String pwd;

    public User(int id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }
}

