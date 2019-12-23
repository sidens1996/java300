package zyx.world.thread;

/**
 * @ClassName: StaticProxy
 * @Description: 测试静态代理
 * @Author: Achilles
 * @Date: 19/12/2019  14:48
 * @Version: 1.0
 **/

public class StaticProxy {

    public static void main(String[] args) {
        new WeddingCompany(new Person("zyx")).Marry();
    }
}

interface Marry {
    void Marry();
}

class Person implements Marry {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void Marry() {
        System.out.println(this.name + "结婚了！");
    }
}

class WeddingCompany implements Marry {

    private Person person;

    public WeddingCompany(Person person) {
        this.person = person;
    }

    @Override
    public void Marry() {
        before();
        this.person.Marry();
        after();
    }

    private void before() {
        System.out.println("事前");
    }

    private void after() {
        System.out.println("事后");
    }
}
