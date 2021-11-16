package Self_Prectice;

import javax.swing.*;

public class SelfFrame01 extends JFrame {

    private  ImageIcon icon;
    SelfFrame01()
    {
         initIcone2();
    }
    public void initIcone2()
    {
        icon = new ImageIcon(getClass().getResource("dp2.png"));

        this.setIconImage(icon.getImage());
    }
    public static void main(String[] args) {

        SelfFrame01 njr = new SelfFrame01();

        njr.setVisible(true);
        njr.setSize(300,300);
       // njr.setLocation(null);
       // njr.setLocationRelativeTo(null);

        njr.setBounds(500,250,400,400);
        njr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton j = new JButton("Click me");
        j.setBounds(00,200,250,90);
        njr.setTitle("Samara");

        njr.add(j);
        njr.setResizable(false);


       // int choice = JOptionPane.showConfirmDialog(null,"quit or stay","out",JOptionPane.YES_NO_CANCEL_OPTION);


    }



}
