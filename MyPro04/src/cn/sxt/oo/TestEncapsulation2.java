package cn.sxt.oo;

import cn.sxt.oo2.*;
/**
 * @ClassName: TestEncapsulation2
 * @Description: TODO
 * @Author: Achilles
 * @Date: 09/07/2019  14:47
 * @Version: 1.0
 **/

public class TestEncapsulation2 {
    public static void main(String[] args) {
        Human h = new Human();
    }
}

class Girl extends Human {
    void sayGood() {
        System.out.println(height);
    }
}