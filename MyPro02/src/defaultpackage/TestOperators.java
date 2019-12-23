package defaultpackage;

/**
 * @author zyx
 */
public class TestOperators {

    //快捷键psvm
    //快捷键sout
    //快捷键fori
    public static void main(String[] args) {
        System.out.println();
        for (int i = 0; i < 10; i++) {
        }
        /*
        1.整数运算规则，byte,short,int类型的数字相运得到的都是int类型，即使两个byte类型的变量运算得到的也是int类型
        2.只要有short类型的变量参与运算则得到的变量必定为short类型
        3.如果两个操作数都为float，则运算结果才为float
        4.两个操作数只要有一个为double,则运算结果为double
         */

        /**
         * 测试算术运算符
         */
        byte a = 1;
        int b = 2;
        long b2 = 3;
        byte c = (byte)(a + b);       //没有强制类型转换会报错，因为int和其他整型变量（不包括long）运算结果是int
        int c2 = (int)(b2 + b);       //没有强制类型转换会报错，因为long和其他整型变量运算结果是long

        double f1 = 3.14f;
        float d = b + b2;
        float d2 = (float)(f1 + 6.2); //只要有一个是double，则结果类型为double

        //java中取模运算符%的操作数可以为整数，也可以为浮点数，而C/C++中取模运算符的操作数只能为整数
        //其中余数符号和运算符左边变量符号相同
        int mod = 1%3;
        double mod2 = 2.4%5.1;
        int mod3 = 9%5;//4
        int mod4 = -9%5;//-4

        //自增和自减运算符
        a++;//先用后加
        ++a;//先加后用
        a--;//先用后减
        --a;//先减后用


        /**
         * 测试赋值运算符及扩展赋值运算符
         */
        //+=
        //-=
        //*=
        ///=
        //%=
        a *= b + 3;//相当于 a = a * (b + 3)


        /**
         * 测试关系运算符
         */
        String s1 = "abc";
        String s2 = "abd";
//        if (s1 > s2) {
//
//        }//字符串类型不能比较大小，这点和C/C++不一样


        /**
         * 测试逻辑运算符
         *
         */
        // &逻辑与
        // |逻辑或
        // !逻辑非
        // &&短路与
        // ||短路或
        // ^逻辑异或


        /**
         * 测试位运算符
         */
        // &按位与
        // |按位或
        // ~按位取反
        // ^按位异或
        //1. 所有正整数的按位取反是其本身+1的负数
        //
        //2. 所有负整数的按位取反是其本身+1的绝对值
        //
        //3. 零的按位取反是 -1（0在数学界既不是正数也不是负数）
        // <<左移，左移一位相当于乘以2，这是乘以2运算最快的方法
        // >>右移，右移一位相当于除以2取整


        /**
         * 测试字符串运算符
         */
        System.out.println(4+"3");//43
        System.out.println(4+3);  //7
        System.out.println(4+'a');//95


        /**
         * 测试条件运算符
         * a?b:c
         */
        // a?b:c


        /**
         * 运算符的优先级顺序
         */
    }
}
