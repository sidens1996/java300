package world.zyx.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * @ClassName: TestCalendar
 * @Description: 测试日期
 * @Author: Achilles
 * @Date: 11/12/2019  17:27
 * @Version: 1.0
 **/

public class TestCalendar {

    public static void main(String[] args) throws ParseException {
        //读取输入
        System.out.println("输入格式为yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        //转换日期
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(string);
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
        //获取参数
        int day = 1;
        int month = calendar.get(Calendar.MONTH)+1;
        int year = calendar.get(Calendar.YEAR);
        Date date1 = dateFormat.parse(year + "-" + month + "-" + day);
        Calendar calendar1 = new GregorianCalendar();
        calendar1.setTime(date1);//得到当月1号的相关信息
        int dayOfWeek = calendar1.get(Calendar.DAY_OF_WEEK);//星期几
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);//这个月的第几天
        //打印
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        for (int i = 1; i < dayOfWeek; i++) {
            System.out.print("\t");
        }
        for (int i = 1; i <= calendar.getActualMaximum(Calendar.DATE); i++) {
            if (dayOfMonth == i) {
                System.out.print(i + "*\t");
            } else {
                System.out.print(i + "\t");
            }
            calendar1.set(Calendar.DAY_OF_MONTH, i);
            if (calendar1.get(Calendar.DAY_OF_WEEK) == 7) {
                System.out.println();
            }
        }
    }

    static int daysOfMonth(int year, int month) {
        int daysOfMonth = 0;
        switch (month) {
            case 1:
                if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) {
                    daysOfMonth = 29;
                } else {
                    daysOfMonth = 28;
                }
                break;
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                daysOfMonth = month % 2 == 0 ? 31 : 30;
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                daysOfMonth = month % 2 == 0 ? 30 : 31;
                break;
        }
        return daysOfMonth;
    }

}
