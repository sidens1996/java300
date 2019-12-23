package cn.sxt.oo;

/**
 * @ClassName: TestInterface2
 * @Description: 接口支持多继承
 * @Author: Achilles
 * @Date: 24/07/2019  10:10
 * @Version: 1.0
 **/

public class TestInterface2 {
}

interface A {
    void testA();
}

interface B {
    void testB();
}

//接口可以多继承
interface C extends A,B {
    void testC();
}

class Test implements C {
    @Override
    public void testA() {

    }

    @Override
    public void testB() {

    }

    @Override
    public void testC() {

    }
}