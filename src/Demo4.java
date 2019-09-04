import javax.swing.*;
import java.awt.*;

/**
 * Name  : Demo4
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  : 2019-09-03 21:14
 * Function:
 */
/*


public class Demo4 extends JFrame {

    JPanel jp1, jp2, jp3;
    JLabel jlb1, jlb2, jlb3;
    JButton jb1, jb2;
    JTextField jtf1, jpf2;
    public static void main(String[] args) {
        Demo4 d = new Demo4();
    }

    public Demo4(){
        */
/*jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jlb1 = new JLabel("用户名");
        jlb2 = new JLabel("密  码");

        jb1 = new JButton("Confirm");
        jb2 = new JButton("Cancel");

        jtf1 = new JTextField(10);
        jpf2 = new JPasswordField(10);

        this.setLayout(new GridLayout(3, 1));
        jp1.add(jlb1);
        jp1.add(jtf1);

        jp2.add(jlb2);
        jp2.add(jpf2);

        jp3.add(jb1);
        jp3.add(jb2);

        //add to JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setSize(300, 150);
        this.setLocation(300, 400);
        this.setTitle("Login");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*//*

    }
}
*/

public class Demo4 extends JFrame {

    JPanel jp1, jp2, jp3;
    JLabel jl1, jl2;
    JTextField jt1, jt2;
    JButton jb1, jb2;

    public static void main(String[] args) {
        new Demo4();
    }

    public Demo4(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("Name     ");
        jl2 = new JLabel("Password");

        jt1 = new JTextField(10);
        jt2 = new JPasswordField(10);

        jb1 = new JButton("Confirm");
        jb2 = new JButton("Cancel");

        jp1.add(jl1);
        jp1.add(jt1);
        jp2.add(jl2);
        jp2.add(jt2);
        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);

        this.setLayout(new GridLayout(3, 1));
        this.setLocation(234, 542);
        this.setSize(300, 150);
        this.setTitle("Login");
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}