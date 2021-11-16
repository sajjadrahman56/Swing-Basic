package JTextFieldDemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJField extends JFrame implements ActionListener{

    ImageIcon iconJframe;
    Container container;
      JTextField text1,text2;
      JButton btn , btn1;


    TestJField()
    {
        intiComponent();
    }


    public void intiComponent() {


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(500,200,500,500);

        //icone set of JFrame
        iconJframe = new ImageIcon(getClass().getResource("111.png"));
        this.setIconImage(iconJframe.getImage());

       container = this.getContentPane();
       container.setBackground(Color.GREEN);
        container.setLayout(null);

        text1 = new JTextField();
        text1.setBounds(50,50,100,130);
        text1.setForeground(Color.red);
        text1.setBackground(Color.BLACK);

        btn1 = new JButton("Click Me");
        btn1.setBounds(120,200,100,40);
        btn1.addActionListener(this);
        container.add(btn1);

        container.add(text1);

        text2 = new JTextField();
        text2.setBounds(260,50,100,130);
        btn = new JButton("Click Me");
        btn.setBounds(230,200,100,40);

        btn.addActionListener(this);


       text2.setBackground(Color.BLACK);
        container.add(btn);
     container.add(text2);

//     btn.addActionListener(new ActionListener() {
//         @Override
//         public void actionPerformed(ActionEvent e) {
//            // JOptionPane.showMessageDialog(null,"Cliciked Me");
//             container.setBackground(Color.red);
//         }
//     });
        setVisible(true);

    }

    public static void main(String[] args) {
        new TestJField();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()== btn1)
        {

            //MiddlePanel.setBackground(new Color(10,10,10));

            container.setBackground(Color.blue);
        }
        if(e.getSource()== btn)
        {

            //MiddlePanel.setBackground(new Color(10,10,10));

            container.setBackground(Color.red);
        }
    }
}
