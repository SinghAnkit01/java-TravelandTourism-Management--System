import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
public class addpersonaldetail extends JFrame implements ActionListener {
    JLabel username1,number,name1;
    Choice id1;
    JComboBox id2,country1;
    JTextField number1,state1;
    JTextField address1,phone1,email1;
    JRadioButton male,female;
    JButton add,back;
    String user;
    addpersonaldetail(String user){
        this.user=user;
        setBounds(300,100 ,750 ,550 );
        setLayout(null);
        setTitle("Add Personal Details");
        getContentPane().setBackground(Color.WHITE);
        
        // username
        JLabel username = new JLabel("Username : ");
        username.setBackground(Color.BLACK);
        username.setFont(new Font("Railway",Font.BOLD,16));
        username.setBounds(30,50 ,150 ,25 );
        add(username);

         username1 = new JLabel("");
        username1.setBackground(Color.BLACK);
        username1.setFont(new Font("Railway",Font.BOLD,16));
        username1.setBounds(130,50 ,150 ,25 );
        add(username1);

        // id
        JLabel id = new JLabel("Id-Card       : ");
        id.setBackground(Color.BLACK);
        id.setFont(new Font("Railway",Font.BOLD,16));
        id.setBounds(30,90 ,100 ,25 );
        add(id);

        // id1 = new JLabel("101");
        // id1.setBackground(Color.BLACK);
        // id1.setFont(new Font("Railway",Font.BOLD,16));
        // id1.setBounds(130,90 ,150 ,25 );
        // add(id1);

        // 1 method
        // Choice id1 = new Choice();
        // id1.setBounds(130, 90, 150, 25);
        // id1.add("Select");
        // id1.add("Aadhar-Card");
        // id1.add("Pan-Card");
        // id1.add("Passport");
        // id1.add("Driving Liscence");
        // add(id1);
        // 2 method
        String container[] = {"Select","passport","AAdhar-card","pan-card","Driving-Liscence","Ration-Card"};
         id2 = new JComboBox(container);
        id2.setBounds(130, 90, 150, 25);
        id2.setBackground(Color.WHITE);
        add(id2);

        number = new JLabel("Number      :");
        number.setBackground(Color.BLACK);
        number.setFont(new Font("Railway",Font.BOLD,16));
        number.setBounds(30,130 ,150 ,25 );
        add(number);

        number1 = new JTextField();
        // number1.setBackground(Color.BLACK);
        number1.setFont(new Font("Railway",Font.BOLD,16));
        number1.setBounds(130,130 ,150 ,25 );
        add(number1);

        
        JLabel num = new JLabel("(No of Id-Card)");
        num.setBackground(Color.BLACK);
        num.setFont(new Font("Railway",Font.BOLD,8));
        num.setBounds(30,150 ,150 ,25 );
        add(num);

        JLabel name = new JLabel("Name          : ");
        name.setBackground(Color.BLACK);
        name.setFont(new Font("Railway",Font.BOLD,16));
        name.setBounds(30,170 ,150 ,25 );
        add(name);

        name1 = new JLabel("");
        // name1.setBackground(Color.BLACK);
        name1.setFont(new Font("Railway",Font.BOLD,16));
        name1.setBounds(130,170 ,150 ,25 );
        add(name1);

        JLabel gender = new JLabel("Gender       : ");
        gender.setBackground(Color.BLACK);
        gender.setFont(new Font("Railway",Font.BOLD,16));
        gender.setBounds(30,210 ,150 ,25 );
        add(gender);

        male = new JRadioButton("Male");
        male.setBackground(Color.WHITE);
        male.setBounds(130,210 ,80 , 25);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(210,210 ,100 , 25);
        female.setBackground(Color.WHITE);
        add(female);
        // only one at a time in Button Group class
        ButtonGroup gendergroup1 = new ButtonGroup();
        gendergroup1.add(male);
        gendergroup1.add(female);

        number = new JLabel("Address     :");
        number.setBackground(Color.BLACK);
        number.setFont(new Font("Railway",Font.BOLD,16));
        number.setBounds(30,250 ,150 ,25 );
        add(number);

        address1 = new JTextField();
        // address1.setRows(3);
        // address1.setColumns(10);
        address1.setFont(new Font("Railway",Font.BOLD,16));
        address1.setBounds(130,250 ,150 ,25 );
        add(address1);

        number = new JLabel("Country     :");
        number.setBackground(Color.BLACK);
        number.setFont(new Font("Railway",Font.BOLD,16));
        number.setBounds(30,290 ,150 ,25 );
        add(number);

        String country[] = {"Select","India","Usa","China","Japan","Indonesia","Thailand","Russia","Germany","UK","Others"};
        country1 = new JComboBox(country);
        country1.setBackground(Color.WHITE);
        // country1.setFont(new Font("Railway",Font.BOLD,16));
        country1.setBounds(130,290 ,150 ,25 );
        // add(country1);
        
        // country1.addItemListener(new ItemListener(){
        //     // int clicks=0;
        //     @Override
             
        //     public void itemStateChanged(ItemEvent e) {
                
        //         try {
        //             // state1.addItem("");
        //             conn c = new conn();
        //             ResultSet rs = c.s.executeQuery("select state_name from country where country_name = '"+country1.getSelectedItem()+"' ");
        //             // ResultSet rs = c.s.executeQuery("select state_name from country where country_name = 'Usa' ");
        //              while(rs.next()) {
                       
        //                 String state2 = rs.getString("state_name");
        //                 System.out.println(state2);
        //                 // state1.addItem(state2);
        //                 // clicks++;
        //                 // System.out.println(clicks);
        //             }
                    
        //         } catch (Exception e1) {
        //           e1.printStackTrace();
        //         }
                
        //     }
            
        // });

      
        add(country1);

        // try {
        //     conn c= new conn();
        //     ResultSet rs = c.s.executeQuery("select state_name from country where country_name = '"+country1.getSelectedItem()+"' ");
        //     if(rs.next()){
        //         String aa = rs.getString("state_name");
        //         System.out.println(aa);
        //     }
        // } catch (Exception e) {
        //    e.printStackTrace();
        // }

        JLabel number1 = new JLabel("State           :");
        number1.setBackground(Color.BLACK);
        number1.setFont(new Font("Railway",Font.BOLD,16));
        number1.setBounds(30,330 ,150 ,25 );
        add(number1);
        state1 = new JTextField();
        state1.setBackground(Color.WHITE);
        state1.setBounds(130,330 ,150 ,25 );
        add(state1);

        JLabel phone = new JLabel("Phone-No  :");
        phone.setBackground(Color.BLACK);
        phone.setFont(new Font("Railway",Font.BOLD,16));
        phone.setBounds(30,370 ,150 ,25 );
        add(phone);
        phone1 = new JTextField();
        phone1.setBackground(Color.WHITE);
        phone1.setBounds(130,370 ,150 ,25 );
        add(phone1);

        JLabel email = new JLabel("EMail-Id      :");
        email.setBackground(Color.BLACK);
        email.setFont(new Font("Railway",Font.BOLD,16));
        email.setBounds(30,410 ,150 ,25 );
        add(email);
        email1 = new JTextField();
        email1.setBackground(Color.WHITE);
        email1.setBounds(130,410 ,150 ,25 );
        add(email1);

       add = new JButton("Add");
       add.setBackground(Color.BLACK);
       add.setForeground(Color.WHITE);
       add.setBounds(40,460 ,100 ,25 );
       add.addActionListener(this);
       add(add); 

       back = new JButton("Back");
       back.setBackground(Color.BLACK);
       back.setForeground(Color.WHITE);
       back.setBounds(180,460 ,100 ,25 );
       back.addActionListener(this);
       add(back); 

       ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("customerdetail.jpg"));
       Image i11 = i10.getImage().getScaledInstance(400, 400, Image.SCALE_DEFAULT);
       ImageIcon i12 = new ImageIcon(i11);
       JLabel image = new JLabel(i12);
       image.setBounds(300, 50,400 ,400 );
       add(image);

       try {
        conn c = new conn();
        ResultSet rs = c.s.executeQuery("select * from account where username='"+user+"' ");
        while (rs.next()) {
            String user2 = rs.getString("username");
            String name2 = rs.getString("name");
            username1.setText(user2);
            name1.setText(name2);
        }
       } catch (Exception e) {
        e.printStackTrace();
       }
      
        
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new addpersonaldetail("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
     if(e.getSource() == add){
        String username = username1.getText();
        String id =(String) id2.getSelectedItem();
        // this method returns an object with combobox and we cannot stored it into string so we have to typecast it
        String number = number1.getText();
        String name = name1.getText();
        String gender = null;
        if(male.isSelected()){
            gender="Male";
        }else{
            gender="Female";
        }
        
        String address = address1.getText();
        String country =(String) country1.getSelectedItem();
        String state = state1.getText();
        String phone = phone1.getText();
        String emailid = email1.getText();

        try {
            if(username.equals("")){
                JOptionPane.showMessageDialog(null,"Number cant be empty");
            }else if(number.equals("")){
                JOptionPane.showMessageDialog(null,"Number cant be empty");
            }else if(address.equals("")){
                JOptionPane.showMessageDialog(null,"Address cant be empty");
            }else if(state.equals("")){
                JOptionPane.showMessageDialog(null,"state cant be empty");
            }else if(phone.equals("")){
                JOptionPane.showMessageDialog(null,"Phone number cant be empty");
            }else if(emailid.equals("")){
                JOptionPane.showMessageDialog(null,"emailid cant be empty");
            }else{
                conn c =  new conn();
                String query = "insert into customer values('"+username+"','"+id+"','"+number+"','"+name+"','"+gender+"','"+country+"','"+state+"','"+address+"','"+phone+"','"+emailid+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Customer details added successfully");
            }
        } catch (Exception e1) {
            e1.printStackTrace();
        }

     }else{
        JOptionPane.showMessageDialog(null,"Something error occured" );
     }
        
    }
}
