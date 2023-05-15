package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    String pinnumber;
    JButton change, back;
    JPasswordField pintext, retext;
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        setLayout(null);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Change your Pin");
        text.setFont(new Font("Raleway", Font.BOLD, 24));
        text.setForeground(Color.WHITE);
        text.setBounds(320,200,400, 28);
        image.add(text);


        JLabel pin = new JLabel("New Pin: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 20));
        pin.setForeground(Color.WHITE);
        pin.setBounds(250,300,100, 24);
        image.add(pin);

        pintext = new JPasswordField();
        pintext.setBounds(400,300,200, 24);
        image.add(pintext);

        JLabel re = new JLabel("Re-enter Pin:");
        re.setFont(new Font("Raleway", Font.BOLD, 20));
        re.setForeground(Color.WHITE);
        re.setBounds(250,350,150, 24);
        image.add(re);

        retext = new JPasswordField();
        retext.setBounds(400,350,200, 24);
        image.add(retext);


        change = new JButton("Change");
        change.setBounds(300, 400, 100, 24);
        change.addActionListener(this);
        image.add(change);

        back = new JButton("back");
        back.setBounds(500, 400, 100, 24);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);


    }



    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == change) {
            try{

                String npin = pintext.getText();


                String rpin = retext.getText();

                if (!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null,"Entered pin Does not match");
                    return;
                }
                if (!npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "please Enter a pin ");
                    return;
                }
                if (!rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "please re-Enter a pin ");
                    return;
                }


                Conn conn = new Conn();
                String query = "update bank set pin = '"+rpin+"' where pin='"+pinnumber+"'";
                String query2 = "update login set pin = '"+rpin+"' where pin = '"+pinnumber+"'";
                String query3 = "update signupthree set pinnumber = '"+rpin+"' where pinnumber = '"+pinnumber+"'";

                conn.s1.executeUpdate(query);
                conn.s1.executeUpdate(query2);
                conn.s1.executeUpdate(query3);

                JOptionPane.showMessageDialog(null, "Pin Changed successfully");

                setVisible(false);
                new Transaction(rpin).setVisible(true);


            } catch (Exception e){
                System.out.print(e);
            }
        } else {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new PinChange("");
    }


}
