package world.zyx.loc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: SpiderTest
 * @Description: 网络爬虫简单测试
 * @Author: Achilles
 * @Date: 27/12/2019  20:07
 * @Version: 1.0
 **/

public class SpiderTest {

    public static void main(String[] args) throws IOException {
        // 1.获取URL
        URL url = new URL("https://www.jd.com");
        // 2.下载资源
        InputStream inputStream = url.openStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String msg = null;
        while (null != (msg = bufferedReader.readLine())) {
            System.out.println(msg);
        }
        bufferedReader.close();

    }
}
