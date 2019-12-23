package world.zyx.io;

import com.sun.xml.internal.bind.v2.util.ByteArrayOutputStreamEx;

import java.io.*;

/**
 * @ClassName: TestIO7
 * @Description: 测试字节数组输入流，字节数组输出流
 * @Author: Achilles
 * @Date: 17/12/2019  15:20
 * @Version: 1.0
 **/

public class TestIO7 {

    public static void main(String[] args) {
//        byte[] src = "talk is cheap, show me the code!".getBytes();
        byte[] dest = null;
//        InputStream is = null;
        ByteArrayOutputStream byteArrayOutputStream = null;//使用新增方法，不能发生多态
        try {
//            is = new ByteArrayInputStream(src);
            byteArrayOutputStream = new ByteArrayOutputStream();
            String msg = "talk is cheap, show me the code!";
            byte[] datas = msg.getBytes();
            byteArrayOutputStream.write(datas, 0, datas.length);
            byteArrayOutputStream.flush();
            dest = byteArrayOutputStream.toByteArray();
            System.out.println(new String(dest,0,byteArrayOutputStream.size()));
//            byte[] flush = new byte[5];
//            int len = -1;
//            while ((len = is.read(flush)) != -1) {
//                String string = new String(flush, 0, len);
//                System.out.println(string);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //不用手动close()
        }

    }
}
