package cn.sxt.oo;

import java.util.Arrays;

/**
 * @ClassName: TestArray
 * @Description: TODO
 * @Author: Achilles
 * @Date: 10/12/2019  21:11
 * @Version: 1.0
 **/

public class TestArray {

    static String[] insertElement(String[] src,int index, String element) {
        String[] dest = new String[src.length+1];
        System.arraycopy(src, 0, dest, 0, index);
        dest[index] = element;
        System.arraycopy(src, index, dest, index + 1, src.length - index);
        return dest;
    }

    public static void main(String[] args) {
        String[] str = {"1","2","3","5","6"};
        str = insertElement(str,3,"4");
        for (String s : str) {
            System.out.println(s);
        }
    }
}
