import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
// import java.sql.ResultSet;
public class checkpackage extends JFrame implements ActionListener {

    checkpackage(){
    setBounds(300,100 ,900 ,600 );
    setTitle("Search Packages");
    // setLayout(null);
    getContentPane().setBackground(Color.WHITE);
    //creating panel for package1
    JTabbedPane tab = new JTabbedPane();
    JPanel p1 = checkpackage1();
    
    // for creating tab on frames
    tab.addTab("Package1",null ,p1 );

    JPanel p2 = checkpackage2();
     tab.addTab("Package2",null ,p2 );

     JPanel p3 = checkpackage3();
     tab.addTab("Package3",null ,p3);
     // title,icon,component
     add(tab);  

    // JPanel p1 =new JPanel();
    // p1.setLayout(null);
    // p1.setBackground(Color.WHITE);  
    
    // // if i want to add anything on package1 we have add it on panel.

    // JLabel l1 = new JLabel("GOLD PACKAGE");
    // l1.setBounds(50,5 ,300 ,35 );
    // l1.setForeground(Color.YELLOW);
    // l1.setFont(new Font("Railway",Font.BOLD,30));
    // p1.add(l1);

    // JLabel l2 = new JLabel("6 Days and 7 Nights");
    // l2.setBounds(50,60 ,300 ,35 );
    // l2.setForeground(Color.RED);
    // l2.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l2);

    
    // JLabel l3 = new JLabel("Airport Assistance");
    // l3.setBounds(50,115 ,300 ,35 );
    // l3.setForeground(Color.BLUE);
    // l3.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l3);

    // JLabel l4 = new JLabel("Full Day City Tour With Guide");
    // l4.setBounds(50,170 ,300 ,35 );
    // l4.setForeground(Color.RED);
    // l4.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l4);

    // JLabel l5 = new JLabel("Daily Buffet");
    // l5.setBounds(50,225 ,300 ,35 );
    // l5.setForeground(Color.BLUE);
    // l5.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l5);

    // JLabel l6 = new JLabel("Welcome Drinks on Arrival");
    // l6.setBounds(50,280 ,300 ,35 );
    // l6.setForeground(Color.RED);
    // l6.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l6);

    // JLabel l7 = new JLabel("Full Day 3 Island Cruise");
    // l7.setBounds(50,335 ,300 ,35 );
    // l7.setForeground(Color.BLUE);
    // l7.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l7);

    // JLabel l8 = new JLabel("Special English Speaking Guide");
    // l8.setBounds(50,390 ,300 ,35 );
    // l8.setForeground(Color.RED);
    // l8.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l8);

    // JLabel l9 = new JLabel("Book Now");
    // l9.setBounds(130,430 ,300 ,35 );
    // l9.setForeground(Color.BLACK);
    // l9.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l9);

    // JLabel l10 = new JLabel("Summer Special");
    // l10.setBounds(100,470 ,300 ,35 );
    // l10.setForeground(Color.MAGENTA);
    // l10.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l10);

    // JLabel l11 = new JLabel("Rs 12000/-");
    // l11.setBounds(500,470 ,300 ,35 );
    // l11.setForeground(Color.CYAN);
    // l11.setFont(new Font("Railway",Font.BOLD,20));
    // p1.add(l11);

    // ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("package3.jpg"));
    // Image vcus1 = vcus.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
    // ImageIcon vcus2 = new ImageIcon(vcus1);
    // JLabel image = new JLabel(vcus2);
    // image.setBounds(350, 80, 500, 300);
    // p1.add(image);



    // // for creating tab on frames
  
    // tab.addTab("Package1",null ,p1 );
    // tab.addTab("Package2",null ,p1 );
    // tab.addTab("Package3",null ,p1 );
    // // title,icon,component
    // add(tab);   
    
      

    setVisible(true);
    }

    public JPanel checkpackage1() {
    JPanel p1 =new JPanel();
    p1.setLayout(null);
    p1.setBackground(Color.WHITE);  
    
    // if i want to add anything on package1 we have add it on panel.

    JLabel l1 = new JLabel("GOLD PACKAGE");
    l1.setBounds(50,5 ,300 ,35 );
    l1.setForeground(Color.YELLOW);
    l1.setFont(new Font("Railway",Font.BOLD,30));
    p1.add(l1);

    JLabel l2 = new JLabel("6 Days and 7 Nights");
    l2.setBounds(50,60 ,300 ,35 );
    l2.setForeground(Color.RED);
    l2.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l2);

    
    JLabel l3 = new JLabel("Airport Assistance");
    l3.setBounds(50,115 ,300 ,35 );
    l3.setForeground(Color.BLUE);
    l3.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l3);

    JLabel l4 = new JLabel("Full Day City Tour With Guide");
    l4.setBounds(50,170 ,300 ,35 );
    l4.setForeground(Color.RED);
    l4.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l4);

    JLabel l5 = new JLabel("Daily Buffet");
    l5.setBounds(50,225 ,300 ,35 );
    l5.setForeground(Color.BLUE);
    l5.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l5);

    JLabel l6 = new JLabel("Welcome Drinks on Arrival");
    l6.setBounds(50,280 ,300 ,35 );
    l6.setForeground(Color.RED);
    l6.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l6);

    JLabel l7 = new JLabel("Full Day 3 Island Cruise");
    l7.setBounds(50,335 ,300 ,35 );
    l7.setForeground(Color.BLUE);
    l7.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l7);

    JLabel l8 = new JLabel("Special English Speaking Guide");
    l8.setBounds(50,390 ,300 ,35 );
    l8.setForeground(Color.RED);
    l8.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l8);

    JLabel l9 = new JLabel("Book Now");
    l9.setBounds(130,430 ,300 ,35 );
    l9.setForeground(Color.BLACK);
    l9.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l9);

    JLabel l10 = new JLabel("Summer Special");
    l10.setBounds(100,470 ,300 ,35 );
    l10.setForeground(Color.MAGENTA);
    l10.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l10);

    JLabel l11 = new JLabel("(Rs 12000/-) + Tax");
    l11.setBounds(500,470 ,300 ,35 );
    l11.setForeground(Color.CYAN);
    l11.setFont(new Font("Railway",Font.BOLD,20));
    p1.add(l11);

    ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("package3.jpg"));
    Image vcus1 = vcus.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
    ImageIcon vcus2 = new ImageIcon(vcus1);
    JLabel image = new JLabel(vcus2);
    image.setBounds(350, 80, 500, 300);
    p1.add(image);

    return p1;
    // returning panel and storing it on to the JPanel
        
    }

    public JPanel checkpackage2() {
        JPanel p1 =new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);  
        
        // if i want to add anything on package1 we have add it on panel.
    
        JLabel l1 = new JLabel("SILVER PACKAGE");
        l1.setBounds(50,5 ,300 ,35 );
        l1.setForeground(Color.RED);
        l1.setFont(new Font("Railway",Font.BOLD,30));
        p1.add(l1);
    
        JLabel l2 = new JLabel("5 Days and 6 Nights");
        l2.setBounds(50,60 ,300 ,35 );
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l2);
    
        
        JLabel l3 = new JLabel("Meet and Greet at airport");
        l3.setBounds(50,115 ,300 ,35 );
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l3);
    
        JLabel l4 = new JLabel("Half Day City Tour With Guide");
        l4.setBounds(50,170 ,300 ,35 );
        l4.setForeground(Color.RED);
        l4.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l4);
    
        JLabel l5 = new JLabel("Evening Buffet only");
        l5.setBounds(50,225 ,300 ,35 );
        l5.setForeground(Color.BLUE);
        l5.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l5);
    
        JLabel l6 = new JLabel("Drinks upto 75% off");
        l6.setBounds(50,280 ,300 ,35 );
        l6.setForeground(Color.RED);
        l6.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l6);
    
        JLabel l7 = new JLabel("Dinner upto 75% off");
        l7.setBounds(50,335 ,300 ,35 );
        l7.setForeground(Color.BLUE);
        l7.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l7);
    
        JLabel l8 = new JLabel("Special Non-English Speaking Guide");
        l8.setBounds(50,390 ,400 ,35 );
        l8.setForeground(Color.RED);
        l8.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l8);
    
        JLabel l9 = new JLabel("Book Now");
        l9.setBounds(130,430 ,300 ,35 );
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l9);
    
        JLabel l10 = new JLabel("Summer Special");
        l10.setBounds(100,470 ,300 ,35 );
        l10.setForeground(Color.MAGENTA);
        l10.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l10);
    
        JLabel l11 = new JLabel("(Rs 9000/-) + Tax");
        l11.setBounds(500,470 ,300 ,35 );
        l11.setForeground(Color.CYAN);
        l11.setFont(new Font("Railway",Font.BOLD,20));
        p1.add(l11);
    
        ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("package2.jpg"));
        Image vcus1 = vcus.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
        ImageIcon vcus2 = new ImageIcon(vcus1);
        JLabel image = new JLabel(vcus2);
        image.setBounds(350, 80, 500, 300);
        p1.add(image);
    
        return p1;
        // returning panel and storing it on to the JPanel
            
        }

        public JPanel checkpackage3() {
            JPanel p1 =new JPanel();
            p1.setLayout(null);
            p1.setBackground(Color.WHITE);  
            
            // if i want to add anything on package1 we have add it on panel.
        
            JLabel l1 = new JLabel("BRONZE PACKAGE");
            l1.setBounds(50,5 ,300 ,35 );
            l1.setForeground(Color.BLACK);
            l1.setFont(new Font("Railway",Font.BOLD,30));
            p1.add(l1);
        
            JLabel l2 = new JLabel("4 Days and 5 Nights");
            l2.setBounds(50,60 ,300 ,35 );
            l2.setForeground(Color.RED);
            l2.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l2);
        
            
            JLabel l3 = new JLabel("Return Airfare");
            l3.setBounds(50,115 ,300 ,35 );
            l3.setForeground(Color.BLUE);
            l3.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l3);
        
            JLabel l4 = new JLabel("Half Day City Tour Without Guide");
            l4.setBounds(50,170 ,300 ,35 );
            l4.setForeground(Color.RED);
            l4.setFont(new Font("Railway",Font.BOLD,16));
            p1.add(l4);
        
            JLabel l5 = new JLabel("Free Clubbing, Horse Riding & games");
            l5.setBounds(50,225 ,500 ,35 );
            l5.setForeground(Color.BLUE);
            l5.setFont(new Font("Railway",Font.BOLD,16));
            p1.add(l5);
        
            JLabel l6 = new JLabel("Drinks upto 50% off");
            l6.setBounds(50,280 ,300 ,35 );
            l6.setForeground(Color.RED);
            l6.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l6);
        
            JLabel l7 = new JLabel("Dinner upto 50% off");
            l7.setBounds(50,335 ,300 ,35 );
            l7.setForeground(Color.BLUE);
            l7.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l7);
        
            JLabel l8 = new JLabel("No-Guide");
            l8.setBounds(50,390 ,300 ,35 );
            l8.setForeground(Color.RED);
            l8.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l8);
        
            JLabel l9 = new JLabel("Book Now");
            l9.setBounds(130,430 ,300 ,35 );
            l9.setForeground(Color.BLACK);
            l9.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l9);
        
            JLabel l10 = new JLabel("Winter Special");
            l10.setBounds(100,470 ,300 ,35 );
            l10.setForeground(Color.MAGENTA);
            l10.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l10);
        
            JLabel l11 = new JLabel("(Rs 7000/-) + Tax");
            l11.setBounds(500,470 ,300 ,35 );
            l11.setForeground(Color.CYAN);
            l11.setFont(new Font("Railway",Font.BOLD,20));
            p1.add(l11);
        
            ImageIcon vcus = new ImageIcon(ClassLoader.getSystemResource("package1.jpg"));
            Image vcus1 = vcus.getImage().getScaledInstance(500, 300, Image.SCALE_DEFAULT);
            ImageIcon vcus2 = new ImageIcon(vcus1);
            JLabel image = new JLabel(vcus2);
            image.setBounds(350, 80, 500, 300);
            p1.add(image);
        
            return p1;
            // returning panel and storing it on to the JPanel
                
            }

    public static void main(String[] args) {
        new checkpackage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
    }
}
