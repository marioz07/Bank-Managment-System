package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transaction extends JFrame implements ActionListener {
    JButton deposit, fast, pin, withdraw, balance, statement, exit;
    String pinnumber;
    Transaction(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Please select your Transaction");
        text.setFont(new Font("Raleway", Font.BOLD, 24));
        text.setForeground(Color.BLACK);
        text.setBounds(300,200,400, 28);
        image.add(text);

        deposit = new JButton("Deposit");
        deposit.setFont(new Font("Raleway", Font.BOLD, 18));
        deposit.setForeground(Color.BLACK);
        deposit.setBounds(200,300,150, 24);
        deposit.addActionListener(this);
        image.add(deposit);

        fast = new JButton("Fast Cash");
        fast.setFont(new Font("Raleway", Font.BOLD, 18));
        fast.setForeground(Color.BLACK);
        fast.setBounds(200,350,150, 24);
        fast.addActionListener(this);
        image.add(fast);

        pin = new JButton("Pin Change");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setForeground(Color.BLACK);
        pin.setBounds(200,400,150, 24);
        pin.addActionListener(this);
        image.add(pin);

        withdraw = new JButton("Cash Withdrawal");
        withdraw.setFont(new Font("Raleway", Font.BOLD, 18));
        withdraw.setForeground(Color.BLACK);
        withdraw.setBounds(450,300,200, 24);
        withdraw.addActionListener(this);
        image.add(withdraw);

        statement = new JButton("Mini Statement");
        statement.setFont(new Font("Raleway", Font.BOLD, 18));
        statement.setForeground(Color.BLACK);
        statement.setBounds(450,350,200, 24);
        statement.addActionListener(this);
        image.add(statement);


        balance = new JButton("Balance Enquiry");
        balance.setFont(new Font("Raleway", Font.BOLD, 18));
        balance.setForeground(Color.BLACK);
        balance.setBounds(450,400,200, 24);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("Exit");
        exit.setFont(new Font("Raleway", Font.BOLD, 18));
        exit.setForeground(Color.BLACK);
        exit.setBounds(450,450,200, 24);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == exit){
            System.exit(0);
        }

    }


    public static void main(String[] args) {
        new Transaction("");
    }



}
