import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("./src/ch02/images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("./src/ch02/images/desk.jpg");

    // 定义小球的横纵坐标
    double x = 100;
    double y = 100;
    // 表示方向向右
    boolean right = true;
    // 画窗口的方法
    public void paint(Graphics g){
        System.out.println("Draw desk once!");
        // 先画桌面，再画球
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x, (int)y, null);

        if(right) {
            x = x + 10;
        }else{
            x = x - 10;
        }

        // 856窗口宽度，40是桌子边框宽度，30是小球直径
        if(x>856 - 40 - 30){
            right = false;
        }
        // 40是小球直径
        if (x<40){
            right = true;
        }
    }

    // 窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);

        // 重复画窗口,1s 25次
        while(true){
            repaint();
            // 40ms,1s = 1000ms,大约1s画25次
            try{
                Thread.sleep(40);
            }catch(Exception e){
                e.printStackTrace();
            }

        }
    }

    // main 方法是程序执行的入口
    public static void main(String[] args) {
        System.out.println("BallGame Start!");
        BallGame game = new BallGame();
        game.launchFrame();
    }
}
