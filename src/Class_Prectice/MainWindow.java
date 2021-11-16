package Class_Prectice;

import javax.swing.*;

public class MainWindow  extends JFrame {

    public MainWindow()
    {
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel label = new JLabel("Hello");
        label.setBounds(120,80,110,60);

        add(label);

        JButton button = new JButton("Press Me");
        button.setBounds(110,120,140,70);
        add(button);

        setVisible(true);

    }
    public static void main(String[] args) {

        new MainWindow();
    }

}
