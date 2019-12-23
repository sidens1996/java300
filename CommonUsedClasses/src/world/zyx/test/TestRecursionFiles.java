package world.zyx.test;

import java.io.File;

/**
 * @ClassName: TestRecursionFiles
 * @Description: 递归遍历目录树
 * @Author: Achilles
 * @Date: 11/12/2019  20:42
 * @Version: 1.0
 **/

public class TestRecursionFiles {

    public static void main(String[] args) {
        File f = new File("E:\\code_in_VisualStudio");
        printFiles(f,0);
    }

    static void printFiles(File f,int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(f.getName());
        if (f.isDirectory()) {
            File[] files = f.listFiles();
            for (File file : files) {
                printFiles(file,level+1);
            }
        }
    }
}
