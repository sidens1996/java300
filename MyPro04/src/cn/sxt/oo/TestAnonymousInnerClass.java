package cn.sxt.oo;

/**
 * @ClassName: TestAnonymousInnerClass
 * @Description: 测试匿名内部类
 * @Author: Achilles
 * @Date: 10/12/2019  18:04
 * @Version: 1.0
 **/

public class TestAnonymousInnerClass {

    public static void test01(AA aa) {
        aa.aa();
    }

    public static void main(String[] args) {
        TestAnonymousInnerClass.test01(new AA() {
            @Override
            public void aa() {
                System.out.println("TestAnonymousInnerClass.aa");
            }
        });

    }
}

interface AA {
    void aa();
}
