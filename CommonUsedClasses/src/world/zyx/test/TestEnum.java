package world.zyx.test;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @ClassName: TestEnum
 * @Description: 测试枚举
 * @Author: Achilles
 * @Date: 12/12/2019  13:08
 * @Version: 1.0
 **/

public class TestEnum {

    enum Season {
        SPRING,SUMMER,FALL, WINTER
    }

    enum Week {
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY, SUNDAY
    }



    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }


}
