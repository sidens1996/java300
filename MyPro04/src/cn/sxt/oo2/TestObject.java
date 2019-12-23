package cn.sxt.oo2;

/**
 * @ClassName: TestObject
 * @Description: 测试Object类
 * @Author: Achilles
 * @Date: 05/07/2019  15:09
 * @Version: 1.0
 **/

public class TestObject {
    public static void main(String[] args) {
        Object obj;
        TestObject to = new TestObject();
        System.out.println(to.toString());

        System.out.println(new Pupil("zyx",22).toString());
    }

    @Override
    public String toString(){
        return "测试Object对象";
    }
}

class Pupil extends Student {
    int age;

    public Pupil(String name,int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString(){
        return this.name + "," + this.age;
    }
}