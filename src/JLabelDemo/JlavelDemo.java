package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class JlavelDemo extends JFrame {

    private ImageIcon ico;
    private Container c;
    private JLabel usesrLabel,label2;



    public JlavelDemo() {

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocation(null);
       // setLocationRelativeTo(null);
        setBounds(100,170,400,300);
        setTitle("JLabel Demo");

        iconSet();
        imgSet();


    }

    public  void  imgSet()
    {
        ico = new ImageIcon(getClass().getResource("dld.png"));
        this.setIconImage(ico.getImage());
    }
    public void iconSet()
    {


        c = this.getContentPane();
        c.setLayout(null);
       c.setBackground(Color.GREEN);

        usesrLabel = new JLabel();
        usesrLabel.setText("Hello Samara");
        usesrLabel.setBounds(120,70,100,30);
        c.add(usesrLabel);

        label2 = new JLabel("How are you");
        label2.setBounds(120,100,100,30);
        c.add(label2);

    }

    public static void main(String[] args) {
        JlavelDemo jl = new   JlavelDemo();
        JLabel usesrLabel ;
//
//        usesrLabel = new JLabel();
//        usesrLabel.setText("Hello Samara");
//        usesrLabel.setBounds(40,30,120,50);
//        jl.add(usesrLabel);


    }
}
