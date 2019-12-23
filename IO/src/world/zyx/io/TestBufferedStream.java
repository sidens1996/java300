package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestBuffered
 * @Description: 测试BufferedInputStream和BufferedOutputStream
 * @Author: Achilles
 * @Date: 17/12/2019  20:13
 * @Version: 1.0
 **/

public class TestBufferedStream {

    public static void main(String[] args) {
        //测试下用缓存流和不用缓存流的时间对比
        long time1 = System.currentTimeMillis();
        System.out.println(time1);
        bufferedCopy();
        long time2 = System.currentTimeMillis();
        System.out.println(time2);
        System.out.println("用缓冲流所花费时间：" + (time2 - time1) / 1000.0);//78.768
        long time3 = System.currentTimeMillis();
        fileCopy();
        long time4 = System.currentTimeMillis();
        System.out.println(time4);
        System.out.println("不用缓冲流所花费时间：" + (time4 - time3) / 1000.0);//100.331
    }

    public static void bufferedCopy() {
        try {
            InputStream inputStream = new FileInputStream("G:/迅雷下载/ADN095 AVI/ADN095.avi");
            OutputStream outputStream = new FileOutputStream("G:/迅雷下载/test.avi");
            InputStream bufferedInputStream = new BufferedInputStream(inputStream);
            OutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
            FileUtils.copy(bufferedInputStream, bufferedOutputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileCopy() {
        try {
            InputStream inputStream = new FileInputStream("G:/迅雷下载/ADN095 AVI/ADN095.avi");
            OutputStream outputStream = new FileOutputStream("G:/迅雷下载/test1.avi");
            FileUtils.copy(inputStream, outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
