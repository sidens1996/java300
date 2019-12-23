package world.zyx.decorator;

/**
 * @ClassName: Decorate1
 * @Description: 实现放大器对声音的放大功能
 * @Author: Achilles
 * @Date: 17/12/2019  19:18
 * @Version: 1.0
 **/

public class Decorate1 {

    public static void main(String[] args) {
        Person p = new Person();
        p.say();

        Amplifier amplifier = new Amplifier(p);
        amplifier.say();
    }
}

interface Say {
    void say();
}

class Person implements Say {

    private int voice = 10;

    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    @Override
    public void say() {
        System.out.println("人的声音为：" + this.getVoice());
    }
}

class Amplifier implements Say {

    private Person person;

    Amplifier(Person person) {
        this.person = person;
    }

    @Override
    public void say() {
        System.out.println("人的声音为：" + person.getVoice() * 100);
    }
}