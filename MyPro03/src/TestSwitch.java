/**
 * @author zyx
 */
public class TestSwitch {

    public static void main(String[] args) {
        int month = (int)(12*Math.random()) + 1;//1到12月份
        System.out.println("月份是："+month);
        switch(month){
            case 1:
                System.out.println("这是一月份");
                break;
            case 2:
                System.out.println("这是二月份");
                break;
            case 3:
                System.out.println("这是三月份");
                break;
            default:
                System.out.println("这是其他月份");
        }

        System.out.println("###############");
        char a = 'a';
        int num = (int)(26*Math.random());
        char var =  (char)(a + num);
        System.out.println("字母是:"+var);
        switch ((char)(a + num)){//JDK1.7后switch可以使用字符串了
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("这是元音!");
                break;
            default :
                System.out.println("这不是元音!");

        }

        System.out.println("####################");
        String[] str = {"abc","def","ghi","jkl"};
        for (String s:str) {

            switch (s){
                case "abc":
                    System.out.println("switch中可以使用字符串！ ");
            }
        }
    }
}
