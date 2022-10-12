// import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class loading  extends JFrame implements ActionListener,Runnable {
    String user;
    JProgressBar bar;
    Thread t;
    loading(String user){
        this.user=user;
        setSize(650, 400);
        setLocation(400, 150);
        setLayout(null);
        setTitle("Loading...");
        getContentPane().setBackground(Color.WHITE);

        JLabel text  = new JLabel("Travel and Tourism Application");
        text.setBounds(50,20 ,600 ,40 );
        text.setForeground(Color.ORANGE);
        text.setFont(new Font("Railway", Font.BOLD, 35));
        add(text);
        // creatig progressbar
         bar = new JProgressBar();
        bar.setBounds(150,100 ,300 ,35 );
        // this method indicates 0% on progressbar.
        bar.setStringPainted(true);
        add(bar);

        JLabel wait = new JLabel("Loading, please wait...");
        wait.setBounds(220, 130, 190, 30);
        wait.setFont(new Font("Railway", Font.BOLD, 14));
        wait.setForeground(Color.ORANGE);
        add(wait);

        JLabel username = new JLabel("Welcome " +user);
        username.setBounds(20, 310, 400, 30);
        username.setFont(new Font("Railway", Font.BOLD, 16));
        username.setForeground(Color.BLACK);
        add(username);

        t = new Thread(this);
        t.start();


        setVisible(true);
        // moving progressbar from 1 to 100
        
    }

    public static void main(String[] args) {
        new loading("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
        
    }

    @Override
    public void run() {
        try {
            for(int i=1;i<=101;i++){
                int max = bar.getMaximum();
                // indicates total max value 100
                int value = bar.getValue();
                // indicates current value
                if(value<max){
                    bar.setValue(bar.getValue()+1);
                }else{
                    setVisible(false);
                    // new class object
                    new dashboard(user);
                }
                Thread.sleep(50);
                // this indicates speed of loader
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
