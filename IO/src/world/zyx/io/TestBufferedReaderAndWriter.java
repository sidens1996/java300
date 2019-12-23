package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestBufferedReaderAndWriter
 * @Description: 测试BufferedReader和BufferedWriter
 * @Author: Achilles
 * @Date: 17/12/2019  21:01
 * @Version: 1.0
 **/

public class TestBufferedReaderAndWriter {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("test.txt");
            FileWriter fileWriter = new FileWriter("test4.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            copy(bufferedReader, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(BufferedReader bufferedReader, BufferedWriter bufferedWriter) {
        try {
            String string = null;
            while ((string = bufferedReader.readLine()) != null) {
                bufferedWriter.write(string);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
