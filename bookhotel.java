import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class bookhotel extends JFrame implements ActionListener {
    String user;
    JLabel user1,idno1,no1,phone1,price;
    // JComboBox service,ac1,food1;
    Choice service,ac1,food1;
    JTextField tp,tp1;
    JButton cp,bh,back;
    bookhotel(String user) {
        this.user=user;
        setBounds(300, 50, 850, 650);
        getContentPane().setBackground(Color.WHITE);
        setTitle("Book Hotel");
        setLayout(null);

        JLabel heading = new JLabel("BOOK HOTEL");
        heading.setBounds(200, 10, 500, 40);
        heading.setFont(new Font("Railway",Font.BOLD,20));
        add(heading);

        JLabel username = new JLabel("Username : ");
        username.setBounds(40, 80, 100, 20);
        username.setFont(new Font("Railway",Font.BOLD,16));
        add(username);

         user1 = new JLabel("");
        user1.setBounds(180, 80, 100, 20);
        user1.setFont(new Font("Railway",Font.BOLD,16));
        add(user1);

        JLabel sn = new JLabel("Service name: ");
        sn.setBounds(40, 120, 130, 20);
        sn.setFont(new Font("Railway",Font.BOLD,16));
        add(sn);

        // String package1[] = {"Select"};
       service = new Choice();
       service.add("Select");
       service.setBounds(180, 120, 150, 25);
       service.setBackground(Color.WHITE);
       service.addItemListener(new ItemListener(){

        @Override
        public void itemStateChanged(ItemEvent e) {
           tp.setText("");
           tp1.setText("");
           price.setText("");
           
            
        }
        
       });
       add(service);

       JLabel number = new JLabel("Total Person :");
       number.setBackground(Color.BLACK);
       number.setFont(new Font("Railway",Font.BOLD,16));
       number.setBounds(40,160 ,150 ,25 );
       add(number);
    
       tp = new JTextField("");
    //    tp.setBackground(Color.BLACK);
       tp.setFont(new Font("Railway",Font.BOLD,16));
       tp.setBounds(180,160 ,150 ,25 );
       add(tp);

       JLabel number1 = new JLabel("No Of Days :");
       number1.setBackground(Color.BLACK);
       number1.setFont(new Font("Railway",Font.BOLD,16));
       number1.setBounds(40,200 ,150 ,25 );
       add(number1);
    
       tp1 = new JTextField("");
    //    tp.setBackground(Color.BLACK);
       tp1.setFont(new Font("Railway",Font.BOLD,16));
       tp1.setBounds(180,200 ,150 ,25 );
       add(tp1);

       JLabel ac = new JLabel("AC NON AC: ");
       ac.setBounds(40, 240, 130, 20);
       ac.setFont(new Font("Railway",Font.BOLD,16));
       add(ac);

    //    String package2[] = {"Select","AC","NON-AC"};
      ac1 = new Choice();
      ac1.add("Select");
      ac1.add("Yes");
      ac1.add("No");
      ac1.setBounds(180, 240, 150, 25);
      ac1.setBackground(Color.WHITE);
      add(ac1);

      JLabel food= new JLabel("FOOD NO-FOOD: ");
      food.setBounds(40, 280, 130, 20);
      food.setFont(new Font("Railway",Font.BOLD,14));
      add(food);

    //   String package3[] = {"Select","FOOD","NO-FOOD"};
     food1 = new Choice();
     food1.add("Select");
     food1.add("Yes");
     food1.add("No");
     food1.setBounds(180, 280, 150, 25);
     food1.setBackground(Color.WHITE);
     add(food1);
    // id
     JLabel idno = new JLabel("ID : ");
     idno.setBounds(40, 320, 100, 20);
     idno.setFont(new Font("Railway",Font.BOLD,16));
     add(idno);
  
     idno1 = new JLabel("");
     idno1.setBounds(180, 320, 100, 20);
     idno1.setFont(new Font("Railway",Font.BOLD,16));
     add(idno1);
        // number
     JLabel no = new JLabel("Number : ");
     no.setBounds(40, 360, 100, 20);
     no.setFont(new Font("Railway",Font.BOLD,16));
     add(no);

     no1 = new JLabel("");
     no1.setBounds(180, 360, 140, 20);
     no1.setFont(new Font("Railway",Font.BOLD,16));
     add(no1);
    //  phone
     JLabel phone = new JLabel("Phone : ");
     phone.setBounds(40, 400, 100, 20);
     phone.setFont(new Font("Railway",Font.BOLD,16));
     add(phone);

     phone1 = new JLabel("");
     phone1.setBounds(180, 400, 100, 20);
     phone1.setFont(new Font("Railway",Font.BOLD,16));
     add(phone1);
    //  total price
     JLabel price1 = new JLabel("Total Price : ");
     price1.setBounds(40, 440, 120, 20);
     price1.setFont(new Font("Railway",Font.BOLD,16));
     add(price1);

     price = new JLabel("");
     price.setBounds(180, 440, 100, 20);
     price.setFont(new Font("Railway",Font.BOLD,16));
     add(price);
    //  buttons
    cp = new JButton("Check Price");
    cp.setBackground(Color.BLACK);
    cp.setForeground(Color.WHITE);
    cp.setBounds(40,500 ,120 ,30 );
    cp.addActionListener(this);
    add(cp); 

    bh = new JButton("Book Hotel");
    bh.setBackground(Color.BLACK);
    bh.setForeground(Color.WHITE);
    bh.setBounds(180,500 ,120 ,30 );
    bh.addActionListener(this);
    add(bh); 

     back = new JButton("Back");
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.setBounds(320,500 ,120 ,30 );
    back.addActionListener(this);
    add(back); 

        
    ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("hotel1.jpg"));
    Image i11 = i10.getImage().getScaledInstance(420, 380, Image.SCALE_DEFAULT);
    ImageIcon i12 = new ImageIcon(i11);
    JLabel image = new JLabel(i12);
    image.setBounds(370, 80,420 ,380 );
    add(image);

    try {
        conn c= new conn();
        ResultSet rs = c.s.executeQuery("select * from hotels ");
        while(rs.next()) {
            service.add(rs.getString("name"));
        }
    } catch (Exception e) {
       e.printStackTrace();
    }

    try {

        conn c = new conn();
        ResultSet rs = c.s.executeQuery("select * from customer where username='"+user+"' ");
        // ResultSet rs = c.s.executeQuery("select * from customer where username='ayush' ");
        if(rs.next()){
            user1.setText(rs.getString("username"));
            no1.setText(rs.getString("number"));
            phone1.setText(rs.getString("phone"));
            idno1.setText(rs.getString("id_type"));
            
        }else{
            // JOptionPane.showMessageDialog(null, "No package booked yet");
        }
      

    } catch (Exception e) {
       e.printStackTrace();
    }
       

        setVisible(true);
    }

    public static void main(String[] args) {
        new bookhotel("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == cp){
            try {
                conn c = new conn();
                ResultSet rs = c.s.executeQuery("select * from hotels where name ='"+service.getSelectedItem()+"'  ");

                while (rs.next()) {
                    int cost = Integer.parseInt(rs.getString("cost_per_day"));
                    int food = Integer.parseInt(rs.getString("food_charges"));
                    int ac= Integer.parseInt(rs.getString("ac_charges"));

                    // taking values for total no of persons;
                int persons = Integer.parseInt(tp.getText());
                int days =  Integer.parseInt(tp1.getText());
                // string to int

                // check whether user have select for ac
                String acselected = ac1.getSelectedItem();
                String foodselected = food1.getSelectedItem();
                if(persons * days > 0){
                    int total = 0;
                    total +=acselected.equals("Yes") ? ac :0;
                    // use of ternary operator to check whether ac is selected or not if ac selected then add per day ac_charges whatever
                    // has been accessed from database in ac variable; same for food
                    total +=foodselected.equals("Yes") ? food :0;
                    // cost per person
                    total+=cost;
                    total = total * persons * days;
                    price.setText("Rs "+total);
                    // int to string 
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter a valid number");
                }

                // cost *= persons * days;
                

                }

                // String package1 = (String) service.getSelectedItem();
                // int cost=0;
                // if(package1.equals("Gold-Package")){
                //     cost+=12000;
                // }else if(package1.equals("Silver-Package")){
                //     cost+=9000;
                // }else if(package1.equals("Bronze-Package")){
                //     cost+=7000;
                // }
        
                
            } catch (Exception e1) {
              e1.printStackTrace();
            }
          

           
        }else if(e.getSource() == bh){
            conn c = new conn();
            String query = "insert into bookhotel values('"+user1.getText()+"','"+service.getSelectedItem()+"','"+tp.getText()+"','"+tp1.getText()+"','"+ac1.getSelectedItem()+"','"+food1.getSelectedItem()+"','"+idno1.getText()+"','"+no1.getText()+"','"+phone1.getText()+"','"+price.getText()+"')";
            try {
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Hotel Booked Successfully" );
                setVisible(false);
            } catch (SQLException e1) {
                
                e1.printStackTrace();
            }

        }else{

        }
    }
}
