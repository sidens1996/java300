package zyx.world.state;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: BlockedSleep3
 * @Description: sleep模拟倒计时
 * @Author: Achilles
 * @Date: 19/12/2019  18:32
 * @Version: 1.0
 **/

public class BlockedSleep3 {
    public static void main(String[] args) throws InterruptedException {
        Date endTime = new Date(System.currentTimeMillis() + 1000 * 10);
        long end = endTime.getTime();
        while (true) {
            endTime = new Date(endTime.getTime() - 1000);
            System.out.println(new SimpleDateFormat("hh:mm:ss").format(endTime));
            Thread.sleep(1000);
            if (end - endTime.getTime() > 1000 * 10) {
                break;
            }
        }

    }

}

