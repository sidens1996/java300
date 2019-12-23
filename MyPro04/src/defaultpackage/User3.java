/**
 *
 * 测试静态初始化块的使用
 * @author zyx
 *
 */
package defaultpackage;

public class User3 {

    int id;
    String name;
    String pwd;
    static String company;

    public User3(){
        System.out.println("调用构造器方法");
    }
    static {
        System.out.println("执行类的初始化工作");
        company = "北京尚学堂";
        printCompany();
    }

    public static void printCompany(){
        System.out.println(company);
    }

    public static void main(String[] args) {
        User3 u3 = new User3();
    }
}
