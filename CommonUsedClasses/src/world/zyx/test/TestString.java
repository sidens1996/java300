package world.zyx.test;

/**
 * @ClassName: TestString
 * @Description: 测试String类
 * @Author: Achilles
 * @Date: 11/12/2019  14:45
 * @Version: 1.0
 **/

public class TestString {

    public static void main(String[] args) {
        String str = "1223";
        str = "11";

        String str1 = "hello" + " java";
        String str2 = "hello java";
        System.out.println(str1 == str2);//true

        String str3 = "hello";
        String str4 = " java";
        String str5 = str3 + str4;
        System.out.println(str2 == str5);//false
    }
}
