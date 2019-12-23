package cn.sxt.oo2;

/**
 * @ClassName: TestOverride
 * @Description: 测试重写
 * @Author: Achilles
 * @Date: 04/07/2019  16:16
 * @Version: 1.0
 **/

public class TestOverride {

}

class Vehicle {
    public void run(){
        System.out.println("跑...");
    }

    public void stop(){
        System.out.println("停止！");
    }

    public int exception(){
        return 1;
    }

    public Person whoIsPsg(){
        return new Person();
    }
}

class Horse extends Vehicle {
    @Override
    public void run(){
        System.out.println("四蹄翻飞，嘚嘚...");
    }

    /*
    @Override
    public double exception(){
        return 1.0;
    }
    *返回值类型要相同，可以是父类和子类的关系，但子类的返回值类型必须要小于等于父类
    */

    @Override
    public Student whoIsPsg(){
        return new Student();
    }
}
