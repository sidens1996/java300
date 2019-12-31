package world.zyx.loc;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ClassName: IPTest
 * @Description: IP的作用：定位节点，计算机，路由等通信设备
 * @Author: Achilles
 * @Date: 25/12/2019  16:11
 * @Version: 1.0
 **/

public class IPTest {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());

        inetAddress = InetAddress.getByName("zyx.world");
        System.out.println(inetAddress.getHostAddress());
        System.out.println(inetAddress.getHostName());

    }
}
