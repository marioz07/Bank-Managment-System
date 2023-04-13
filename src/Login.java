import javax.swing.*;
import java.awt.*;


public class Login extends JFrame{

    Login(){
        setTitle("ATM");
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        //Heading
        JLabel text =new JLabel("Welcome To Bank");
        text.setFont(new Font("Osward",Font.BOLD, 32));
        text.setBounds(200,40,300,40);
        add(text);

        //card no
        JLabel cardno =new JLabel("Card no.");
        cardno.setFont(new Font("Osward",Font.BOLD, 32));
        cardno.setBounds(120,170,150,30);
        add(cardno);
        //card no text field
        JTextField cardtext = new JTextField();
        cardtext.setBounds(280, 170, 250, 30);
        add(cardtext);

        //Pin
        JLabel pin =new JLabel("PIN");
        pin.setFont(new Font("Osward",Font.BOLD, 32));
        pin.setBounds(120,250,120,30);
        add(pin);
        //pin text
        JTextField pintext = new JTextField();
        pintext.setBounds(280, 250, 250, 30);
        add(pintext);

        //SIGN IN button
        JButton login = new JButton("SIGN IN");
        login.setBounds(280, 350, 100,30 );
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        add(login);

        // SIGN UPbutton
        JButton signup = new JButton("SIGN UP");
        signup.setBounds(400, 350, 100,30 );
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        add(signup);

        getContentPane().setBackground(Color.WHITE);
        setSize(800, 500);
        setVisible(true);
        setLocation(350,200);

    }

    public static void main(String[] args) {
        new Login();
    }
}
