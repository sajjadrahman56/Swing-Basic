package LogInFrame;

import javax.swing.*;
import java.awt.*;

public class LogIn extends JFrame {

   private JLabel userLabel1,userLabel2;
   private JTextField tf;
   private JPasswordField pf;
   private JButton submitButton,clearButton;
   private Container c;

    LogIn()
    {
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(250,150,650,540);
        this.setTitle("Log In  From");
    }

    public static void main(String[] args) {
        new LogIn();
    }
}
