package cn.sxt.oo;

/**
 * @ClassName: TestInterface
 * @Description: 测试接口和实现类
 * @Author: Achilles
 * @Date: 24/07/2019  09:19
 * @Version: 1.0
 **/

public class TestInterface  {
    public static void main(String[] args) {
        Volant v = new Angel();
        v.fly();

        Honest h = new GoodMan();
        h.helpOthers();
    }
}

/**
 * 飞行接口
 */
interface Volant{
    int FLY_HEIGHT = 1000;
    void fly();
}

/**
 * 善良接口
 */
interface Honest {
    void helpOthers();
}

class Angel implements Volant,Honest {
    //实现类可以实现多个父接口
    @Override
    public void helpOthers() {
        System.out.println("Angel.helpOthers()");
    }

    @Override
    public void fly() {
        System.out.println("Angel.fly()");
    }
}

class GoodMan implements Honest{
    @Override
    public void helpOthers() {
        System.out.println("GoodMan.helpOthers()");
    }
}

class BirdMan implements Volant {
    @Override
    public void fly() {
        System.out.println("BirdMan.fly()");
    }
}