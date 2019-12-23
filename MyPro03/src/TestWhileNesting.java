/**
 * @author zyx
 */
public class TestWhileNesting {

    public static void main(String[] args) {
        System.out.println("打印乘法表");
        for(int i = 1;i < 19;i++){
            for(int j = 1; j <= i;j++){
                System.out.print(j + "*" + i + "=" + ((j * i < 10)?(" "+i * j):(i * j))+" ");
            }
            System.out.println();
        }
        System.out.println("###########################");
        System.out.println("打印100以内的奇数和以及偶数和");
        int m = 1;
        int n = 2;
        int sum1 = 0,sum2 = 0;
        while(m <= 100){
            sum1 += m;
            m += 2;
        }
        System.out.println("奇数和是："+sum1);
        while(n <= 100){
            sum2 += n;
            n += 2;
        }
        System.out.println("偶数和是："+sum2);
        System.out.println("#####################");
        System.out.println("打印1000以内能被5整除的非负数数");
        for(int i = 0,j = 0; i <= 1000; i++){
            if(i % 5 == 0){
                System.out.print(i + " ");
                j++;
            }
            if(i % 5 == 0 && j % 5 == 0){
                System.out.println();
            }
        }
    }
}
