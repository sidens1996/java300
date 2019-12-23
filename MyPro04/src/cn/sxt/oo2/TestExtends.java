package cn.sxt.oo2;

/**
 * @ClassName: TestExtends
 * @Description: 测试Extends
 * @Author: Achilles
 * @Date: 04/07/2019  14:01
 * @Version: 1.0
 **/

public class TestExtends {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "zyx";
        stu.height = 178;
        stu.rest();

        Student stu2 = new Student("zyx",178,"se");

        System.out.println(stu2 instanceof Student);

        System.out.println(stu2 instanceof Person);

        System.out.println(stu2 instanceof Object);
    }
}

class Person extends Object{
    String name;
    int height;

    public void rest(){
        System.out.println("休息一会儿！！");
    }
}

class Student extends Person{
    String major;

    public Student(){

    }

    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }

    public void study(){
        System.out.println("学习两小时！");
    }
}
