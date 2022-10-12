import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.sql.ResultSet;
public class payments extends JFrame implements ActionListener {
    String user;
    JButton back;
    payments(String user){
        this.user=user;
        // calling paytm website
        JEditorPane j = new JEditorPane();
        j.setEditable(false);
        try {
            // j.setPage("https://paytm.com/");
                j.setPage("https://paytm.com/online-payments");
        } catch (Exception e) {
           j.setContentType("text/html");
           j.setText("<html><h1 align=center>Could not load Under Maintenance<br> Error 404</h1></html>");
        }
        
        JScrollPane pane = new JScrollPane(j);
        add(pane);

         back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(340, 90, 100, 30);
        j.add(back);
        
        setSize(800,600);
        setLocation(300,80);
        // setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new payments("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new paytmtravel(); 
        
        
    }
}

