package world.zyx.test;

/**
 * @ClassName: TestGeneric
 * @Description: 测试泛型
 * @Author: Achilles
 * @Date: 12/12/2019  15:07
 * @Version: 1.0
 **/

public class TestGeneric {
    public static void main(String[] args) {
        MyCollection<String> myCollection = new MyCollection<String>();
        myCollection.set("zyx", 0);
        myCollection.set("wzy", 1);
        myCollection.set("lly", 2);
        myCollection.set("wbq", 3);

        System.out.println(myCollection.get(3));
    }
}

class MyCollection <E>{
    Object[] objs = new Object[5];

    public void set(E e, int index) {
        objs[index] = e;
    }

    public E get(int index) {
        return (E) objs[index];
    }
}
