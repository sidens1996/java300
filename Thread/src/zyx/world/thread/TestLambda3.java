package zyx.world.thread;

/**
 * @ClassName: TestLambda3
 * @Description: 测试Lambda表达式
 * @Author: Achilles
 * @Date: 19/12/2019  16:01
 * @Version: 1.0
 **/

public class TestLambda3 {
    public static void main(String[] args) {
        addAble A = (int a, int b) -> a + b;
        System.out.println(A.add(1, 3));
    }
}

interface addAble {
    int add(int a, int b);
}

