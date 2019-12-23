package world.zyx.test;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: TestFile
 * @Description: 测试File类的基本用法
 * @Author: Achilles
 * @Date: 11/12/2019  20:31
 * @Version: 1.0
 **/

public class TestFile {

    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("user.dir"));
        File file = new File("gg.txt");
        file.createNewFile();
    }
}
