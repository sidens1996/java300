package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestIO3
 * @Description: 测试IO
 * 文件字节输出流
 * @Author: Achilles
 * @Date: 15/12/2019  20:24
 * @Version: 1.0
 **/

public class TestIO3 {
    public static void main(String[] args) {
        File file = new File("test2.txt");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file,true);//允许append
            String msg = "this is a test\r\n";
            byte[] flush = msg.getBytes();
            fos.write(flush, 0, flush.length);
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
