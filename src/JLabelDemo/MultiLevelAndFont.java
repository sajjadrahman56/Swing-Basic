package JLabelDemo;

import javax.swing.*;
import java.awt.*;

public class MultiLevelAndFont extends JFrame{

   private Container container;
    private JLabel label1,label2,label3;
   private JButton bt1,bt2,bt3;
   private Font f1,f2,f3;
   private  ImageIcon img;

    MultiLevelAndFont()
    {
        //setSize(400,400);
        setBounds(250,250,700,700);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        container = this.getContentPane();
        container.setLayout(null);
        lavelWork();

    }

    public void lavelWork()
    {
        label1 = new JLabel("hujur");

        label1.setBounds(10,80,100,90);
        f1 = new Font("Arial",Font.BOLD,20);

        label1.setFont(f1);
        label1.setForeground(Color.red);
        label1.setOpaque(true);
        label1.setBackground(Color.CYAN);
        //mouse hober
        label1.setToolTipText("Hello sakiraa");

        container.add(label1);


        //img = new ImageIcon(getClass().getResource("dld.png"));
       // img = new ImageIcon("dld.png".getImage()getScaleInstance);
        // img  = new ImageIcon(("sajjad.jpg").getImage().getScaledInstance(20, 20, Image.SCALE_DEFAULT)) ;

         label2 = new JLabel(img);
         label2.setIcon(img);
        label2.setBounds(10,180,getWidth(),getHeight());
        label2.setToolTipText("sajjad bro wow");

        container.add(label2);



    }


    public static void main(String[] args) {

        new MultiLevelAndFont();
    }
}
