package DialogWindow;
import javax.swing.*;
public class InputDialgo01 {

    public static void main(String[] args) {

      //******************* o arguments ******************
        //  String name = JOptionPane.showInputDialog("Enter you name : ");
       // JOptionPane.showMessageDialog(null,name+" welcome to swing ");


        //******************* 2 arguments ******************
       // JOptionPane.showInputDialog("Enter you name : ","sajjad");


        //******************* 4 arguments ******************
         String f_name = JOptionPane.showInputDialog(null,"Enter First  name : ","Titile",JOptionPane.INFORMATION_MESSAGE);
         String s_name = JOptionPane.showInputDialog("Enter your last  name : ");
        String fullName = f_name+s_name;

        JOptionPane.showMessageDialog(null,fullName+" welcome to swing ");

    }

}
