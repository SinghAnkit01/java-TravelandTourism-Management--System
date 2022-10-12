import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class signup extends JFrame implements ActionListener {
    JTextField user1,name1,answer1;
    Choice sq1;
    JPasswordField password1;
    JButton sign,back;
    signup(){
        setSize(750,350);
        setLocation(380,190);
        setLayout(null);
        setTitle("SignUp Page");
        // getContentPane().setBackground(Color.WHITE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(400, 0, 350, 300);
        add(panel,"North");

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        // panel2.setBackground(Color.BLACK);
        panel2.setBounds(0,20 ,400 ,320 );
        add(panel2,"West");

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("signup1.jpg"));
        Image i11 = i10.getImage().getScaledInstance(230, 200, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        panel.add(image);

        JLabel user = new JLabel("Username :");
        user.setBounds(30,10 ,100 ,25 );
        user.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(user);       
       
        user1 = new JTextField();
        user1.setBounds(140, 10, 160, 25);
        user1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        user1.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(user1);  
        
        JLabel name = new JLabel("Name :");
        name.setBounds(30,50 ,100 ,25 );
        name.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(name);       
       
        name1 = new JTextField();
        name1.setBounds(140, 50, 160, 25);
        name1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        name1.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(name1); 
        
        JLabel password = new JLabel("Password :");
        password.setBounds(30,90 ,100 ,25 );
        password.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(password);       
       
        password1 = new JPasswordField();
        password1.setBounds(140, 90, 160, 25);
        password1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        panel2.add(password1);
        
        JLabel answer  = new JLabel("Answer :");
        answer.setBounds(30,170 ,100 ,25 );
        answer.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(answer);       
       
        answer1 = new JTextField();
        answer1.setBounds(140, 170, 160, 25);
        answer1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        answer1.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(answer1);

        JLabel sq  = new JLabel("Security Question :");
        sq.setBounds(30,130 ,100 ,25 );
        sq.setFont(new Font("Railway",Font.BOLD,12));
        panel2.add(sq);       
       
        // sq1 = new JTextField();
        // sq1.setBounds(140, 130, 160, 25);
        // sq1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        // panel2.add(sq1);

         sq1 = new Choice();
         sq1.setBounds(140, 130, 160, 25);
         sq1.add("Select");
         sq1.add("School Nick Name");
         sq1.add("House Nick Name");
         sq1.add("Best Friends Name");
         sq1.add("Favourite Animal");
         sq1.add("Favourite Hero");
         panel2.add(sq1);

        sign= new JButton("SignUp");
        sign.addActionListener(this);
        sign.setBounds(50,220,100,25);
        sign.setBackground(Color.BLACK);
        sign.setBorder(BorderFactory.createDashedBorder(getForeground()));
        sign.setForeground(Color.WHITE);
        panel2.add(sign);

        back= new JButton("Back");
        back.addActionListener(this);
        back.setBounds(200,220,100,25);
        // back.setBackground(new Color(63,193,233));
        back.setBackground(Color.BLACK);
        back.setBorder(BorderFactory.createDashedBorder(getForeground()));
        back.setForeground(Color.WHITE);
        panel2.add(back);

        setVisible(true);

    }

    public static void main(String[] args) {
        new signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == sign){
            String question = sq1.getSelectedItem();
            String suser = user1.getText();
            String sname = name1.getText();
            String spassword = password1.getText();
            String sanswer = answer1.getText();
            
            try {
               
                if (suser.equals("")) {
                    JOptionPane.showMessageDialog(null, "Username is Required");
                    // this method is use to pop-up dialog box in windows
                } else if (sname.equals("")) {
                    JOptionPane.showMessageDialog(null, "Name is Required");
                } else if (spassword.equals("")) {
                    JOptionPane.showMessageDialog(null, "Password is Required");
                }  else if (sanswer.equals("")) {
                    JOptionPane.showMessageDialog(null, "Security answer is Required");
                } else{

                    try {
                        conn c = new conn();
                        ResultSet rs = c.s.executeQuery("select *  from account where username = '"+suser+"' ");
                        if(rs.next()){
                            JOptionPane.showMessageDialog(null, "Username already exist");
                        }else{
                            // conn c = new conn();
                            String query = "insert into account values('"+suser+"','"+sname+"','"+spassword+"','"+question+"','"+sanswer+"')";
                            c.s.executeUpdate(query);
                            JOptionPane.showMessageDialog(null,"Accounts details added successfully");
                            
                            user1.setText("");
                            name1.setText("");
                            password1.setText("");
                            answer1.setText("");
                        }
                    } catch (Exception e2) {
                       e2.printStackTrace();
                    }

                    // conn c = new conn();
                    // String query = "insert into account values('"+suser+"','"+sname+"','"+spassword+"','"+question+"','"+sanswer+"')";
                    // c.s.executeUpdate(query);
                    // JOptionPane.showMessageDialog(null,"Accounts details added successfully");
                    
                    // user1.setText("");
                    // name1.setText("");
                    // password1.setText("");
                    // answer1.setText("");
                }
            } catch (Exception e1) {
               e1.printStackTrace();
            }
        }else{
            setVisible(false);
            new login();
        }
        
    }
}
