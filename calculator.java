import javax.swing.JFrame;
// import javax.swing.*;
// import java.awt.*;
import java.awt.event.*;
public class calculator  extends JFrame implements ActionListener {

    calculator(){
        try {
            Runtime.getRuntime().exec("calc.exe");
        } catch (Exception e) {
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
    }
}
