import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class viewbookhotel extends JFrame implements ActionListener  {
    String user;
    JLabel user1, sp1, tp1,id1,number1,phone1,total1,pid1,no,pho,tot,food1;
    JButton back,p1,p2,p3;
    viewbookhotel(String user){
        this.user = user;
        setBounds(300, 90, 800, 600);
        setTitle("View Packages");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel heading  = new JLabel("VIEW BOOKED HOTELS DETAILS");
        heading.setBounds(280, 10, 300, 30);
        heading.setFont(new Font("Railway", Font.BOLD, 18));
        add(heading);

        JLabel username = new JLabel("Username          : ");
        username.setBounds(40, 40, 200, 20);
        username.setFont(new Font("Railway", Font.BOLD, 16));
        // username.setFont(new Font("Railway", Font.BOLD, 16));
        add(username);

        user1 = new JLabel("");
        user1.setBounds(210, 40, 100, 20);
        // user1.setBackground(Color.BLACK);
        user1.setFont(new Font("Railway", Font.BOLD, 16));
        add(user1);

        JLabel sp = new JLabel("Hotel Name       : ");
        sp.setBackground(Color.BLACK);
        // sp.setFont(new Font("Railway", Font.BOLD, 16));
        sp.setFont(new Font("Railway", Font.BOLD, 16));
        sp.setBounds(40, 90, 200, 25);
        add(sp);

        sp1 = new JLabel("");
        sp1.setBounds(210, 90, 150, 25);
        // sp1.setBackground(Color.BLACK);
        sp1.setFont(new Font("Railway", Font.BOLD, 16));
        add(sp1);

        JLabel tp = new JLabel("Total Persons    :");
        tp.setBackground(Color.BLACK);
        tp.setFont(new Font("Railway", Font.BOLD, 16));
        tp.setBounds(40, 140, 170, 25);
        add(tp);

        tp1 = new JLabel("");
        tp1.setBounds(210, 140, 150, 25);
        // tp1.setBackground(Color.BLACK);
        tp1.setFont(new Font("Railway", Font.BOLD, 16));
        add(tp1);

        JLabel id = new JLabel("Total Days          :");
        id.setBackground(Color.BLACK);
        id.setFont(new Font("Railway", Font.BOLD, 16));
        id.setBounds(40, 190, 170, 25);
        add(id);

        id1 = new JLabel("");
        // id1.setBackground(Color.BLACK);
        id1.setFont(new Font("Railway", Font.BOLD, 16));
        id1.setBounds(210, 190, 150, 25);
        add(id1);

        JLabel number = new JLabel("Ac-Included        :");
        number.setBackground(Color.BLACK);
        number.setFont(new Font("Railway", Font.BOLD, 16));
        number.setBounds(40, 240, 170, 25);
        add(number);

        number1 = new JLabel("");
        // number1.setBackground(Color.BLACK);
        number1.setFont(new Font("Railway", Font.BOLD, 16));
        number1.setBounds(210, 240, 150, 25);
        add(number1);

        JLabel phone = new JLabel("Food-Included   :");
        phone.setBackground(Color.BLACK);
        phone.setFont(new Font("Railway", Font.BOLD, 16));
        phone.setBounds(40, 290, 170, 25);
        add(phone);

        food1 = new JLabel("");
        // food1.setBackground(Color.BLACK);
        food1.setFont(new Font("Railway", Font.BOLD, 16));
        food1.setBounds(210, 290, 150, 25);
        add(food1);

        JLabel personid = new JLabel("ID                          :");
        personid.setBackground(Color.BLACK);
        personid.setFont(new Font("Railway", Font.BOLD, 16));
        personid.setBounds(40, 340, 170, 25);
        add(personid);

        pid1 = new JLabel("");
        // pid1.setBackground(Color.BLACK);
        pid1.setFont(new Font("Railway", Font.BOLD, 16));
        pid1.setBounds(210, 340, 150, 25);
        add(pid1);

        JLabel no1 = new JLabel("Number               :");
        no1.setBackground(Color.BLACK);
        no1.setFont(new Font("Railway", Font.BOLD, 16));
        no1.setBounds(40, 390, 170, 25);
        add(no1);

        no = new JLabel("");
        // no.setBackground(Color.BLACK);
        no.setFont(new Font("Railway", Font.BOLD, 16));
        no.setBounds(210, 390, 150, 25);
        add(no);

        JLabel phone1 = new JLabel("Phone-No           :");
        phone1.setBackground(Color.BLACK);
        phone1.setFont(new Font("Railway", Font.BOLD, 16));
        phone1.setBounds(40, 440, 170, 25);
        add(phone1);

        pho = new JLabel("");
        // pho.setBackground(Color.BLACK);
        pho.setFont(new Font("Railway", Font.BOLD, 16));
        pho.setBounds(210, 440, 150, 25);
        add(pho);

        JLabel total1 = new JLabel("Total Price           :");
        total1.setBackground(Color.BLACK);
        total1.setFont(new Font("Railway", Font.BOLD, 16));
        total1.setBounds(40, 490, 170, 25);
        add(total1);

        tot = new JLabel("");
        // tot.setBackground(Color.BLACK);
        tot.setFont(new Font("Railway", Font.BOLD, 16));
        tot.setBounds(210, 490, 100, 25);
        add(tot);

        back = new JButton("Back");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(280,510 ,120 ,30 );
        back.addActionListener(this);
        add(back); 

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("viewpackage.jpg"));
        Image i11 = i10.getImage().getScaledInstance(390, 350, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        image.setBounds(350, 100,390 ,350 );
        add(image);

        p1 = new JButton("Book");
        p1.setBackground(Color.BLACK);
        p1.setForeground(Color.WHITE);
        p1.setBounds(10,10 ,70 ,25 );
        p1.addActionListener(this);
        add(p1); 

        p2 = new JButton("Book");
        p2.setBackground(Color.BLACK);
        p2.setForeground(Color.WHITE);
        p2.setBounds(90,10 ,70 ,25 );
        p2.addActionListener(this);
        add(p2); 

        p3 = new JButton("Book");
        p3.setBackground(Color.BLACK);
        p3.setForeground(Color.WHITE);
        p3.setBounds(170,10 ,70 ,25 );
        p3.addActionListener(this);
        add(p3); 
        try {
            // JOptionPane.showMessageDialog(null, "Click Book to view more hotels");
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username='"+user+"' ");
            // ResultSet rs = c.s.executeQuery("select * from bookhotel where username='ayush' ");
            if(rs.next()){
                JOptionPane.showMessageDialog(null, "Click Book to view more hotels");
                user1.setText(rs.getString("username"));
                sp1.setText(rs.getString("service_name"));
                tp1.setText(rs.getString("persons"));
                id1.setText(rs.getString("days"));
                number1.setText(rs.getString("ac"));
                food1.setText(rs.getString("food"));
                pid1.setText(rs.getString("id"));
                no.setText(rs.getString("number"));
                pho.setText(rs.getString("phone"));
                tot.setText(rs.getString("cost"));
               
          
            }else{
                JOptionPane.showMessageDialog(null, "No package booked yet");
            }
          
    
        } catch (Exception e) {
           e.printStackTrace();
        }



        setVisible(true);
    }

    public static void main(String[] args) {
        new viewbookhotel("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == p1){
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username='"+user+"' and service_name='Lalit Hotel' ");
            // ResultSet rs = c.s.executeQuery("select * from bookhotel where username='ayush' and service_name='Lalit Hotel' ");
            if(rs.next()){
                user1.setText(rs.getString("username"));
                sp1.setText(rs.getString("service_name"));
                tp1.setText(rs.getString("persons"));
                id1.setText(rs.getString("days"));
                number1.setText(rs.getString("ac"));
                food1.setText(rs.getString("food"));
                pid1.setText(rs.getString("id"));
                no.setText(rs.getString("number"));
                pho.setText(rs.getString("phone"));
                tot.setText(rs.getString("cost"));
               
          
            }else{
                JOptionPane.showMessageDialog(null, "No More Hotel booked ");
            }
          
    
        } catch (Exception e1) {
           e1.printStackTrace();
        }


       }else if(e.getSource() == p2){
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username='"+user+"' and service_name='Blue Roof' ");
            // ResultSet rs = c.s.executeQuery("select * from bookhotel where username='ayush' and service_name='Blue Roof' ");
            if(rs.next()){
                user1.setText(rs.getString("username"));
                sp1.setText(rs.getString("service_name"));
                tp1.setText(rs.getString("persons"));
                id1.setText(rs.getString("days"));
                number1.setText(rs.getString("ac"));
                food1.setText(rs.getString("food"));
                pid1.setText(rs.getString("id"));
                no.setText(rs.getString("number"));
                pho.setText(rs.getString("phone"));
                tot.setText(rs.getString("cost"));
               
          
            }else{
                JOptionPane.showMessageDialog(null, "No more hotel booked ");
            }
          
    
        } catch (Exception e2) {
           e2.printStackTrace();
        }

       }else if(e.getSource() == p3){
        try {

            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username='"+user+"' and service_name='JW Charriot Hotel' ");
            // ResultSet rs = c.s.executeQuery("select * from bookhotel where username='ayush' and service_name='JW Charriot Hotel' ");
            if(rs.next()){
                user1.setText(rs.getString("username"));
                sp1.setText(rs.getString("service_name"));
                tp1.setText(rs.getString("persons"));
                id1.setText(rs.getString("days"));
                number1.setText(rs.getString("ac"));
                food1.setText(rs.getString("food"));
                pid1.setText(rs.getString("id"));
                no.setText(rs.getString("number"));
                pho.setText(rs.getString("phone"));
                tot.setText(rs.getString("cost"));
               
          
            }else{
                JOptionPane.showMessageDialog(null, "No more hotel booked ");
            }
          
    
        } catch (Exception e3) {
           e3.printStackTrace();
        }
       }else{
        setVisible(false);
        new dashboard(user);
       }
        
    }
}
