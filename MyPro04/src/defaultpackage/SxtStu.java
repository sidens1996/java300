package defaultpackage;
//一个java文件可以有多个类，但只能有一个public类，且这个public类名和文件名一样

public class SxtStu {

    //属性
    int id;
    String name;
    int age;

    //方法

    SxtStu(){

    }//构造方法，用于创建这个类的对象，无参的构造方法可以由系统自动创建
    void strdy(){
        System.out.println("我在学习！");
    }
    void play(){
        System.out.println("我在玩游戏！");
    }

    public static void main(String[] args) {
        SxtStu stu = new SxtStu();
        stu.play();
    }

}

class Computer{


}
