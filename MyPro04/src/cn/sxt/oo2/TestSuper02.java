package cn.sxt.oo2;

/**
 * @ClassName: TestSuper02
 * @Description: 测试uper在构造方法中的应用
 * @Author: Achilles
 * @Date: 06/07/2019  13:19
 * @Version: 1.0
 **/

public class TestSuper02 {
    public static void main(String[] args) {
        System.out.println("开始创建一个ChildClasss对象");
        new ChildClass2();
    }
}

class FatherClass2{
    public FatherClass2() {
        System.out.println("创建FatherClass");
    }
}

//子类的构造器在运行时会默认先运行父类的构造器方法，静态初始化块同理
class ChildClass2 extends  FatherClass2{
    public ChildClass2(){
        //super();//默认有
        System.out.println("创建ChildClass");
    }
}