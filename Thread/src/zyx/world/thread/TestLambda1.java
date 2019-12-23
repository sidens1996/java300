package zyx.world.thread;

/**
 * @ClassName: TestLambda1
 * @Description: 测试Lambda表达式
 * @Author: Achilles
 * @Date: 19/12/2019  15:32
 * @Version: 1.0
 **/

public class TestLambda1 {
    public static void main(String[] args) {
        new Bbable() {
            @Override
            public void bb() {
                System.out.println("bb");
            }
        }.bb();

        Bbable rubbish = new Rubbish();
        rubbish.bb();

        rubbish = ()->{
            System.out.println("rubbish people like bbing");
        };

        rubbish.bb();



    }
}

interface Bbable {
    void bb();
}

class Rubbish implements Bbable {

    @Override
    public void bb() {
        System.out.println("rubbish bb");
    }
}