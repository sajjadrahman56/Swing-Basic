package SetIcone;

import javax.swing.*;
import java.awt.*;

public class Test99 extends JFrame {

    private  ImageIcon icon;
    //for bg
    private Container c;

    public Test99()
    {
        initIcone2();
    }
    public void initIcone2()
    {

        //c = container 
        c = this.getContentPane();
        c.setBackground(Color.lightGray);
        icon = new ImageIcon(getClass().getResource("dp2.png"));

        this.setIconImage(icon.getImage());
    }


    public static void main(String[] args) {

        Test99 njr = new Test99();

        njr.setVisible(true);
       // njr.setSize(600,600);
        // njr.setLocation(null);
        // njr.setLocationRelativeTo(null);

        njr.setBounds(500,250,400,400);
        njr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        njr.setTitle("Icon Change Frame");




    }
}
