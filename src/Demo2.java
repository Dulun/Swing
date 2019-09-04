import javax.swing.*;
import java.awt.*;

/**
 * Name  : Demo2
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  : 2019-09-01 23:27
 * Function: Flow layout
 */


public class Demo2 extends JFrame{
    private JButton jb1;
    private JButton jb2;
    private JButton jb3;
    private JButton jb4;
    private JButton jb5;
    private JButton jb6;

    public static void main(String[] args) {
        new Demo2();
    }
    public Demo2(){
        jb1 = new JButton("关羽");
//        jb1.setSize(100, 100);
        jb2 = new JButton("张飞");
        jb3 = new JButton("赵云");
        jb4 = new JButton("马超");
        jb5 = new JButton("黄忠");
        jb6 = new JButton("魏延");
        //设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
//        this.setLayout(null);
        //添加各个组件
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);

//        this.add(jb6, BorderLayout.EAST);
        //设置窗体属性
        this.setTitle("Hello");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        //设置禁止用户改变窗体大小
        this.setResizable(false);
        this.setVisible(true);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
