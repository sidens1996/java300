package cn.sxt.oo;

/**
 * @ClassName: TestStaticInnerClass
 * @Description: TODO
 * @Author: Achilles
 * @Date: 10/12/2019  16:31
 * @Version: 1.0
 **/

public class TestStaticInnerClass {
    public static void main(String[] args) {
        Outer2.InnerClass2 innerClass2 = new Outer2.InnerClass2();
        Outer2 outer2 = new Outer2();
        System.out.println(Outer2.InnerClass2.age);
    }
}

class Outer2 {

    int age =20;

    void show() {
        System.out.println(InnerClass2.age);
    }
    static class InnerClass2 {
        static int age = 10;

        void show() {
            System.out.println(this.age);
            //System.out.println(Outer2.this.age);//错误写法
        }
    }


}
