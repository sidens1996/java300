package world.zyx.io;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;

/**
 * @ClassName: TestCommonsIO
 * @Description: 测试Apache CommonsIO
 * @Author: Achilles
 * @Date: 18/12/2019  19:33
 * @Version: 1.0
 **/

public class TestCommonsIO {
    public static void main(String[] args) {
        long len = FileUtils.sizeOfDirectory(new File("C:/"));
        System.out.println(len);
        FileUtils.listFiles(new File(System.getProperty("user.dir")),
                EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);

    }
}
