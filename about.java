// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class about extends JFrame implements ActionListener {    
    JButton back;
    about(){
        setBounds(300, 90, 500, 550);
        setTitle("About Us");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JLabel l1 = new JLabel("ABOUT");
        l1.setBounds(200,10 ,100 ,40 );
        l1.setForeground(Color.ORANGE);
        l1.setFont(new Font("Railway",Font.BOLD,20));
        add(l1);

        String s="About project.......................\n" +
                   "Travel and Tourism Management system with ankit singh .\n" +
                   "Advantage of this system are to book hitels packages and many other things that user can do on website .";    

        TextArea area = new TextArea(s,10,40,Scrollbar.VERTICAL);
        area.setEditable(false);
        area.setBounds(20,80 ,450 ,300 );
        add(area);
        // JScrollPane pane = new JScrollPane(area);
        // add(pane);\
        
        back = new JButton("Back");
        // back.setBackground(Color.BLACK);
        // back.setForeground(Color.WHITE);
        back.addActionListener(this);
        back.setBounds(180, 400, 100, 30);
        add(back);

        setVisible(true);
      
    }

   
    

    public static void main(String[] args) {
        new about();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == back){
        setVisible(false);
      }
        
    }
}
