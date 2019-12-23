package world.zyx.test;

/**
 * @ClassName: TestSelfCreatedException
 * @Description: 测试自定义异常
 * @Author: Achilles
 * @Date: 12/12/2019  14:21
 * @Version: 1.0
 **/

public class TestSelfCreatedException {

    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(-1);

    }

}

class IllegalException extends RuntimeException {

    public IllegalException() {
        //空构造器
    }

    public IllegalException(String msg) {
        super(msg);
    }
}

class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalException("年龄不能为负数");
        }

        this.age = age;
    }
}