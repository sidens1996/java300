package cn.sxt.oo2;

/**
 * @ClassName: TestPolym
 * @Description: TODO
 * @Author: Achilles
 * @Date: 09/12/2019  21:30
 * @Version: 1.0
 **/

public class TestPolym {
    static void animalCry(Animal animal) {
        animal.shout();
    }

    public static void main(String[] args) {
        Animal a = new Animal();
        animalCry(a);
        Animal b = new Dog();
        animalCry(b);
        Animal c = new Cat();
        animalCry(c);
    }

}

class Animal {
    public void shout() {
        System.out.println("叫了一身！");
    }
}

class Dog extends Animal {

    @Override
    public void shout() {
        System.out.println("汪汪汪");
    }
}

class Cat extends Animal {
    @Override
    public void shout() {
        System.out.println("喵喵喵");
    }
}


