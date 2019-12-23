/**
 * @author zyx
 */
public class TestWhile {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        while (i <= 100){
            sum1 += i++;
        }
        System.out.println(sum1);
        do {
            sum2 += j++;
        }while(j <= 100);
        System.out.println(sum2);
    }
}
