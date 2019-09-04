import javax.swing.*;
import java.awt.*;

/**
 * Name  : Demo1
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  : 2019-09-01 23:06
 *
 * 1.extends JFrame
 * 2.define the containers you need
 * 3.new your containers(constructor)
 * 4.add your containers to this
 * 5.set the window
 */

public class Demo1 extends JFrame{
    JButton[] jb = new JButton[5];
    public static void main(String args[]){
        new Demo1();
    }

    public Demo1(){
        //创建组件
        jb[0] = new JButton("up");
        jb[1] = new JButton("down");
        jb[2] = new JButton("left");
        jb[3] = new JButton("right");
        jb[4] = new JButton("mid");
        //添加各个组件
        this.add(jb[0], BorderLayout.CENTER);
        this.add(jb[1], BorderLayout.NORTH);
        this.add(jb[2], BorderLayout.SOUTH);
        this.add(jb[3], BorderLayout.WEST);
        this.add(jb[4], BorderLayout.EAST);
        //设置窗体属性
        this.setTitle("Hello");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

