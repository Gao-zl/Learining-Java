import javax.swing.*;
import java.awt.*;

public class BallGame2 extends JFrame{

    Image ball = Toolkit.getDefaultToolkit().getImage("./src/ch02/images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("./src/ch02/images/desk.jpg");

    // 定义小球的横纵坐标
    double x = 100;
    double y = 100;

    // 球弧度，此处即为60度
    double degree = 3.14/3;

    // 画窗口的方法
    public void paint(Graphics g){
        System.out.println("Draw desk once!");
        // 先画桌面，再画球
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x, (int)y, null);

        // 求走的长度
        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);

        // 碰到上下
        // 500 -边框40 - 球直径30
        // 上半部分时候由于有标题栏，因此还需再减40
        if(y > 500 - 40 - 30|| y < 0 + 40 + 60){
            degree = -degree;
        }

        // 碰到左右
        if(x < 0 + 40|| x > 856-40-30){
            degree = 3.14 - degree;
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
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }
}
