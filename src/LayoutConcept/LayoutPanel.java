package LayoutConcept;

import javax.swing.*;
import java.awt.*;

public class LayoutPanel extends JFrame {
    private Container container;
    private JPanel panel1 , panel2,panel3;
    private  JButton btn1,btn2,btn3 , btns[];
    BorderLayout borderLayout ;
    FlowLayout fl;

    LayoutPanel()
    {
        componet();

    }
    public void componet()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(180,150,600,600);
        this.setTitle("Pnale Layout ");
        container = this.getContentPane();

        borderLayout = new BorderLayout(10,10);

        container.setLayout(borderLayout);


        btn1 = new JButton("North");
        btn2 = new JButton("East");
        btn3 = new JButton("Center");


       // panel1 = new JPanel(new FlowLayout());
       // panel1 = new JPanel(new GridLayout(3,3));
        panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //panel1.setBackground(Color.red);
        //btn3.add(panel1);



        btns = new JButton[9];

        for(int i = 0 ; i < 9 ; i++)
        {
            btns[i] = new JButton(""+(i+1));
            btns[i].setBackground(Color.BLACK);
            btns[i].setForeground(Color.red);
            panel1.add(btns[i]);
        }
//        panel1.add( new JButton("*"));
//        panel1.add( new JButton("/"));
//        panel1.add( new JButton("+"));




       // btn1.add(panel1);
        btn3.add(panel1);

        panel2 = new JPanel();
        btn1.add(panel2);
        btn1.setBackground(Color.CYAN);

        panel3 = new JPanel(new FlowLayout (10));
        btn2.add(panel3);
        panel3.add(new JButton("*"));
        panel3.add(new JButton("**"));
        panel3.add(new JButton("*)"));

        btn2.setBackground(Color.CYAN);



        container.add(btn1,BorderLayout.NORTH);
        container.add( btn2,BorderLayout.EAST);
        container.add( btn3,BorderLayout.CENTER);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new LayoutPanel();
    }
}
