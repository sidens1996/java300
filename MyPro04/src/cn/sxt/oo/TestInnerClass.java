package cn.sxt.oo;

/**
 * @ClassName: TestInnerClass
 * @Description: 测试非静态内部类
 * @Author: Achilles
 * @Date: 24/07/2019  10:21
 * @Version: 1.0
 **/

public class TestInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();

        //创建内部类对象
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}

class Outer {
    private int age = 10;

    public void testOuter(){
        System.out.println("Outer.testOuter()");
        Inner a = new Inner();
        a.age = 10;
    }

    class Inner {
        //非静态内部类不能有静态方法，静态属性和静态初始化快
        int age = 20;
        public void  show(){
            int age = 30;
            System.out.println("外部类的成员变量age:"+Outer.this.age);
            System.out.println("内部类的成员变量age:"+this.age);
            System.out.println("局部变量age:"+age);
        }
    }
}