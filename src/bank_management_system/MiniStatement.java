package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String pinnumber;
    JButton b1;
    MiniStatement(String pinnumber){
        this.pinnumber = pinnumber;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150,20,100,20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20,80,300,20);
        add(card);

        JLabel bal = new JLabel();
        bal.setBounds(20, 400, 300, 20);
        add(bal);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s1.executeQuery("select * from login where pin = '"+pinnumber+"'");

            while(rs.next()){
                card.setText("Card Number:    " + rs.getString("cardnumber").substring(0, 4) + " XXXX XXXX " + rs.getString("cardnumber").substring(12));
            }
        }catch(Exception e){
            System.out.print(e);}

        try {
            int balance = 0;
            Conn c1 = new Conn();
            ResultSet rs = c1.s1.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {

                mini.setText(mini.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br><html>");
                if(rs.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(rs.getString("amount"));
                }else{
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            bal.setText("Your total Balance is Rs "+balance);
        }catch (Exception e){System.out.print(e);}

        b1 = new JButton("Exit");
        b1.setBounds(20, 500, 100, 25);
        b1.addActionListener(this);
        add(b1);





        setSize(400,600);
        setLocation(100,100);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public  void actionPerformed(ActionEvent ae){
        setVisible(false);
    }
    public static void main(String[] args) {
        new MiniStatement("");
    }
}
