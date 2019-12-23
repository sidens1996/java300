package world.zyx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @ClassName: TestDate
 * @Description: 测试时间类
 * @Author: Achilles
 * @Date: 11/12/2019  16:09
 * @Version: 1.0
 **/

public class TestDate {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        //测试时间对象和字符串之间的互相转换
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String s = df.format(9999999999999l);
        System.out.println(s);

        DateFormat df2 = new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        Date d = df2.parse("2019年12月11日 16时49分20秒");
        System.out.println(d.toString());

        DateFormat df3 = new SimpleDateFormat("D");
        String s1 = df3.format(new Date());
        System.out.println(s1);


        //测试日期Calendar
        //获取日期
        Calendar calendar = new GregorianCalendar(2099, 10, 9, 22, 10, 22);
        int year = calendar.get(Calendar.YEAR);//2099
        int month = calendar.get(Calendar.MONTH);//10 Dec
        System.out.println(month);
        //设置日期
        Calendar calendar1 = new GregorianCalendar();
        System.out.println(calendar1);
        calendar1.set(Calendar.YEAR, 8012);
        //日期的计算
        Calendar calendar2 = new GregorianCalendar();
        calendar2.add(Calendar.DATE, 100);
        System.out.println(calendar2);
        //日期对象和时间对象的转换
        Date date1 = new Date();
        Calendar calendar3 = new GregorianCalendar();
        calendar3.setTime(date1);
    }
}
