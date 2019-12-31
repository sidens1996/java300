package world.zyx.loc;

import java.util.*;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Author: Achilles
 * @Date: 30/12/2019  12:59
 * @Version: 1.0
 **/

public class Test {

    public static int[] sumZero(int n) {
        int[] result = new int[n];
        if(n % 2 == 0){
            for (int i = 0;i < n/2; i++){
                result[i] = (i + 1)*(-1);
            }
            for (int i = n/2;i < n; i++){
                result[i] = result[n - i - 1]*(-1);
            }
        }else{
            result[n/2] = 0;
            for(int i = 0; i < n/2; i++){
                result[i] = (i + 1)*(-1);
            }
            for(int i = n/2 + 1; i < n; i++){
                result[i] = result[n - i - 1]*(-1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] result = sumZero(4);
        System.out.println(Arrays.toString(result));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        list.get(1);
        System.out.println(list);
        System.out.println(Math.log10(7896) + 1);
    }
}
