import javax.swing.*;
import java.awt.*;

/**
 * Name  : Demo3
 * Author: Tony
 * Email : dulunix@gmail.com
 * Date  :
 * Function: Grid layout
 */


public class Demo3 extends JFrame {
    int size = 9;
    JButton jbs[] = new JButton[size];
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        TT t = new TT();
    }

    public Demo3(){
        //create
        for (int i = 0; i < size; i++) {
            jbs[i] = new JButton(String.valueOf(i));
        }
        //set layout
        this.setLayout(new GridLayout(3,4, 10, 10));
        //add
        for (int i = 0; i < size; i++) {
            this.add(jbs[i]);
        }

        this.setTitle("Grid layout");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 400);
        this.setVisible(true);

    }
}

class TT extends JFrame{
    JButton jb1 = null;
    public TT(){
        jb1 = new JButton("tt");
        this.setTitle("11");
        this.setLocation(300, 300);
        this.setSize(300, 200);
        this.setVisible(true);
        this.add(jb1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
