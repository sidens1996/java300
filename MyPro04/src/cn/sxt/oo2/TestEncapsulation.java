package cn.sxt.oo2;

/**
 * @ClassName: TestEncapsulation
 * @Description: 测试封装
 * @Author: Achilles
 * @Date: 09/07/2019  14:38
 * @Version: 1.0
 **/

public class TestEncapsulation {
    public static void main(String[] args) {
        Human h = new Human();
        //h.age = 13;//是有属性不可见
        h.name = "zyx";
    }
}

class Boy  extends Human{
    void sayHello(){
//        System.out.println(age);
//    私有属性不可见
    }
}
