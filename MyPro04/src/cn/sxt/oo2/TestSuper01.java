package cn.sxt.oo2;

/**
 * @ClassName: TestSuper01
 * @Description: 测试super
 * @Author: Achilles
 * @Date: 06/07/2019  13:05
 * @Version: 1.0
 **/

public class TestSuper01 {
    public static void main(String[] args) {
        new ChildClass().f();
    }
}

class FatherClass {
    public int value;
    public void f() {
        value = 100;
        System.out.println("FatherClass.value = "+value);
    }
}

class ChildClass extends  FatherClass {
    public int value;
    @Override
    public void f(){
        super.f();
        value = 200;
        System.out.println("ChileClass.value = " + value);
        System.out.println(value);
        System.out.println(super.value);
    }
}