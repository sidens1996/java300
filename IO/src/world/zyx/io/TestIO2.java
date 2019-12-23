package world.zyx.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName: TestIO2
 * @Description: 测试IO
 * 文件字节输入流
 * @Author: Achilles
 * @Date: 15/12/2019  20:01
 * @Version: 1.0
 **/

public class TestIO2 {

    public static void main(String[] args) {

        File file = new File("test.txt");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = fis.read(flush)) != -1) {
                //字节数组->字符串
                String result = new String(flush, 0, len);
                System.out.println(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
