package world.zyx.loc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/**
 * @ClassName: SpiderTest
 * @Description: 网络爬虫,模拟浏览器
 * @Author: Achilles
 * @Date: 27/12/2019  20:07
 * @Version: 1.0
 **/

public class SpiderTestEmulator {

    public static void main(String[] args) throws IOException {
        // 1.获取URL
        URL url = new URL("https://www.dianping.com");
        // 2.下载资源
        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.setRequestProperty("User-agent",
                "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36");
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream(), "UTF-8"));
        String msg = null;
        while (null != (msg = bufferedReader.readLine())) {
            System.out.println(msg);
        }
    }
}
