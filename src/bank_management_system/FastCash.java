package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.sql.ResultSet;

public class FastCash extends JFrame implements ActionListener {
    JButton c1,c2,c3,c4,c5,c6, back;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Select Your Withdrawal Amount");
        text.setFont(new Font("Raleway", Font.BOLD, 24));
        text.setForeground(Color.WHITE);
        text.setBounds(250,200,400, 28);
        image.add(text);

        c1 = new JButton("Rs 100");
        c1.setFont(new Font("Raleway", Font.BOLD, 18));
        c1.setForeground(Color.BLACK);
        c1.setBounds(250,300,150, 24);
        c1.addActionListener(this);
        image.add(c1);

        c2 = new JButton("Rs 500");
        c2.setFont(new Font("Raleway", Font.BOLD, 18));
        c2.setForeground(Color.BLACK);
        c2.setBounds(250,350,150, 24);
        c2.addActionListener(this);
        image.add(c2);

        c3 = new JButton("Rs 1000");
        c3.setFont(new Font("Raleway", Font.BOLD, 18));
        c3.setForeground(Color.BLACK);
        c3.setBounds(250,400,150, 24);
        c3.addActionListener(this);
        image.add(c3);

        c4 = new JButton("RS 2000");
        c4.setFont(new Font("Raleway", Font.BOLD, 18));
        c4.setForeground(Color.BLACK);
        c4.setBounds(450,300,150, 24);
        c4.addActionListener(this);
        image.add(c4);

        c5 = new JButton("Rs 5000");
        c5.setFont(new Font("Raleway", Font.BOLD, 18));
        c5.setForeground(Color.BLACK);
        c5.setBounds(450,350,150, 24);
        c5.addActionListener(this);
        image.add(c5);


        c6 = new JButton("Rs 10000");
        c6.setFont(new Font("Raleway", Font.BOLD, 18));
        c6.setForeground(Color.BLACK);
        c6.setBounds(450,400,150, 24);
        c6.addActionListener(this);
        image.add(c6);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.setForeground(Color.BLACK);
        back.setBounds(450,450,150, 24);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back){
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        } else {
            String amount = ((JButton)ae.getSource()).getText().substring(3);
            Conn conn = new Conn();

            try{
                ResultSet rs = conn.s1.executeQuery("select * from bank where pin = '"+pinnumber+"'");
                int balance = 0;
                while (rs.next()){
                    if (rs.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(rs.getString("amount"));
                    } else {
                        balance -= Integer.parseInt(rs.getString("amount"));
                    }
                }

                if (ae.getSource() != back && balance <Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficient balance");
                }

                Date date = new Date();
                String query = "Insert into bank values('"+pinnumber+"','"+date+"','Withdrawl', '"+amount+"')";
                conn.s1.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs " +amount+" withdraw");
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }catch (Exception e){
                System.out.print(e);
            }

        }

        /*else if (ae.getSource() == deposit) {
            new deposit(pinnumber).setVisible(true);
        } else if (ae.getSource() == withdraw) {
            new withdrawl(pinnumber).setVisible(true);
        }*/

    }


    public static void main(String[] args) {
        new FastCash("");
    }



}
