import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class paytmtravel extends JFrame implements ActionListener {
    JButton p1,p2;
    paytmtravel() {
        setBounds(380, 140, 600, 500);
        setTitle("Paymens-Gateway");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("paytm.jpg"));
        Image i11 = i10.getImage().getScaledInstance(600, 500, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        image.setBounds(0, 0, 600, 500);
        add(image);

         p1 = new JButton("Pay");
        p1.setBounds(400, 20, 70, 25);
        p1.addActionListener(this);
        image.add(p1);

        p2 = new JButton("Back");
        p2.setBounds(490, 20, 70, 25);
        p2.addActionListener(this);
        image.add(p2);

        setVisible(true);
    }

    public static void main(String[] args) {
        new paytmtravel();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == p1){
            setVisible(false);
            new payments("");
        }else{
            setVisible(false);
           
        }
    }
}
