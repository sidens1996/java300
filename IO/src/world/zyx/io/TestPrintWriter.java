package world.zyx.io;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * @ClassName: TestPrintWriter
 * @Description: 测试PrintWriter
 * @Author: Achilles
 * @Date: 18/12/2019  15:58
 * @Version: 1.0
 **/

public class TestPrintWriter {

    public static void main(String[] args) throws FileNotFoundException {

        PrintWriter printWriter = new PrintWriter("printWriter.txt");
        printWriter.println("this is a test");
        printWriter.println(true);
        printWriter.close();

    }
}
