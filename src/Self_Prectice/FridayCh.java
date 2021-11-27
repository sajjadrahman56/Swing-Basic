package Self_Prectice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ColorConvertOp;
import java.util.logging.Handler;

public class FridayCh extends JFrame {


    JLabel label1,label2,label3;
    Font font1,font2,font3;
    ImageIcon img1,img2;
    JTextField tf1,tf2;
    JButton btn1,btn2,btn3;
    Cursor cursor;

    public FridayCh()
    {
       // setSize(600,600);
        setBounds(400,250,600,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // setLocation(null);
        //setLocationRelativeTo(null);
        getContentPane().setBackground(Color.red);
        setLayout(null);
        setTitle("Friday Challenge");

        // font size edit
        font1 = new Font("Arial",Font.BOLD,20);

        label1 = new JLabel("Hello Amigo");
        label1.setBounds(250,30,150,60);
        label1.setFont(font1);
       label1.setForeground(Color.BLACK);
       label1.setToolTipText("Amigo message show ");
         add(label1);

         img1 = new ImageIcon(getClass().getResource("dp.png"));
         label2 = new JLabel(img1);
         label2.setBounds(100,100,img1.getIconWidth(),img1.getIconHeight());
         add(label2);

         tf1 = new JTextField();
         tf1.setBounds(100,150,120,50);
         tf1.setFont(font1);
         tf1.setForeground(Color.BLACK);
         tf1.setBackground(Color.LIGHT_GRAY);

         add(tf1);

        Handler handel = new Handler() ;

        tf1.addActionListener(handel);

        cursor = new Cursor(Cursor.HAND_CURSOR);

        btn1 = new JButton("click");
        btn1.setBounds(100,210,100,70);
        btn1.setFont(font1);
        btn1.setCursor(cursor);
        //btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn1);

        btn2 = new JButton( img1);
        btn2.setBounds(100,290,  100,  70);
       // btn1.setFont(font1);
        btn2.setCursor(cursor);
        //btn1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add(btn2);
        btn1.addActionListener(handel);
        btn2.addActionListener(handel);


        setVisible(true);
    }

    class Handler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == tf1)
            {
                String s = tf1.getText();
                if(s.isEmpty())
                {
                    System.out.println("Nothing is Insert");
                    JOptionPane.showMessageDialog(null,"Nothing is insert");
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Hi "+s);
                }

            }
            else if(e.getSource() == btn1 )
            {
                getContentPane().setBackground(Color.green);

            }
            else if(e.getSource() == btn2 )
            {
                getContentPane().setBackground(Color.BLACK);

            }
        }
    }
    public static void main(String[] args) {
        new FridayCh();
    }
}
