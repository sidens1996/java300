package cn.sxt.oo;

public interface MyInterface {

    /**
     * 接口的访问修饰符只能是Public或默认
     * 接口中一定是常量，没有变量
     * 方法都是抽象方法
     */

    /*public static final*/ int MAX_AGE = 100;

    public abstract void test01();
}

class MyClass implements MyInterface{
    @Override
    public void test01(){
        System.out.println(MAX_AGE);
        System.out.println("MyClass.test01()");
    }
}
