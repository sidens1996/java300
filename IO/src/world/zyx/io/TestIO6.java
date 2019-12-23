package world.zyx.io;

import java.io.*;

/**
 * @ClassName: IOTest6
 * @Description: 测试FileReader，FileWriter
 * @Author: Achilles
 * @Date: 17/12/2019  14:53
 * @Version: 1.0
 **/

public class TestIO6 {

    public static void main(String[] args) {
        File src = new File("test.txt");
        File dest = new File("dest.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(src);
            fileWriter = new FileWriter(dest,true);
            char[] flush = new char[1024];
            int len = -1;
            while ((len = fileReader.read(flush)) != -1) {
                fileWriter.write(flush, 0, len);
                fileWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }
}
