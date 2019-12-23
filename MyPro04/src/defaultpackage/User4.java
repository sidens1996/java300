/**
 * 测试值的引用
 * @author zyx
 */
package defaultpackage;

public class User4 {

    int id;
    String name;
    String pwd;

    public User4(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void testParameterTrandfer01(User4 u){
        u.name = "高小八";
    }

    public void testParameterTransfer02(User4 u){
        u = new User4(124,"高小九");
    }

    public static void main(String[] args) {
        User4 u4 = new User4(100,"高小七");

        u4.testParameterTrandfer01(u4);
        System.out.println(u4.name);

        u4.testParameterTransfer02(u4);
        System.out.println(u4.name);
    }
}
