import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.sql.ResultSet;
import java.sql.*;
public class viewcustomerdetail extends JFrame implements ActionListener {
    String user;
    JButton back;
    viewcustomerdetail(String user){
    this.user=user;
    setBounds(300, 50, 850, 650);
    getContentPane().setBackground(Color.WHITE);
    setTitle("View Customer Details");
    setLayout(null);

    JLabel heading = new JLabel("VIEW CUSTOMER INFORMATION");
    heading.setBounds(250, 10, 500, 40);
    heading.setFont(new Font("Railway",Font.BOLD,20));
    add(heading);

        JLabel name = new JLabel("Name        : ");
        name.setBounds(70, 80, 100, 20);
        name.setFont(new Font("Railway",Font.PLAIN,16));
        add(name);

        JLabel name1 = new JLabel("");
        name1.setBounds(180, 80, 100, 20);
        name1.setFont(new Font("Railway",Font.PLAIN,16));
        add(name1);

        JLabel username = new JLabel("Username : ");
        username.setBounds(70, 140, 100, 20);
        username.setFont(new Font("Railway",Font.PLAIN,16));
        add(username);

        JLabel user1 = new JLabel("");
        user1.setBounds(180, 140, 100, 20);
        user1.setFont(new Font("Railway",Font.PLAIN,16));
        add(user1);

        JLabel id = new JLabel("Id : ");
        id.setBounds(70, 200, 100, 20);
        id.setFont(new Font("Railway",Font.PLAIN,16));
        add(id);

        JLabel id1 = new JLabel("");
        id1.setBounds(180, 200, 150, 20);
        id1.setFont(new Font("Railway",Font.PLAIN,16));
        add(id1);

        JLabel number = new JLabel("Id-Number : ");
        number.setBounds(70, 260, 100, 20);
        number.setFont(new Font("Railway",Font.PLAIN,16));
        add(number);

        JLabel number1 = new JLabel("");
        number1.setBounds(180, 260, 150, 20);
        number1.setFont(new Font("Railway",Font.PLAIN,16));
        add(number1);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(70, 320, 100, 20);
        gender.setFont(new Font("Railway",Font.PLAIN,16));
        add(gender);

        JLabel gender1 = new JLabel("");
        gender1.setBounds(180, 320, 100, 20);
        gender1.setFont(new Font("Railway",Font.PLAIN,16));
        add(gender1);

        JLabel country = new JLabel("Country : ");
        country.setBounds(400, 80, 100, 20);
        country.setFont(new Font("Railway",Font.PLAIN,16));
        add(country);

        JLabel country1 = new JLabel("");
        country1.setBounds(500, 80, 100, 20);
        country1.setFont(new Font("Railway",Font.PLAIN,16));
        add(country1);

        JLabel state = new JLabel("State : ");
        state.setBounds(400, 140, 100, 20);
        state.setFont(new Font("Railway",Font.PLAIN,16));
        add(state);

        JLabel state1 = new JLabel("");
        state1.setBounds(500, 140, 100, 20);
        state1.setFont(new Font("Railway",Font.PLAIN,16));
        add(state1);

        JLabel address = new JLabel("Address : ");
        address.setBounds(400, 200, 100, 20);
        address.setFont(new Font("Railway",Font.PLAIN,16));
        add(address);

        JLabel address1 = new JLabel("");
        address1.setBounds(500, 200, 500, 20);
        address1.setFont(new Font("Railway",Font.PLAIN,16));
        add(address1);

        JLabel phone = new JLabel("Phone-No : ");
        phone.setBounds(400, 260, 100, 20);
        phone.setFont(new Font("Railway",Font.PLAIN,16));
        add(phone);

        JLabel phone1 = new JLabel("");
        phone1.setBounds(500, 260, 100, 20);
        phone1.setFont(new Font("Railway",Font.PLAIN,16));
        add(phone1);

        JLabel email = new JLabel("Email-Id : ");
        email.setBounds(400, 320, 100, 20);
        email.setFont(new Font("Railway",Font.PLAIN,16));
        add(email);

        JLabel email1 = new JLabel("");
        email1.setBounds(500, 320, 200, 20);
        email1.setFont(new Font("Railway",Font.PLAIN,16));
        add(email1);

        ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("viewcustomer.jpg"));
        Image vcus1 = vcus.getImage().getScaledInstance(620, 250, Image.SCALE_DEFAULT);
        ImageIcon vcus2 = new ImageIcon(vcus1);
        JLabel image = new JLabel(vcus2);
        image.setBounds(100, 380, 620, 250);
        add(image);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(300, 360, 100, 30);
        add(back);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ") ;
            if(rs.next()){
                name1.setText(rs.getString("name"));
                user1.setText(rs.getString("username"));
                id1.setText(rs.getString("id_type"));
                number1.setText(rs.getString("number"));
                gender1.setText(rs.getString("gender"));
                country1.setText(rs.getString("country"));
                state1.setText(rs.getString("state"));
                address1.setText(rs.getString("address"));
                phone1.setText(rs.getString("phone"));
                email1.setText(rs.getString("email"));
            }else{
                JOptionPane.showMessageDialog(null, "No records found");
            }
        } catch (Exception e) {
           e.printStackTrace();
        }

    setVisible(true);
    }

    public static void main(String[] args) {
        new viewcustomerdetail("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
        }
        
    }
}
