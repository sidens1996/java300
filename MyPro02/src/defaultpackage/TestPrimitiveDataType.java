package defaultpackage;

import java.math.BigDecimal;

/**
 * 测试基本数据类型
 * @author zyx
 */
public class TestPrimitiveDataType {

    public static void main(String[] args){

        /*
        整数类型：
        byte        1个字节
        short       2个字节
        int         4个字节
        long        8个字节

        浮点类型：
        float       4个字节
        double      8个字节

        字符类型：
        char        2个字节
        boolean     1位

        引用类型：
        4个字节


        一个字节8位，可以推出表示范围
         */

        /**
         * 测试整型
         */
//        long a = 7400000000;//整型常量默认是int类型
        long population = 7400000000L;//加L代表长整型变量
        int binary = 0b01;      //二进制
        int oct = 030;          //八进制
        int decimal = 30;       //十进制
        int hexdecimal = 0xab;  //十六进制
        System.out.println("测试整型：");

        /**
         * 测试浮点型
         */
        double pi = 314e-2;
        float pi2 = 3.14f;
        //float类型需要添加后缀f,浮点类型常量默认是double

        //浮点数都是不精确的
        float f = 0.1f;
        double d = 1.0/10;
        System.out.println("测试浮点型：");
        System.out.println(f-d);

        float bigNmuber = 1563498561346L;
        float bigNumber2 = bigNmuber + 1;
        if (bigNmuber == bigNumber2){
            System.out.println("bigNumber=bigNumber2");
        }
        else{
            System.out.print("bigNumber!=bigNmuber2");
        }

        //注意，如果需要使用浮点数进行比较，需要使用BigDecimal类
        BigDecimal bd = BigDecimal.valueOf(1.0);
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        bd = bd.subtract(BigDecimal.valueOf(0.1));
        System.out.println(bd);                     //0.5
        System.out.println(1.0-0.1-0.1-0.1-0.1-0.1);//0.5000000000000001

        BigDecimal bd2 = BigDecimal.valueOf(0.1);
        BigDecimal bd3 = BigDecimal.valueOf(1.0/10);
        System.out.println(bd2.equals(bd3));


        /**
         * 测试字符型
         */
        char a = 'T';
        char b = '轩';
        System.out.println("测试字符型：");
        System.out.println('a'+0);
        System.out.println('a'+'b');
        System.out.println(""+'a'+'b');

        //String是字符序列
        String str = "abc";

        /**
         * 测试boolean类型
         */
        boolean flag = true;
        //boolean类型的成员变量如果不初始化则默认初始值为false
        if(flag){
            System.out.println("if的判断应该这么写");
        }

    }
}
