import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class forgetpassword extends JFrame implements ActionListener,Runnable {
    JTextField user1,pass1,name1,sq1,answer1;
    JLabel password1;
    JButton sign,retrieve,back;
    forgetpassword(){
       
        setBounds(350,200 ,750 ,350 );
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setTitle("Forget-Password");
        JPanel panel = new JPanel();
        // panel.setBackground(Color.PINK);
        panel.setBackground(Color.WHITE);
        panel.setBounds(400, 0, 350, 350);
        add(panel,"North");

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        // panel2.setBackground(Color.BLACK);
        panel2.setBounds(0,0 ,400 ,320 );
        add(panel2,"West");

        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("fp.jpg"));
        Image i11 = i10.getImage().getScaledInstance(300, 280, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        image.setBounds(20, 60, 220, 200);
        panel.add(image);

        JLabel user = new JLabel("Username :");
        user.setBounds(30,50 ,100 ,25 );
        user.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(user);       
       
        user1 = new JTextField();
        user1.setBounds(120, 50, 160, 25);
        user1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        user1.setFont(new Font("Railway",Font.BOLD,14));
        // user1.setEditable(false);
        panel2.add(user1); 

        JLabel name = new JLabel("Name         :");
        name.setBounds(30,90 ,100 ,25 );
        name.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(name);       
       
        name1 = new JTextField();
        name1.setBounds(120, 90, 160, 25);
        name1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        name1.setFont(new Font("Railway",Font.BOLD,14));
        name1.setEditable(false);
        panel2.add(name1); 

        
        JLabel sq  = new JLabel("Security Question :");
        sq.setBounds(30,130 ,100 ,25 );
        sq.setFont(new Font("Railway",Font.BOLD,10));
        panel2.add(sq);   

        
        sq1 = new JTextField();
        sq1.setBounds(120, 130, 160, 25);
        sq1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        sq1.setFont(new Font("Railway",Font.BOLD,14));
        sq1.setEditable(false);
        panel2.add(sq1); 
           
        JLabel answer  = new JLabel("Answer :");
        answer.setBounds(30,170 ,100 ,25 );
        answer.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(answer);       
       
        answer1 = new JTextField();
        answer1.setBounds(120, 170, 160, 25);
        answer1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        answer1.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(answer1);

        JLabel password = new JLabel("Password :");
        password.setBounds(30,210 ,100 ,25 );
        password.setFont(new Font("Railway",Font.BOLD,14));
        panel2.add(password);       
       
        password1 = new JLabel();
        password1.setBounds(120, 210, 160, 25);
        // password1.setFocusable(false);
        // password1.setBorder(BorderFactory.createDashedBorder(getForeground()));
        panel2.add(password1);
        
        retrieve= new JButton("Retrieve");
        retrieve.addActionListener(this);
        retrieve.setBounds(300,170,80,25);
        retrieve.setBackground(Color.GRAY);
        retrieve.setBorder(BorderFactory.createDashedBorder(getForeground()));
        retrieve.setForeground(Color.WHITE);
        panel2.add(retrieve);
        
        
        sign= new JButton("Search");
        sign.addActionListener(this);
        sign.setBounds(300,50,80,25);
        sign.setBackground(Color.GRAY);
        sign.setBorder(BorderFactory.createDashedBorder(getForeground()));
        sign.setForeground(Color.WHITE);
        panel2.add(sign);

        back= new JButton("Back");
        back.addActionListener(this);
        back.setBounds(140,250,80,25);
        back.setBackground(Color.GRAY);
        back.setBorder(BorderFactory.createDashedBorder(getForeground()));
        back.setForeground(Color.WHITE);
        panel2.add(back);


        setVisible(true);
    }

    public static void main(String[] args) {
        new forgetpassword();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
       String user = user1.getText();
       String ans = answer1.getText();
       String security = sq1.getText();
       if(e.getSource() == sign){
       try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from account where username  = '"+user+"' ");
            if(rs.next()){
                String name= rs.getString("name");
                String question= rs.getString("question");
                name1.setText(name);
                sq1.setText(question);

            }else{
                JOptionPane.showMessageDialog(null, "Username does not exist");
            }
       } catch (Exception e1) {
        e1.printStackTrace();
       }
        
    }else if(e.getSource() == retrieve){
        JOptionPane.showMessageDialog(null, "Wait your password is being retrieving");
      try {
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from account where username  = '"+user+"' and answer ='"+ans+"' and question='"+security+"' ");
            if(rs.next()){
                String password= rs.getString("password");
                String name= rs.getString("name");
                //  JOptionPane.showMessageDialog(null, "Wait your password is being retrieving");
                Thread t;
                t = new Thread();
                t.start();
                Thread.sleep(7000);

                password1.setText(password); 
                JOptionPane.showMessageDialog(null, " Hii "+name+" Your Password is " +password);
            }else{
                JOptionPane.showMessageDialog(null,"Answer does not matched");
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
    }else{
        setVisible(false);
        new login();
    }
}

    @Override
    public void run() {
    //  try {
    //     Thread.sleep(10000);
           
    //    String user = user1.getText();
    //    String ans = answer1.getText();
    //    String security = sq1.getText();
    //     try {
    //         conn c = new conn();
    //         ResultSet rs = c.s.executeQuery("select * from account where username  = '"+user+"' and answer ='"+ans+"' and question='"+security+"' ");
    //         if(rs.next()){
    //             String password= rs.getString("password");
    //             String name= rs.getString("name");
    //             //  JOptionPane.showMessageDialog(null, "Wait your password is being retrieving");
    //              password1.setText(password); 
    //              JOptionPane.showMessageDialog(null, " Hii "+name+" Your Password is " +password);
    //          }else{
    //              JOptionPane.showMessageDialog(null,"Answer does not matched");
    //          }
    //      } catch (Exception e3) {
    //          e3.printStackTrace();
    //      }
    // } catch (InterruptedException e) {
        
    //     e.printStackTrace();
    // }
    }
}
