package world.zyx.io;

import java.io.*;

/**
 * @ClassName: FileUtils
 * @Description: 手写文件工具类
 * 1.封装文件拷贝方法，只需传入流即可
 * 2.封装try catch释放资源
 * 3.使用JDK7检测释放资源
 * @Author: Achilles
 * @Date: 17/12/2019  17:18
 * @Version: 1.0
 **/

public class FileUtils {
    public static void main(String[] args) {
        copyPicture();
    }

    public static void copyPicture() {
        // 图片到程序        FileInputStream
        // 程序到字节数组      ByteArrayOutputStream
        // 字节数组到程序      ByteArrayInputStream
        // 程序到图片        FileOutputStream
        try {
            FileInputStream fileInputStream = new FileInputStream("wbq.jpg");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            copy(fileInputStream, byteArrayOutputStream);
            byte[] datas = byteArrayOutputStream.toByteArray();
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(datas);
            FileOutputStream fileOutputStream = new FileOutputStream("wbq_copy_2.jpg");
            copy(byteArrayInputStream, fileOutputStream);
            close(fileOutputStream,byteArrayInputStream,byteArrayOutputStream,fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 对接输入输出流 封装
    public static void copy(InputStream inputStream, OutputStream outputStream) {
        try {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = inputStream.read(flush)) != -1) {
                outputStream.write(flush, 0, len);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            close(inputStream,outputStream);
        }
    }

    public static void close(Closeable... ios) {
        for (Closeable io : ios) {
            try {
                if (io != null) {
                    io.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
