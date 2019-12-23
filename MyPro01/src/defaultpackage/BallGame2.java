package defaultpackage;

import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 100;
    double y = 100;
    double degree = 3.14/3;

    public void paint(Graphics g){
        System.out.println("窗口被画了一次!");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);


        //以与法线呈60度的角度弹射
        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        //边界检测
        //最后一个40是标题栏的高度
        if(y > 500 - 40 - 30 | y < 40 + 40){
            degree = -degree;
        }
        if(x < 40 | x > 856 - 40 - 30){
            degree = 3.14 - degree;
        }
    }

    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        //重画窗口
        while(true){
            repaint();
            try{
                Thread.sleep(40);
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args){
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }

}
