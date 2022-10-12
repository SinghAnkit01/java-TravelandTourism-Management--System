import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JButton log4, log5, log2;
    JTextField user1, pass1;

    login() {
        setSize(750, 300);
        setLocation(380, 190);
        setLayout(null);
        setTitle("Login Page");
        getContentPane().setBackground(Color.WHITE);

        // using panel to divide frame into two parts
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(0, 0, 350, 300);
        // panel.setLayout(null);
        // by default layout is border layout and in border layout we can add direction
        // in add() method along with panel object.
        // bydefault direction is center.
        // if i need data in the form of table we can use grid layout.
        // flow-layout for adding components simultaneously one-by-one.
        // now i a not using any layout i am just creating our own custom layout steps
        // are:
        // 1)setLayout(null)
        // 2)use of panel class object with setBounds() on frame.
        add(panel, "West");
        // adding image on to the panel
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("login.png"));
        Image i11 = i10.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        // image.setBounds(0, 0, 450, 400);
        panel.add(image);

        // creating one more panel for adding textboxes and buttons
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        // panel2.setBackground(Color.WHITE);
        // already declared setLayout(null) globally.
        panel2.setBounds(350, 20, 340, 220);
        add(panel2, "East");

        JLabel user = new JLabel("Username :");
        user.setBounds(30, 20, 100, 25);
        user.setFont(new Font("Railway", Font.BOLD, 14));
        panel2.add(user);

        user1 = new JTextField();
        user1.setBounds(120, 20, 160, 25);
        user1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        panel2.add(user1);

        JLabel pass = new JLabel("Password :");
        pass.setBounds(30, 70, 100, 25);
        pass.setFont(new Font("Railway", Font.BOLD, 14));
        panel2.add(pass);

        pass1 = new JTextField();
        pass1.setBounds(120, 70, 160, 25);
        pass1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        panel2.add(pass1);

        log4 = new JButton("Login");
        log4.addActionListener(this);
        log4.setBounds(50, 130, 100, 25);
        log4.setBackground(new Color(63, 193, 233));
        log4.setBorder(BorderFactory.createDashedBorder(getForeground()));
        log4.setForeground(Color.WHITE);
        panel2.add(log4);
        log5 = new JButton("SignUp");
        log5.addActionListener(this);
        log5.setBounds(180, 130, 100, 25);
        log5.setBackground(new Color(63, 193, 233));
        log5.setBorder(BorderFactory.createDashedBorder(getForeground()));
        log5.setForeground(Color.WHITE);
        panel2.add(log5);
        log2 = new JButton("ForgetPassword");
        log2.addActionListener(this);
        log2.setBounds(50, 170, 130, 25);
        log2.setBackground(new Color(63, 193, 233));
        log2.setBorder(BorderFactory.createDashedBorder(getForeground()));
        log2.setForeground(Color.WHITE);
        panel2.add(log2);

        // adding label

        JLabel text = new JLabel("Trouble in Login....");
        text.setBounds(220, 170, 200, 25);
        text.setForeground(Color.RED);
        panel2.add(text);

        setVisible(true);

    }

    public static void main(String[] args) {
        new login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = user1.getText();
        String pass = pass1.getText();
        if (e.getSource() == log4) {
            System.out.println("signin");
            try {

                if (user.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username is Required");
                    // this method is use to pop-up dialog box in windows
                } else if (pass.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password is Required");
                } else {
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery(
                            "select * from account where username='" + user + "' and password='" + pass + "'  ");
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null, "Details Matched");
                        setVisible(false);
                        new loading(user);
                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Crediantials ");
                        user1.setText("");
                        pass1.setText("");
                    }

                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }

        } else if (e.getSource() == log5) {
            System.out.println("signup");
            new signup();
            // user1.setText("");
            // pass1.setText("");

        } else {
            System.out.println("forgetpassword");
            setVisible(false);
            new forgetpassword();
        }

    }
}
