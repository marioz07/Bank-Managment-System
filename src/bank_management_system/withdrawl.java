package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class withdrawl extends JFrame implements ActionListener {

    JButton withdrawl,back;
    JTextField amount;
    String pinnumber;

    withdrawl(String pinnumber){
        this.pinnumber =pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Enter the Amount you want to withdraw");
        text.setFont(new Font("Raleway", Font.BOLD, 20));
        text.setForeground(Color.WHITE);
        text.setBounds(250,200,400, 28);
        image.add(text);

        amount = new JTextField();
        amount.setBounds(280, 300, 300, 28);
        image.add(amount);

        withdrawl = new JButton("withdraw");
        withdrawl.setFont(new Font("Raleway", Font.BOLD, 18));
        withdrawl.setForeground(Color.BLACK);
        withdrawl.setBounds(350,370,150, 24);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        back = new JButton("Back");
        back.setFont(new Font("Raleway", Font.BOLD, 18));
        back.setForeground(Color.BLACK);
        back.setBounds(350,410,150, 24);
        back.addActionListener(this);
        image.add(back);




        setSize(900,900);
        setLocation(300, 0);
        //setUndecorated(true);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == withdrawl){
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"Please Enter An Amount");
            } else {
                try {
                    Conn conn = new Conn();
                    String query = "Insert into bank values('"+pinnumber+"','"+date+"', 'Withdrawl','"+number+"')";
                    conn.s1.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs "+number+" withdraw Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);

                } catch (Exception e){
                    System.out.println(e);
                }
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);;
        }
    }

    public static void main(String[] args) {
        new withdrawl("");

    }
}
