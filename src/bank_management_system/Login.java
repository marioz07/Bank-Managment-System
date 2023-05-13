package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Login extends JFrame implements ActionListener {

    JButton login, signup;
    JTextField cardtext;
    JPasswordField pintext;

    Login() {
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
        //Heading
        JLabel text = new JLabel("Welcome To Bank");
        text.setFont(new Font("Osward", Font.BOLD, 32));
        text.setBounds(200, 40, 300, 40);
        add(text);

        //card no
        JLabel cardno = new JLabel("Card no.");
        cardno.setFont(new Font("Osward", Font.BOLD, 32));
        cardno.setBounds(120, 170, 150, 30);
        add(cardno);
        //card no text field
        cardtext = new JTextField();
        cardtext.setBounds(280, 170, 250, 30);
        add(cardtext);

        //Pin
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Osward", Font.BOLD, 32));
        pin.setBounds(120, 250, 120, 30);
        add(pin);
        //pin text
        pintext = new JPasswordField();
        pintext.setBounds(280, 250, 250, 30);
        add(pintext);

        //SIGN IN button
        login = new JButton("SIGN IN");
        login.setBounds(280, 350, 100, 30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        // SIGN UPbutton
        signup = new JButton("SIGN UP");
        signup.setBounds(400, 350, 100, 30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);


        //Content
        getContentPane().setBackground(Color.WHITE);
        setSize(800, 500);
        setVisible(true);
        setLocation(350, 200);

    }
        public void actionPerformed(ActionEvent ae){
            if (ae.getSource() == login){

            }
            else if(ae.getSource() == signup){
                setVisible(false);
                new SignupOne().setVisible(true);
            }
        }



    public static void main(String[] args) {
        new Login();
    }
}
