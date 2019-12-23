package cn.sxt.oo;

/**
 * @ClassName: TestString
 * @Description: 测试字符串
 * @Author: Achilles
 * @Date: 10/12/2019  18:35
 * @Version: 1.0
 **/

public class TestString {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = "abc";
        String str3 = new String("abc");

        System.out.println(str == str2);//true
        System.out.println(str == str3);//false



    }
}
