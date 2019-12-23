package cn.sxt.oo;

/**
 * @ClassName: Animal
 * @Description: TODO
 * @Author: Achilles
 * @Date: 10/12/2019  15:04
 * @Version: 1.0
 **/

public abstract class Animal {

    public abstract void shout();

    public void run(){
        System.out.println("跑！");
    }

    static void animalCry(Animal animal) {
        animal.shout();
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        Animal b = new Cat();
        animalCry(a);
        animalCry(b);
    }
}

class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("汪汪汪" );
    }
}

class Cat extends Animal {

    @Override
    public void shout() {
        System.out.println("喵喵猫！");
    }
}
