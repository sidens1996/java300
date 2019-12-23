/**
 * @author zyx
 */
public class TestBreak {

    public static void main(String[] args) {
        int i = 0,j = 0;
        for(;i <= 1000;i++){
            if(i == 88){
                break;
            }
        }
        System.out.println(i);
        System.out.println("####################");
        for(;j <= 1000;j++){
            if(j == 88){
                continue;
            }
        }
        System.out.println(j);
        System.out.println("#####################");
        for(int m = 0;m < 100;m++){
            for(int n = 0;n < 100;n++) {
                if (n == 50 && m == 50) {
                    System.out.println(m * n);
                    break;
                }
                System.out.println(m);
            }
        }
    }
}
