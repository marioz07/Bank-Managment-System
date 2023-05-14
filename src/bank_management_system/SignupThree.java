package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class SignupThree extends JFrame implements ActionListener {

    JButton submit, cancle;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JRadioButton saving,fixed,current,recurring;
    ButtonGroup accgroup;
    String formno;
    SignupThree(String formno){
        this.formno = formno;
        setLayout(null);

        JLabel title = new JLabel("Page 3: Account Details" );
        title.setFont(new Font("Raleway", Font.BOLD, 38));
        title.setBounds(140, 20, 600, 40);
        add(title);

        JLabel Account = new JLabel("Account type");
        Account.setFont(new Font("Raleway", Font.BOLD, 20));
        Account.setBounds(100,140,400,30);
        add(Account);

        saving = new JRadioButton("Saving account");
        saving.setBounds(100, 190, 150, 15);
        saving.setBackground(Color.WHITE);
        add(saving);


        current = new JRadioButton("current account");
        current.setBounds(100, 230, 150, 15);
        current.setBackground(Color.WHITE);
        add(current);

        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setBounds(300, 190, 200, 15);
        fixed.setBackground(Color.WHITE);
        add(fixed);

        recurring = new JRadioButton("reccuring deposit account");
        recurring.setBounds(300, 230, 200, 15);
        recurring.setBackground(Color.WHITE);
        add(recurring);

        accgroup = new ButtonGroup();
        accgroup.add(saving);
        accgroup.add(fixed);
        accgroup.add(current);
        accgroup.add(recurring);

        JLabel card = new JLabel("Card Number: ");
        card.setFont(new Font("Raleway", Font.BOLD, 20));
        card.setBounds(100, 270, 150, 20);
        add(card);

        JLabel cardno = new JLabel("XXXX-XXXX-XXXX-4956");
        cardno.setFont(new Font("Raleway", Font.BOLD, 20));
        cardno.setBounds(300,270,2500,20);
        add(cardno);

        JLabel carddesc = new JLabel("Your 16-Digit card number");
        carddesc.setFont(new Font("Raleway", Font.BOLD, 10));
        carddesc.setBounds(100, 290, 150, 12);
        add(carddesc);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setBounds(100, 340, 150, 20);
        add(pin);

        JLabel pinno = new JLabel("XXXX");
        pinno.setFont(new Font("Raleway", Font.BOLD, 20));
        pinno.setBounds(300, 340, 150, 20);
        add(pinno);

        JLabel pindesc = new JLabel("Your 4-Digit pin");
        pindesc.setFont(new Font("Raleway", Font.BOLD, 10));
        pindesc.setBounds(100, 360, 150, 12);
        add(pindesc);

        JLabel service = new JLabel("Services Required: ");
        service.setFont(new Font("Raleway", Font.BOLD, 20));
        service.setBounds(100, 410, 250, 20);
        add(service);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 450, 150, 20);
        add(c1);

        c2 = new JCheckBox("Mobile Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(100, 480, 150, 20);
        add(c2);

        c3 = new JCheckBox("Cheque Book");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 510, 150, 20);
        add(c3);

        c4 = new JCheckBox("Internet Banking");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(300, 450, 200, 20);
        add(c4);

        c5 = new JCheckBox("E-mail and SMS Service");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(300, 480, 250, 20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(300, 510, 200, 20);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above details are correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        c7.setBounds(100, 600, 600, 18);
        add(c7);

        cancle = new JButton("Cancle");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.white);
        cancle.setFont(new Font("Raleway", Font.BOLD, 16));
        cancle.setBounds(200, 680, 100, 25);
        cancle.addActionListener(this);
        add(cancle);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 16));
        submit.setBounds(400, 680, 100, 25);
        submit.addActionListener(this);
        add(submit);


        // Frame
        setSize(850, 800);
        setLocation(350, 200);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == submit){
            String accounttype = null;
            if (current.isSelected()){
                accounttype = "current Account";
            } else if (saving.isSelected()) {
                accounttype = "saving Account";
            } else if (fixed.isSelected()) {
                accounttype = "Fixed Deposit Account";
            } else if (recurring.isSelected()){
                accounttype = "Recrring Deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 4024946000000000L);

            String pinnumber = "" + Math.abs((random.nextLong()) % 9000L + 1000L);
            
            String services = "";
            if (c1.isSelected()){
                services = services + "ATM CARD";
            } else if (c2.isSelected()) {
                services = services + "Mobile Banking";
            } else if (c3.isSelected()) {
                services = services + "Cheque Book";
            } else if (c4.isSelected()) {
                services = services + "Internet Banking";
            } else if (c5.isSelected()) {
                services = services + "E-mail and SMS service";
            } else if (c6.isSelected()) {
                services = services + "E-Statement";
            }

            try {
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Account type is required");
                } else if (services.equals("")) {
                    JOptionPane.showMessageDialog(null,"Select a at least one Service");
                } else {
                    Conn conn = new Conn();
                    String query1 = "insert into signupthree values('"+formno+"', '"+accounttype+"', '"+cardnumber+"', '"+pinnumber+"', '"+services+"')";
                    String query2 = "insert into login values('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";

                    conn.s1.executeUpdate(query1);
                    conn.s1.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null,"Card no:  " + cardnumber + "\n Pin: " + pinnumber);
                }
            } catch (Exception e){
                System.out.println(e);
            }

        } else if (ae.getSource() == cancle) {
            
        }
    }


    public static void main(String[] args) {
        new  bank_management_system.SignupThree("");
    }
}
