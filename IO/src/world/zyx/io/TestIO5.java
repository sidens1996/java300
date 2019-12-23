package world.zyx.io;

import java.io.*;

/**
 * @ClassName: TestIO5
 * @Description: 实现文件夹拷贝
 * @Author: Achilles
 * @Date: 15/12/2019  20:54
 * @Version: 1.0
 **/

public class TestIO5 {

    public static void main(String[] args) {
        TestIO5 test = new TestIO5();
        //test.copyFile("test.txt","test3.txt");
        test.copyDirectory(new File("E:/code_in_IDEA/IO"),new File("E:/code_in_IDEA/IO/test"));
    }
    public void copyDirectory(File src, File dest) {
        if (src != null && src.exists()) {
            if (src.isDirectory()) {
                if (!dest.exists()) {
                    dest.mkdirs();
                }
                String[] files = src.list();
                if (files != null) {
                    for (String file : files) {
                        File srcFile = new File(src, file);//活用构造方法
                        File destFile = new File(dest, file);
                        copyDirectory(srcFile, destFile);
                    }
                }
            } else {
                copyFile(src.toString(), dest.toString());
            }
        }
    }

    public void copyFile(String srcString, String destString) {
        File src = new File(srcString);
        File dest = new File(destString);
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);
            byte[] flush = new byte[1024 * 1024];
            int len = -1;
            while ((len = fis.read(flush)) != -1) {
                fos.write(flush, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
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
