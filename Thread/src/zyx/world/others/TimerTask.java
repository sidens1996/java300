package zyx.world.others;

import java.sql.DatabaseMetaData;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;

/**
 * @ClassName: TimerTask
 * @Description: 任务调度：Timer和TimerTask类
 * @Author: Achilles
 * @Date: 23/12/2019  15:07
 * @Version: 1.0
 **/

public class TimerTask {

    public static void main(String[] args) {
        Timer timer = new Timer();
//        timer.schedule(new MyTask(), 2000, 200);
        Calendar calendar = new GregorianCalendar(2019, Calendar.DECEMBER, 23, 15, 29);
        timer.schedule(new MyTask(), calendar.getTime(), 1000);
    }

}

class MyTask extends java.util.TimerTask {

    @Override
    public void run() {
        System.out.println("这是定时任务！");
    }
}
