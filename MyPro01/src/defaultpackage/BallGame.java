package defaultpackage;

import javax.swing.*;
import java.awt.*;

public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 100;
    double y = 100;
    boolean right = true;//true表示方向向右，false表示方向向左

    public void paint(Graphics g){
        System.out.println("窗口被画了一次!");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        if(right){
            x = x + 10;
        }
        else{
            x = x - 10;
        }

        //改变方向
        //40是桌子边框的角度，30是小球直径
        if(x >= 856 - 40 - 30 |x <= 40){
            right = !right;
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
        BallGame game = new BallGame();
        game.launchFrame();
    }

}
