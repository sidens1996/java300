package world.zyx.io;

import java.io.File;

/**
 * @ClassName: TestPath
 * @Description: 测试路径的写法
 * @Author: Achilles
 * @Date: 15/12/2019  15:33
 * @Version: 1.0
 **/

public class TestPath {

    public static void main(String[] args) {
        // 名称分隔符 separator
        String path = "G:\\迅雷下载\\ADN095 AVI\\ADN095.avi";
        System.out.println(File.separatorChar);
        // 1.使用/
        path = "G:/迅雷下载/ADN095 AVI/ADN095.avi";
        // 2.使用separator
        path = "G:" + File.separator + "迅雷下载" + File.separator + "ADN095 AVI" + File.separator + "ADN095.avo";
    }
}
