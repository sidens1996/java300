package zyx.world.thread;

/**
 * @ClassName: TestLambda2
 * @Description: TODO
 * @Author: Achilles
 * @Date: 19/12/2019  15:42
 * @Version: 1.0
 **/

public class TestLambda2 {
    public static void main(String[] args) {
        Sayable pupil = new Pupil();
        pupil.bb("rubbish");

        String string = "msg";
        Sayable pupilA = (String words)->{
            System.out.println(words);
        };
        pupilA.bb(string);
    }
}

interface Sayable {
    void bb(String words);
}

class Pupil implements Sayable {

    @Override
    public void bb(String words) {
        System.out.println(words);
    }
}


