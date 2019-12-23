package world.zyx.io;

import java.io.*;

/**
 * @ClassName: IOTest4
 * @Description: 文件对拷
 * 使用文件字节输入流和文件字节输出流
 * @Author: Achilles
 * @Date: 15/12/2019  20:41
 * @Version: 1.0
 **/

public class TestIO4 {

    public static void main(String[] args) {
        File src = new File("test.txt");
        File dest = new File("test2.txt");
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest, true);
            byte[] flush = new byte[1024];//每次读1k
            int len = -1;//接收长度
            while ((len = fis.read(flush)) != -1) {
                fos.write(flush, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null && fos != null) {
                fos.close();
                fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
