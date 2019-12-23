package world.zyx.test;

/**
 * @ClassName: TestStringBuilder
 * @Description: 测试StringBuilder
 * @Author: Achilles
 * @Date: 11/12/2019  15:08
 * @Version: 1.0
 **/

public class TestStringBuilder {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append((char)('a' + i));
        }
        System.out.println(sb.toString());

        System.out.println(sb.reverse().toString());

        System.out.println(sb.toString());

        System.out.println(sb.insert(0,"邹").insert(2,"宇").insert(4,"轩").toString());
    }
}
