package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestIO
 * @Description: 测试IO
 * 理解操作步骤
 * 1.创建流
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * @Author: Achilles
 * @Date: 15/12/2019  19:33
 * @Version: 1.0
 **/

public class TestIO1 {

    public static void main(String[] args) {

        //1.创建流
        File file = new File("test.txt");
        //2.选择流
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            //3.操作
            int temp = 0;
            while ((temp = fis.read()) != -1) {
                System.out.println((char) temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

