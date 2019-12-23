package world.zyx.io;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;

import java.io.*;

/**
 * @ClassName: TestDataStream
 * @Description: 测试DataInputStream和DataOutputStream
 * 数据流
 * @Author: Achilles
 * @Date: 18/12/2019  13:51
 * @Version: 1.0
 **/

public class TestDataStream {
    public static void main(String[] args) throws IOException {
        // 写出
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(byteArrayOutputStream));
        //操作数据类型+数据
        dataOutputStream.writeUTF("编码辛酸泪，谁解其中味");
        dataOutputStream.writeInt(18);
        dataOutputStream.writeBoolean(false);
        dataOutputStream.writeChar('a');
        dataOutputStream.flush();
        byte[] datas = byteArrayOutputStream.toByteArray();
        // 读取
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new ByteArrayInputStream(datas)));
        String msg = dataInputStream.readUTF();
        int age = dataInputStream.readInt();
        Boolean bool = dataInputStream.readBoolean();
        char ch = dataInputStream.readChar();
        System.out.println(msg);
    }

}
