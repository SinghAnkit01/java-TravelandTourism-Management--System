import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class dashboard extends JFrame implements ActionListener, Runnable {
    JButton pd, upd, vpd, dpd, cp, bp, vp, vh, bh, vbh, des, payment, calculate, notepad;
    String user;

    dashboard(String user) {
        this.user = user;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        // this method used to maximize both length and breadth to their maximum
        // position.
        setLayout(null);

        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.ORANGE);
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        // heading adding on first panel
        JLabel heading = new JLabel("Dashboard");
        heading.setBackground(Color.BLACK);
        heading.setFont(new Font("Railway", Font.BOLD, 24));
        heading.setBounds(40, 10, 300, 40);
        p1.add(heading);
        // creating panel for adding buttons on west direction
        JPanel p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.ORANGE);
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        // adding buttons on panel p2
        pd = new JButton("Add Personal Details");
        pd.addActionListener(this);
        pd.setBounds(0, 0, 300, 50);
        pd.setBackground(Color.ORANGE);
        pd.setFont(new Font("Railway", Font.BOLD, 16));
        // pd.setBorder(BorderFactory.createDashedBorder(getForeground()));
        pd.setMargin(new Insets(0, 0, 0, 70));
        // new Insets class takes four arguments top,left,bottom,right;
        // if we want to move text on left side we have to give margin from right or
        // vice-versa
        // less-margin will move to right side.
        // more-margin will move to left-side.
        pd.setForeground(Color.BLACK);
        p2.add(pd);

        vpd = new JButton("View Personal Details");
        vpd.addActionListener(this);
        vpd.setBounds(0, 50, 300, 50);
        vpd.setBackground(Color.ORANGE);
        vpd.setFont(new Font("Railway", Font.BOLD, 16));
        vpd.setMargin(new Insets(0, 0, 0, 60));
        vpd.setForeground(Color.BLACK);
        p2.add(vpd);

        upd = new JButton("Update Personal Details");
        upd.addActionListener(this);
        upd.setBounds(0, 100, 300, 50);
        upd.setBackground(Color.ORANGE);
        upd.setFont(new Font("Railway", Font.BOLD, 16));
        upd.setMargin(new Insets(0, 0, 0, 50));
        upd.setForeground(Color.BLACK);
        p2.add(upd);

        dpd = new JButton("Delete Personal Details");
        dpd.addActionListener(this);
        dpd.setBounds(0, 150, 300, 50);
        dpd.setBackground(Color.ORANGE);
        dpd.setFont(new Font("Railway", Font.BOLD, 16));
        dpd.setMargin(new Insets(0, 0, 0, 60));
        dpd.setForeground(Color.BLACK);
        p2.add(dpd);

        cp = new JButton("Check Packages");
        cp.addActionListener(this);
        cp.setBounds(0, 200, 300, 50);
        cp.setBackground(Color.ORANGE);
        cp.setFont(new Font("Railway", Font.BOLD, 16));
        cp.setMargin(new Insets(0, 0, 0, 110));
        cp.setForeground(Color.BLACK);
        p2.add(cp);

        bp = new JButton("Book Package");
        bp.addActionListener(this);
        bp.setBounds(0, 250, 300, 50);
        bp.setBackground(Color.ORANGE);
        bp.setFont(new Font("Railway", Font.BOLD, 16));
        bp.setMargin(new Insets(0, 0, 0, 120));
        bp.setForeground(Color.BLACK);
        p2.add(bp);

        vp = new JButton("View Package");
        vp.addActionListener(this);
        vp.setBounds(0, 300, 300, 50);
        vp.setBackground(Color.ORANGE);
        vp.setFont(new Font("Railway", Font.BOLD, 16));
        vp.setMargin(new Insets(0, 0, 0, 120));
        vp.setForeground(Color.BLACK);
        p2.add(vp);

        vh = new JButton("View Hotels");
        vh.addActionListener(this);
        vh.setBounds(0, 350, 300, 50);
        vh.setBackground(Color.ORANGE);
        vh.setFont(new Font("Railway", Font.BOLD, 16));
        vh.setMargin(new Insets(0, 0, 0, 130));
        vh.setForeground(Color.BLACK);
        p2.add(vh);

        vbh = new JButton("View Booked Hotels");
        vbh.addActionListener(this);
        vbh.setBounds(0, 400, 300, 50);
        vbh.setBackground(Color.ORANGE);
        vbh.setFont(new Font("Railway", Font.BOLD, 16));
        vbh.setMargin(new Insets(0, 0, 0, 70));
        vbh.setForeground(Color.BLACK);
        p2.add(vbh);

        des = new JButton("Destination");
        des.addActionListener(this);
        des.setBounds(0, 450, 300, 50);
        des.setBackground(Color.ORANGE);
        des.setFont(new Font("Railway", Font.BOLD, 16));
        des.setMargin(new Insets(0, 0, 0, 135));
        des.setForeground(Color.BLACK);
        p2.add(des);

        payment = new JButton("Payments");
        payment.addActionListener(this);
        payment.setBounds(0, 500, 300, 50);
        payment.setBackground(Color.ORANGE);
        payment.setFont(new Font("Railway", Font.BOLD, 16));
        payment.setMargin(new Insets(0, 0, 0, 145));
        payment.setForeground(Color.BLACK);
        p2.add(payment);

        calculate = new JButton("Calculator");
        calculate.addActionListener(this);
        calculate.setBounds(0, 550, 300, 50);
        calculate.setBackground(Color.ORANGE);
        calculate.setFont(new Font("Railway", Font.BOLD, 16));
        calculate.setMargin(new Insets(0, 0, 0, 145));
        calculate.setForeground(Color.BLACK);
        p2.add(calculate);

        notepad = new JButton("About-US");
        notepad.addActionListener(this);
        notepad.setBounds(0, 600, 300, 50);
        notepad.setBackground(Color.ORANGE);
        notepad.setFont(new Font("Railway", Font.BOLD, 16));
        notepad.setMargin(new Insets(0, 0, 0, 150));
        notepad.setForeground(Color.BLACK);
        p2.add(notepad);

        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("dashboard1.jpg"));
        Image i11 = i10.getImage().getScaledInstance(700, 500, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image = new JLabel(i12);
        image.setBounds(480, 160, 700, 500);
        add(image);

        JLabel heading1 = new JLabel("TRAVEL INDIA WITH ANKIT!!!");
        heading1.setBackground(Color.ORANGE);
        heading1.setForeground(Color.ORANGE);
        heading1.setFont(new Font("Railway", Font.BOLD, 28));
        heading1.setBounds(620, 100, 700, 40);
        add(heading1);

        Thread t;
        t = new Thread(this);
        t.start();

        setVisible(true);
    }

    public static void main(String[] args) {
        new dashboard("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // pd,upd,vpd,dpd,cp,bp,vp,vh,bh,vbh,des,payment,calculate,notepad
        if (e.getSource() == pd) {
            System.out.println("Personal Details");
            new addpersonaldetail(user);
        } else if (e.getSource() == upd) {
            System.out.println("update prsonal details");
            new updatecustomerdetail(user);
        } else if (e.getSource() == vpd) {
            System.out.println("View personal details");
            new viewcustomerdetail(user);
        } else if (e.getSource() == dpd) {
            System.out.println("Delete personal details");
            new deletedetails(user);
        } else if (e.getSource() == cp) {
            System.out.println("check Package");
            new checkpackage();
        } else if (e.getSource() == bp) {
            System.out.println("Book Package");
            new bookpackage(user);
        } else if (e.getSource() == vp) {
            System.out.println("view Package");
            new viewpackage(user);
        } else if (e.getSource() == vh) {
            System.out.println("view Hotels");
            new checkhotels();
        } else if (e.getSource() == des) {
            System.out.println("Destination");
            new destination();
        } else if (e.getSource() == vbh) {
            System.out.println("View book hotel");
            new viewbookhotel(user);
        } else if (e.getSource() == payment) {
            System.out.println("Do Payment");
            new paytmtravel();
        } else if (e.getSource() == calculate) {
            System.out.println("Do Calculate");
            new calculator();
        } else if (e.getSource() == notepad) {
            System.out.println("About us");
            new about();

        } 

    }

    @Override
    public void run() {
        try {
            Thread.sleep(10000);
            JOptionPane.showMessageDialog(null, "Ankit Singh Welcomes You....");
            // JOptionPane.showMessageDialog(null,"Ankit Singh Welcomes You 🙏🙏🙏" );
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
