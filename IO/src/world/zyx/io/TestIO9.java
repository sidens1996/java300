package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestIO9
 * @Description: 测试字符数组输入输出流作为读取图片的中转
 * 1.图片读取到字节数组
 * 2.字节数组写出到文件
 * 流的对接
 * @Author: Achilles
 * @Date: 17/12/2019  15:46
 * @Version: 1.0
 **/

public class TestIO9 {
    public static void main(String[] args) {
        File src = new File("wbq.jpg");
        File dest = new File("wbq_copy.jpg");
        byte[] data = fileToByteArray(src.toString());
        System.out.println(data.length);
        byteArrayToFile(data,dest.toString());
        testFileInputOutputStreamWithJPG();
    }

    // 从图片到程序       FileInputStream
    // 从程序到字节数组     ByteArrayOutputStream
    public static byte[] fileToByteArray(String filePath) {
        File src = new File(filePath);
        FileInputStream fileInputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            fileInputStream = new FileInputStream(src);
            byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = fileInputStream.read(flush)) != -1) {
                byteArrayOutputStream.write(flush, 0, len);
            }
            byteArrayOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (byteArrayOutputStream!=null) {
                    byteArrayOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    // 从字节数组到程序     ByteArrayInputStream
    // 从程序到图片       FileOutputStream
    public static void byteArrayToFile(byte[] src, String filePath) {
        File dest = new File(filePath);
        ByteArrayInputStream byteArrayInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(src);
            fileOutputStream = new FileOutputStream(dest);
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = byteArrayInputStream.read(flush)) != -1) {
                fileOutputStream.write(flush, 0, len);
            }
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (byteArrayInputStream!=null) {
                    byteArrayInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void testFileInputOutputStreamWithJPG() {
        File src = new File("wbq_copy.jpg");
        File dest = new File("wbq_copy_1.jpg");
        InputStream fileInputStream = null;
        OutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(src);
            fileOutputStream = new FileOutputStream(dest);
            byte[] flush = new byte[1024 * 10];
            int len = -1;
            while ((len = fileInputStream.read(flush)) != -1) {
                fileOutputStream.write(flush,0,len);
                fileOutputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
