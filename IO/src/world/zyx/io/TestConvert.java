package world.zyx.io;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @ClassName: TestConvert
 * @Description: 转换流InputStreamReader和OutputStreamWriter
 * 1.以字符流的形式操作字节流（纯文本）
 * 2.指定字符集
 * @Author: Achilles
 * @Date: 17/12/2019  21:55
 * @Version: 1.0
 **/

public class TestConvert {

    public static void main(String[] args) {
        operateNet();
    }

    public static void operateNet() {
        // 操作网络流 下载百度的源代码
        try {
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(new URL("http://www.baidu.com").openStream(),"utf-8"));
            BufferedWriter outputStream = new BufferedWriter(
                    new OutputStreamWriter(new FileOutputStream("baidu.html")));
            //读取
            String line = null;
            while ((line = inputStream.readLine()) != null) {
                outputStream.write(line);
                outputStream.newLine();
            }
            outputStream.flush();
            outputStream.close();
            inputStream.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void operateInAndOut() {
        //操作System.in和System.out
        try {
            BufferedReader inputStreamReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter outputStreamWriter = new BufferedWriter(new OutputStreamWriter(System.out));
            String msg = "";
            while (!msg.equals("exit")) {
                msg = inputStreamReader.readLine();//循环读取
                outputStreamWriter.write(msg);     //循环写出
                outputStreamWriter.newLine();
                outputStreamWriter.flush();
            }
            outputStreamWriter.close();
            inputStreamReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
        }
    }
}
