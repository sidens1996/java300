/**
 * @author zyx
 */
public class TestIf {

    public static void main(String[] args) {
        double d = Math.random();//返回0到1之间的随机数，不包括1
        System.out.println(d);
        int d1 = (int)(6*Math.random());//[0,5]

        int i = (int)(6*Math.random()) + 1;//[1,6]
        int j = (int)(6*Math.random()) + 1;
        int k = (int)(6*Math.random()) + 1;
        int sum = i + j + k;
        System.out.println(i);
        if(sum <= 9){
            System.out.println("手气一般，点数为"+sum);
        }else if( sum > 9 && sum < 15){
            System.out.println("手气还行，点数为"+sum);
        }else if(sum >= 15){
            System.out.println("手气很好，点数为"+sum);
        }
    }
}
