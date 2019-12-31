package world.zyx.loc;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: URLTest
 * @Description: 统一资源定位符，html,http,url，互联网三大基石
 * 1.协议
 * 2.域名
 * 3.端口，默认80
 * 4.请求资源
 * https://www.baidu.com:80/index.html?unmae=shsxt&age=18#a
 * @Author: Achilles
 * @Date: 26/12/2019  17:02
 * @Version: 1.0
 **/

public class URLTest {

    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.baidu.com:80/index.html?unmae=shsxt&age=18#a");
        //获取四个相关内容
        System.out.println("协议：" + url.getProtocol());
        System.out.println("域名：" + url.getHost());
        System.out.println("请求资源：" + url.getFile());
        System.out.println("请求资源：" + url.getPath());
        System.out.println("端口：" + url.getPort());
        System.out.println("锚点：" + url.getQuery());
    }
}
