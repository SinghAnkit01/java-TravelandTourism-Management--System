import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class intro extends JFrame implements Runnable {

    intro(){
        Thread t;
        // creating object of thread class explicitly by using Thread keyword


        // creating frame
        // setSize(1200,600);
        // setLocation(380,80);
        // setUndecorated(true);
        // creating image and putting it onto the screen
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        // Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);


        setVisible(true);

        
        

        
        t = new Thread(this);
        // initializing object of thread class by using thread keyword which refers to current object; 
        t.start();
        // calling an abstract method of Runnable interface which is void run() by using object.start() method.
       
    }

    public static void main(String[] args) {
        System.out.println("Welcome to my project TTMS");
       intro frame =  new intro();
       int x=1;
        for(int i=1;i<=500; x+=6,i+=6){
            frame.setLocation(720-(x+i)/2,350-(i/2));
            // frame.setSize(i*2,i);
            frame.setSize((x+i),i);
            try {
                Thread.sleep(20);
                // thread.sleep=30-->process=slow
                // thread.sleep=10-->process=fast
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(7000);
            new login();
            // setVisible(false);
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }

       
    }
}
