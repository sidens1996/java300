package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestPrintStream
 * @Description: 测试打印流，打印流也是装饰流的一种
 * @Author: Achilles
 * @Date: 18/12/2019  15:45
 * @Version: 1.0
 **/

public class TestPrintStream {

    public static void main(String[] args) throws FileNotFoundException {
        PrintStream printStream = new PrintStream(System.out);
        printStream.println("this is a test!");

        printStream = new PrintStream(new FileOutputStream("print.txt"));
        printStream.println("this is a test");
        printStream.flush();

        System.setOut(printStream);
        System.out.println("this is a test");

        printStream = new PrintStream(new FileOutputStream(FileDescriptor.out));
        System.setOut(printStream);
        System.out.println("I am back");

        printStream.close();
    }
}
