import javax.swing.*;
import java.awt.*;

/**
 * Name  : Demo5
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  : 2019-09-03 21:53
 * Function:
 */


public class Demo5 extends JFrame {
    JPanel jp1,jp2, jp3;
    JLabel jl1, jl2;
    JButton jb1, jb2;
    JCheckBox jcb1, jcb2, jcb3;
    JRadioButton jrb1, jrb2;
    ButtonGroup bg;

    public Demo5(){
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();

        jl1 = new JLabel("sport");
        jl2 = new JLabel("gender");
        jb1 = new JButton("register");
        jb2 = new JButton("login");
        jcb1 = new JCheckBox("Football");
        jcb2 = new JCheckBox("Basketball");
        jcb3 = new JCheckBox("Tennis");

        jrb1 = new JRadioButton("Male");
        jrb2 = new JRadioButton("Female");

        bg = new ButtonGroup();
        bg.add(jrb1);
        bg.add(jrb2);

        this.setLayout(new GridLayout(3, 1));
        jp1.add(jl1);
        jp1.add(jcb1);
        jp1.add(jcb2);
        jp1.add(jcb3);

        jp2.add(jl2);
        jp2.add(jrb1);
        jp2.add(jrb2);

        jp3.add(jb1);
        jp3.add(jb2);

        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        this.setSize(300, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

}
