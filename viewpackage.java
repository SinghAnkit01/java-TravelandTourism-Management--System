import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class viewpackage extends JFrame implements ActionListener {
    JButton back,p1,p2,p3;
    String user;
    JLabel user1, sp1, tp1,id1,number1,phone1,total1;

    viewpackage(String user) {
        this.user = user;
        setBounds(300, 100, 800, 500);
        setTitle("View Packages");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading  = new JLabel("View Package Details");
        heading.setBounds(290, 0, 300, 30);
        heading.setFont(new Font("Railway", Font.BOLD, 20));
        add(heading);

        JLabel username = new JLabel("Username               : ");
        username.setBounds(40, 40, 200, 20);
        username.setFont(new Font("Railway", Font.BOLD, 16));
        add(username);

        user1 = new JLabel("");
        user1.setBounds(210, 40, 100, 20);
        user1.setFont(new Font("Railway", Font.PLAIN, 16));
        add(user1);

        JLabel sp = new JLabel("Selected Package : ");
        sp.setBackground(Color.BLACK);
        sp.setFont(new Font("Railway", Font.BOLD, 16));
        sp.setBounds(40, 90, 200, 25);
        add(sp);

        sp1 = new JLabel("");
        sp1.setBounds(210, 90, 150, 25);
        sp1.setFont(new Font("Railway", Font.PLAIN, 16));
        add(sp1);

        JLabel tp = new JLabel("Total Persons          :");
        tp.setBackground(Color.BLACK);
        tp.setFont(new Font("Railway", Font.BOLD, 16));
        tp.setBounds(40, 140, 170, 25);
        add(tp);

        tp1 = new JLabel("");
        tp1.setBounds(210, 140, 150, 25);
        tp1.setFont(new Font("Railway", Font.PLAIN, 16));
        add(tp1);

        JLabel id = new JLabel("ID                                 :");
        id.setBackground(Color.BLACK);
        id.setFont(new Font("Railway", Font.BOLD, 16));
        id.setBounds(40, 190, 170, 25);
        add(id);

        id1 = new JLabel("");
        id1.setBackground(Color.BLACK);
        id1.setFont(new Font("Railway", Font.BOLD, 16));
        id1.setBounds(210, 190, 150, 25);
        add(id1);

        JLabel number = new JLabel("Number                      :");
        number.setBackground(Color.BLACK);
        number.setFont(new Font("Railway", Font.BOLD, 16));
        number.setBounds(40, 240, 170, 25);
        add(number);

        number1 = new JLabel("");
        number1.setBackground(Color.BLACK);
        number1.setFont(new Font("Railway", Font.BOLD, 16));
        number1.setBounds(210, 240, 150, 25);
        add(number1);

        JLabel phone = new JLabel("Phone-No                  :");
        phone.setBackground(Color.BLACK);
        phone.setFont(new Font("Railway", Font.BOLD, 16));
        phone.setBounds(40, 290, 170, 25);
        add(phone);

        phone1 = new JLabel("");
        phone1.setBackground(Color.BLACK);
        phone1.setFont(new Font("Railway", Font.BOLD, 16));
        phone1.setBounds(210, 290, 150, 25);
        add(phone1);

        JLabel total = new JLabel("Total Price                 :");
        total.setBackground(Color.BLACK);
        total.setFont(new Font("Railway", Font.BOLD, 16));
        total.setBounds(40, 350, 170, 25);
        add(total);

        total1 = new JLabel("");
        total1.setBackground(Color.BLACK);
        total1.setFont(new Font("Railway", Font.BOLD, 16));
        total1.setBounds(210, 350, 100, 25);
        add(total1);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(180,400 ,120 ,30 );
        back.addActionListener(this);
        add(back); 

        p1 = new JButton("Gold");
        p1.setBackground(Color.YELLOW);
        p1.setForeground(Color.WHITE);
        p1.setBounds(0,0 ,70 ,30 );
        p1.addActionListener(this);
        add(p1); 

        p2 = new JButton("Silver");
        p2.setBackground(Color.GRAY);
        p2.setForeground(Color.WHITE);
        p2.setBounds(90,0 ,70 ,30 );
        p2.addActionListener(this);
        add(p2); 

        p3 = new JButton("Bronze");
        p3.setBackground(Color.ORANGE);
        p3.setForeground(Color.WHITE);
        p3.setBounds(180,0 ,80 ,30 );
        p3.addActionListener(this);
        add(p3); 

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("viewpackage.jpg"));
        Image i11 = i10.getImage().getScaledInstance(390, 350, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        image.setBounds(350, 50,390 ,350 );
        add(image);

        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bookpackage where username='"+user+"' ");
            // ResultSet rs = c.s.executeQuery("select * from bookpackage where username='ayush' ");
            if(rs.next()){
                user1.setText(rs.getString("username"));
                id1.setText(rs.getString("id"));
                number1.setText(rs.getString("number"));
                phone1.setText(rs.getString("phone"));
                tp1.setText(rs.getString("persons"));
                sp1.setText(rs.getString("package"));
                total1.setText(rs.getString("price"));
            }else{
                JOptionPane.showMessageDialog(null, "No package booked yet");
            }
          
    
        } catch (Exception e) {
           e.printStackTrace();
        }

        // JTabbedPane tab = new JTabbedPane();
        // JPanel p1 =new JPanel();
        // // p1.setBounds(0,0 ,200 ,10 );
        // // p1.setLayout(null);
        // p1.setBackground(Color.WHITE);  
        // tab.addTab("Package1",null ,p1 );
        // add(tab);

        setVisible(true);
    }

    public static void main(String[] args) {
        new viewpackage("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == back){
            setVisible(false);
        }else if(e.getSource() == p1){

            try {

                conn c = new conn();
                // ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");
                ResultSet rs = c.s.executeQuery("select * from bookpackage where username='ayush' and package='Gold-Package' ");
                if(rs.next()){
                    user1.setText(rs.getString("username"));
                    id1.setText(rs.getString("id"));
                    number1.setText(rs.getString("number"));
                    phone1.setText(rs.getString("phone"));
                    tp1.setText(rs.getString("persons"));
                    sp1.setText(rs.getString("package"));
                    total1.setText(rs.getString("price"));
                }else{
                   
                    user1.setText("");
                    id1.setText("");
                    number1.setText("");
                    phone1.setText("");
                    tp1.setText("");
                    sp1.setText("");
                    total1.setText("");
                    JOptionPane.showMessageDialog(null, "No gold package found");
                }
              
        
            } catch (Exception e1) {
               e1.printStackTrace();
            }

        }else if(e.getSource() == p2){
            try {

                conn c = new conn();
                // ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");
                ResultSet rs = c.s.executeQuery("select * from bookpackage where username='ayush' and package='Silver-Package' ");
                if(rs.next()){
                    user1.setText(rs.getString("username"));
                    id1.setText(rs.getString("id"));
                    number1.setText(rs.getString("number"));
                    phone1.setText(rs.getString("phone"));
                    tp1.setText(rs.getString("persons"));
                    sp1.setText(rs.getString("package"));
                    total1.setText(rs.getString("price"));
                }else{
              
                    user1.setText("");
                    id1.setText("");
                    number1.setText("");
                    phone1.setText("");
                    tp1.setText("");
                    sp1.setText("");
                    total1.setText("");
                    JOptionPane.showMessageDialog(null, "No Silver package found");
                }
              
        
            } catch (Exception e1) {
               e1.printStackTrace();
            }
        }else if(e.getSource() == p3){
            try {

                conn c = new conn();
                // ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");
                ResultSet rs = c.s.executeQuery("select * from bookpackage where username='ayush' and package='Bronze-Package' ");
                if(rs.next()){
                    user1.setText(rs.getString("username"));
                    id1.setText(rs.getString("id"));
                    number1.setText(rs.getString("number"));
                    phone1.setText(rs.getString("phone"));
                    tp1.setText(rs.getString("persons"));
                    sp1.setText(rs.getString("package"));
                    total1.setText(rs.getString("price"));
                }else{
                   
                    user1.setText("");
                    id1.setText("");
                    number1.setText("");
                    phone1.setText("");
                    tp1.setText("");
                    sp1.setText("");
                    total1.setText("");
                    JOptionPane.showMessageDialog(null, "No Bronze package found");
                }
              
        
            } catch (Exception e1) {
               e1.printStackTrace();
            }
        }
    }
}
