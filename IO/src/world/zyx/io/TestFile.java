package world.zyx.io;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * @ClassName: TestFile
 * @Description: 测试File类
 * 构建File对象
 * 相对路径和绝对路径
 * 名称或路径
 * 文件状态
 * 文件长度
 * @Author: Achilles
 * @Date: 15/12/2019  15:43
 * @Version: 1.0
 **/

public class TestFile {

    public static void main(String[] args) throws IOException {
        String path = "G:/迅雷下载/ADN095 AVI/ADN095.avi";
        File src = new File(path);
        System.out.println(src.length());
        System.out.println(System.getProperty("user.dir"));
        System.out.println("名称:" + src.getName());
        System.out.println("路径:" + src.getPath());
        System.out.println("绝对路径：" + src.getAbsolutePath());
        System.out.println("父目录" + src.getParent());
        System.out.println(src.isAbsolute());
        System.out.println(src.exists());
        System.out.println(src.isDirectory());
        System.out.println(src.isFile());
        if (src.isFile()) {
            System.out.println(src.length());
        }
        File file = new File("test.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        file.delete();
        file = new File("com2");
        System.out.println(file.createNewFile());

        System.out.println("=");
        File dir = new File("test/test.txt");
        System.out.println(dir.mkdir());
        //System.out.println(dir.mkdirs());
        System.out.println("==");
        dir = new File("D:/");
        System.out.println(Arrays.deepToString(dir.list()));
        System.out.println(Arrays.deepToString(dir.listFiles()));
        System.out.println(Arrays.deepToString(File.listRoots()));
        System.out.println("===");

        //recursionDirectory(new File("C:/"), 0);
        directoryLength(new File("C:/"));
        System.out.println(TestFile.size);
    }

    static void recursionDirectory(File file, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (file == null ||!file.exists()) {
            return;
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    recursionDirectory(f, level + 1);
                }
            }
        }
    }
//    static void recursionDirectory(File file, int level) {
//        if (file.isDirectory()) {
//            File[] files = file.listFiles();
//            if (files != null){
//                for (File f : files) {
//                    recursionDirectory(f, level + 1);
//                }
//            }
//        } else {
//            for (int i = 0; i < level; i++) {
//                System.out.print("-");
//            }
//
//        }
//    }


    private static long size;
    static void directoryLength(File file) {
        if (file != null || file.exists()) {
            if (file.isFile()) {
                size += file.length();
            } else {
                File[] files = file.listFiles();
                if (files != null) {
                    for (File f : files) {
                        directoryLength(f);
                    }
                }
            }
        }
    }

}
