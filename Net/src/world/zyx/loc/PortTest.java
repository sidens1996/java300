package world.zyx.loc;

import java.net.InetSocketAddress;

/**
 * @ClassName: PortTest
 * @Description: 端口，2个字节
 * @Author: Achilles
 * @Date: 26/12/2019  16:48
 * @Version: 1.0
 **/

public class PortTest {

    public static void main(String[] args) {
        InetSocketAddress inetSocketAddress = new InetSocketAddress("zyx.world", 80);
        InetSocketAddress inetSocketAddress1 = new InetSocketAddress("127.0.0.1", 80);
        System.out.println(inetSocketAddress.getAddress());
        System.out.println(inetSocketAddress.getHostString());
        System.out.println(inetSocketAddress1.getHostName());
        System.out.println(inetSocketAddress1.getHostString());
    }
}
