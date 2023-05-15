package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pinnumber;
    String Balance;
    JButton back;
    BalanceEnquiry(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);


        JLabel text = new JLabel("Balance");
        text.setFont(new Font("Raleway", Font.BOLD, 24));
        text.setForeground(Color.WHITE);
        text.setBounds(350,200,400, 28);
        image.add(text);

        Conn conn = new Conn();
        int balance = 0;
        try{

            ResultSet rs = conn.s1.executeQuery("select * from bank where pin = '"+pinnumber+"'");

            while (rs.next()){
                if (rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch (Exception e){
            System.out.print(e);
        }

        JLabel bal = new JLabel("Your Balance is:  "+balance+ " Rs");
        bal.setFont(new Font("Raleway", Font.BOLD, 24));
        bal.setForeground(Color.WHITE);
        bal.setBounds(250,300,500, 28);
        image.add(bal);


        back = new JButton("back");
        back.setBounds(500, 400, 100, 24);
        back.addActionListener(this);
        image.add(back);


        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);


    }

    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Transaction(pinnumber).setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
