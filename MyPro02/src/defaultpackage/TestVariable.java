package defaultpackage;

/**
 * @author zyx
 */
public class TestVariable {

    int a = 4;//成员变量，从属于对象，成员变量会自动被初始化

    static int b = 5;//静态变量，从属于类

    public static void main(String[] args) {

        {
            int a = 3;//局部变量，从属于语句块
        }
    }
}
