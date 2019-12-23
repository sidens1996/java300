package world.zyx.test;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @ClassName: TestWrappedClass
 * @Description: 测试包装类
 * @Author: Achilles
 * @Date: 11/12/2019  14:09
 * @Version: 1.0
 **/

public class TestWrappedClass {

    public static void main(String[] args) {
        Integer a = new Integer(1996);
        int c = a;
        int d = a.intValue();

        Integer e = new Integer("1996");
        Integer f = Integer.parseInt("1996");

        String g = f.toString();

        int h = Integer.MAX_VALUE;
        int i = Integer.MIN_VALUE;

        Integer x1 = Integer.valueOf(1996);
        Integer x2 = Integer.valueOf(1996);
        System.out.println(x1 == x2);
        System.out.println(x1.equals(x2));

        Integer y1 = Integer.valueOf(127);
        Integer y2 = Integer.valueOf(127);
        System.out.println("========");
        System.out.println(y1 == y2);
        System.out.println(y1.equals(y2));

    }
}
