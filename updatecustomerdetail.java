import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class updatecustomerdetail extends JFrame implements ActionListener,Runnable{ 
    String user;
    JLabel username1,name1;
    JTextField id1,number1;
    JTextField gender1,country1,state1,address1,phone1,email1;
    JButton update,back;
    updatecustomerdetail(String user){
        this.user=user;
        setBounds(300, 100, 950, 520);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Update Customer Detail");

        JLabel heading = new JLabel("UPDATE CUSTOMER INFORMATION");
        heading.setBounds(150, 20, 500, 40);
        heading.setFont(new Font("Railway",Font.BOLD,20));
        add(heading);

        JLabel name = new JLabel("Name : ");
        name.setBounds(70, 80, 100, 20);
        name.setFont(new Font("Railway",Font.PLAIN,16));
        add(name);

        name1 = new JLabel("");
        name1.setBounds(220, 80, 180, 25);
        name1.setFont(new Font("Railway",Font.PLAIN,16));
        add(name1);

        JLabel username = new JLabel("Username : ");
        username.setBounds(70, 140, 100, 20);
        username.setFont(new Font("Railway",Font.PLAIN,16));
        add(username);

        username1 = new JLabel("");
        username1.setBounds(220, 140, 180, 25);
        username1.setFont(new Font("Railway",Font.PLAIN,16));
        add(username1);

        JLabel id = new JLabel("Id : ");
        id.setBounds(70, 200, 100, 20);
        id.setFont(new Font("Railway",Font.PLAIN,16));
        add(id);

         id1 = new JTextField("");
        id1.setBounds(220, 200, 150, 25);
        // id1.setFont(new Font("Railway",Font.PLAIN,16));
        add(id1);

        JLabel number = new JLabel("Id-Number : ");
        number.setBounds(70, 260, 100, 20);
        number.setFont(new Font("Railway",Font.PLAIN,16));
        add(number);

         number1 = new JTextField("");
        number1.setBounds(220, 260, 150, 25);
        // number1.setFont(new Font("Railway",Font.PLAIN,16));
        add(number1);

        JLabel gender = new JLabel("Gender : ");
        gender.setBounds(70, 320, 100, 20);
        gender.setFont(new Font("Railway",Font.PLAIN,16));
        add(gender);

         gender1 = new JTextField("");
        gender1.setBounds(220, 320, 150, 25);
        gender1.setFont(new Font("Railway",Font.PLAIN,16));
        add(gender1);

        JLabel country = new JLabel("Country : ");
        country.setBounds(400, 80, 100, 20);
        country.setFont(new Font("Railway",Font.PLAIN,16));
        add(country);

         country1 = new JTextField("");
        country1.setBounds(500, 80, 150, 25);
        country1.setFont(new Font("Railway",Font.PLAIN,16));
        add(country1);

        JLabel state = new JLabel("State : ");
        state.setBounds(400, 140, 100, 20);
        state.setFont(new Font("Railway",Font.PLAIN,16));
        add(state);

         state1 = new JTextField("");
        state1.setBounds(500, 140, 150, 25);
        state1.setFont(new Font("Railway",Font.PLAIN,16));
        add(state1);

        JLabel address = new JLabel("Address : ");
        address.setBounds(400, 200, 100, 20);
        address.setFont(new Font("Railway",Font.PLAIN,16));
        add(address);

        address1 = new JTextField("");
        address1.setBounds(500, 200, 150, 25);
        address1.setFont(new Font("Railway",Font.PLAIN,16));
        add(address1);

        JLabel phone = new JLabel("Phone-No : ");
        phone.setBounds(400, 260, 100, 20);
        phone.setFont(new Font("Railway",Font.PLAIN,16));
        add(phone);

         phone1 = new JTextField("");
        phone1.setBounds(500, 260, 150, 25);
        phone1.setFont(new Font("Railway",Font.PLAIN,16));
        add(phone1);

        JLabel email = new JLabel("Email-Id : ");
        email.setBounds(400, 320, 100, 20);
        email.setFont(new Font("Railway",Font.PLAIN,16));
        add(email);

         email1 = new JTextField("");
        email1.setBounds(500, 320, 150, 25);
        email1.setFont(new Font("Railway",Font.PLAIN,16));
        add(email1);

        try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ") ;
            if(rs.next()){
                name1.setText(rs.getString("name"));
                username1.setText(rs.getString("username"));
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

        update= new JButton("Update");
        update.addActionListener(this);
        update.setBounds(   220,380,100,25);
        update.setBackground(Color.BLACK);
        update.setFont(new Font("Railway",Font.BOLD,16));
        update.setForeground(Color.WHITE);
        add(update);

        ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("updatedetail.jpg"));
        Image vcus1 = vcus.getImage().getScaledInstance(300, 400, Image.SCALE_DEFAULT);
        ImageIcon vcus2 = new ImageIcon(vcus1);
        JLabel image = new JLabel(vcus2);
        image.setBounds(650, 30, 300, 400);
        add(image);

        setVisible(true);
    }

    public static void main(String[] args) {
        new updatecustomerdetail("");
    }
    int clicks=0;
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == update){
            String id = id1.getText();
            String idno = number1.getText();
            String gen = gender1.getText();
            String coun = country1.getText();
            String stat = state1.getText();
            String add = address1.getText();
            String pho = phone1.getText();
            String email = email1.getText();

            try {

                if (id.equals("")) {
                    JOptionPane.showMessageDialog(null, " Id is Required");
                    // this method is use to pop-up dialog box in windows
                } else if (idno.equals("")) {
                    JOptionPane.showMessageDialog(null, "Id-number is Required");
                }else if (gen.equals("")) {
                    JOptionPane.showMessageDialog(null, "gender is Required");
                } else if (stat.equals("")) {
                    JOptionPane.showMessageDialog(null, "state is Required");
                } else if (coun.equals("")) {
                    JOptionPane.showMessageDialog(null, "country is Required");
                }  else if (add.equals("")) {
                    JOptionPane.showMessageDialog(null, "address is Required");
                }  else if (email.equals("")) {
                    JOptionPane.showMessageDialog(null, "Email is Required");
                }else if (pho.equals("") || pho.length()<9 || pho.length()>10) {
                    JOptionPane.showMessageDialog(null, "Valid Phone-no is Required");
                }else{
                    conn c = new conn();
                    c.s.executeUpdate("update customer set id_type='"+id+"',number='"+idno+"', address='"+add+"',country='"+coun+"',state='"+stat+"',email='"+email+"',phone='"+pho+"',gender='"+gen+"' where username='"+user+"'  ");
                    JOptionPane.showMessageDialog(null, "Wait your records are being updated");
                    Thread t;
                    clicks++;
                    t = new Thread(this);
                    t.start();
                }
        }catch(Exception e1){
            e1.printStackTrace();
        }
        
    }
}

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "User information updated successfully");
            if(clicks==2){
                JOptionPane.showMessageDialog(null,"Only 1 limits are pending");
            }
            if(clicks>2){
                JOptionPane.showMessageDialog(null, "Update Limit Exceeds");
                update.setEnabled(false);
                JOptionPane.showMessageDialog(null, "wait for 5 seconds");
                Thread.sleep(10000);
                update.setEnabled(true);
               
                // setVisible(false);
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
}
