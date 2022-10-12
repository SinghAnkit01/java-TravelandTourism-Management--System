import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class checkhotels extends JFrame implements ActionListener,Runnable{

    Thread t;
    JLabel l1,l2,l3,l4,l5,l6,l7;
    JLabel[] label = new JLabel[]{l1,l2,l3,l4,l5,l6,l7};
    JLabel caption;
    // this label is foe setting text on image means hotel name
    checkhotels(){
        setBounds(300, 100, 650, 500);
        setTitle("View Hotels");
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        caption = new JLabel();
        caption.setBounds(50,400 ,1000 ,70 );
        caption.setFont(new Font("Railway",Font.PLAIN,40));
        caption.setForeground(Color.WHITE);
        add(caption);

        ImageIcon i11,i12,i13,i14,i15,i16,i17;
        // creating array of ImageIcon class
        ImageIcon[] image = new ImageIcon[]{ i11=null,i12=null,i13=null,i14=null,i15=null,i16=null,i17=null};

        Image j1,j2,j3,j4,j5,j6,j7;
        // creating array of Image class
        Image[] imagenew = new Image[]{ j1=null,j2=null,j3=null,j4=null,j5=null,j6=null,j7=null};

        ImageIcon n1,n2,n3,n4,n5,n6,n7;
        // creating array of ImageIcon class again to take image from image to imageicon
        ImageIcon[] imageiconnew = new ImageIcon[]{ n1=null,n2=null,n3=null,n4=null,n5=null,n6=null,n7=null};

        for(int i=0;i<=6;i++){
         image[i] = new ImageIcon(ClassLoader.getSystemResource("hotel"+(i+1)+".jpg"));
        //  settting 1 as dynamic by using for loop hotel1.jpg 1-> changes according to for loop
        imagenew[i] = image[i].getImage().getScaledInstance(650, 500, Image.SCALE_DEFAULT);
        imageiconnew[i] = new ImageIcon(imagenew[i]);
        label[i]= new JLabel(imageiconnew[i]);
        label[i].setBounds(0, 0,650 ,500 );
        add(label[i]);
        }

        t = new Thread(this);
        t.start();


        setVisible(true);
    }

    public static void main(String[] args) {
        new checkhotels();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      
        
    }

    @Override
    public void run() {
        // JLabel l1,l2,l3,l4,l5,l6,l7;
        // JLabel[] label1 = new JLabel[]{l1=null,l2=null,l3=null,l4=null,l5=null,l6=null,l7=null};
        String text[] = new String[]{"Hotel Radison Blue","Old King Palace","Lalit Hotel","JW Charriot Hotel","Blue Roof Hotel","Leela Hotel","Taj Hotel"};
       try {
        for(int i=0;i<=6;i++){
            label[i].setVisible(true);
            // setting text on image
            caption.setText(text[i]);
            Thread.sleep(4000);
            label[i].setVisible(false);

        }
       } catch (Exception e) {
        
       }
        
    }
}
