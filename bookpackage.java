import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class bookpackage extends JFrame implements ActionListener,Runnable {

    JButton back,bp,cp;
    String user;
    JLabel user1,id1,number1,phone1,total1;
    JComboBox id2;
    JTextField tp1;
    bookpackage(String user){
    this.user=user;   
    setBounds(300,100 ,900 ,600 );
    setTitle("Book Packages");
    getContentPane().setBackground(Color.WHITE);
    setLayout(null);

    JLabel username = new JLabel("Username          : ");
    username.setBounds(40, 40, 200, 20);
    username.setFont(new Font("Railway",Font.BOLD,16));
    add(username);

     user1 = new JLabel("");
    user1.setBounds(180, 40, 100, 20);
    user1.setFont(new Font("Railway",Font.PLAIN,16));
    add(user1);

    JLabel sp = new JLabel("Select Package : ");
    sp.setBackground(Color.BLACK);
    sp.setFont(new Font("Railway",Font.BOLD,16));
    sp.setBounds(40,90 ,200 ,25 );
    add(sp);

    String package1[] = {"Select","Gold-Package","Silver-Package","Bronze-Package"};
     id2 = new JComboBox(package1);
   id2.setBounds(180, 90, 150, 25);
   id2.setBackground(Color.WHITE);
   id2.addItemListener(new ItemListener(){

    @Override
    public void itemStateChanged(ItemEvent e) {
       total1.setText("");
       tp1.setText("");
        
    }
    
   });
   add(id2);

    JLabel tp = new JLabel("Total Persons     :");
   tp.setBackground(Color.BLACK);
   tp.setFont(new Font("Railway",Font.BOLD,16));
   tp.setBounds(40,140 ,150 ,25 );
   add(tp);

    tp1 = new JTextField();
    tp1.setFont(new Font("Railway",Font.BOLD,16));
   tp1.setBounds(180,140 ,150 ,25 );
   add(tp1);

   JLabel id = new JLabel("ID                            :");
   id.setBackground(Color.BLACK);
   id.setFont(new Font("Railway",Font.BOLD,16));
   id.setBounds(40,190 ,150 ,25 );
   add(id);

    id1 = new JLabel("");
   id1.setBackground(Color.BLACK);
   id1.setFont(new Font("Railway",Font.BOLD,16));
   id1.setBounds(180,190 ,150 ,25 );
   add(id1);

    JLabel number = new JLabel("Number                 :");
   number.setBackground(Color.BLACK);
   number.setFont(new Font("Railway",Font.BOLD,16));
   number.setBounds(40,240 ,150 ,25 );
   add(number);

    number1 = new JLabel("");
   number1.setBackground(Color.BLACK);
   number1.setFont(new Font("Railway",Font.BOLD,16));
   number1.setBounds(180,240 ,150 ,25 );
   add(number1);

   JLabel phone = new JLabel("Phone-No             :");
   phone.setBackground(Color.BLACK);
   phone.setFont(new Font("Railway",Font.BOLD,16));
   phone.setBounds(40,290 ,150 ,25 );
   add(phone);

    phone1 = new JLabel("");
   phone1.setBackground(Color.BLACK);
   phone1.setFont(new Font("Railway",Font.BOLD,16));
   phone1.setBounds(180,290 ,150 ,25 );
   add(phone1);

   JLabel total = new JLabel("Total Price            :");
   total.setBackground(Color.BLACK);
   total.setFont(new Font("Railway",Font.BOLD,16));
   total.setBounds(40,350 ,150 ,25 );
   add(total);

    total1 = new JLabel("");
   total1.setBackground(Color.BLACK);
   total1.setFont(new Font("Railway",Font.BOLD,16));
   total1.setBounds(180,350 ,100 ,25 );
   add(total1);

    cp = new JButton("Check Price");
    cp.setBackground(Color.BLACK);
    cp.setForeground(Color.WHITE);
    cp.setBounds(40,400 ,120 ,30 );
    cp.addActionListener(this);
    add(cp); 

     bp = new JButton("Book Package");
    bp.setBackground(Color.BLACK);
    bp.setForeground(Color.WHITE);
    bp.setBounds(180,400 ,120 ,30 );
    bp.addActionListener(this);
    add(bp); 

     back = new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.setBounds(320,400 ,120 ,30 );
    back.addActionListener(this);
    add(back); 

    ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("bookpackage.jpg"));
    Image i11 = i10.getImage().getScaledInstance(450, 350, Image.SCALE_DEFAULT);
    ImageIcon i12 = new ImageIcon(i11);
    JLabel image = new JLabel(i12);
    image.setBounds(400, 30,450 ,350 );
    add(image);

    try {

        conn c = new conn();
        ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");
        // ResultSet rs = c.s.executeQuery("select * from customer where username='ayush' ");
        if(rs.next()){
            user1.setText(rs.getString("username"));
            id1.setText(rs.getString("id_type"));
            number1.setText(rs.getString("number"));
            phone1.setText(rs.getString("phone"));
        }

    } catch (Exception e) {
       e.printStackTrace();
    }

    // Thread t = new Thread(this);
    // t.start();

    setVisible(true);


    }

    public static void main(String[] args) {
        new bookpackage("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource() == bp){
        String username = user1.getText();
        String package1 = (String) id2.getSelectedItem();
        String totalperson = tp1.getText();
        String id = id1.getText();
        String  number= number1.getText();

        String  phone= phone1.getText();
        String  total= total1.getText();

        try {
            conn c = new conn();
            String query = "insert into bookpackage values('"+username+"','"+package1+"','"+totalperson+"','"+id+"','"+number+"','"+phone+"','"+total+"')";
            c.s.executeUpdate(query);
            Thread t = new Thread(this);
            t.start();
            // JOptionPane.showMessageDialog(null, "Package Booke Successfully");
            // setVisible(false);
        } catch (Exception e1) {
            e1.printStackTrace();
        }


       }else if(e.getSource() == cp){
        String package1 = (String) id2.getSelectedItem();
        int cost=0;
        if(package1.equals("Gold-Package")){
            cost+=12000;
        }else if(package1.equals("Silver-Package")){
            cost+=9000;
        }else if(package1.equals("Bronze-Package")){
            cost+=7000;
        }

        int persons = Integer.parseInt(tp1.getText());
        cost *= persons;
        total1.setText("Rs" + cost);
        // converting from int to string
       }else{
        System.out.println("back");
       }
        
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Wait your Package is Booking.....");
        try {
            Thread.sleep(6000);
            JOptionPane.showMessageDialog(null, "wait Data is retrieving...");
            Thread.sleep(5000);
            JOptionPane.showMessageDialog(null, "Package Booked Successfully");
            setVisible(false);
        } catch (InterruptedException e) {
            
            e.printStackTrace();
        }
        
        // JOptionPane.showMessageDialog(null, "Package Booke Successfully");
        // setVisible(false);
        
    }
}
