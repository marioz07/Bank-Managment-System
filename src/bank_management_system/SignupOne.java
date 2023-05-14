package bank_management_system;

import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class SignupOne extends JFrame implements  ActionListener {
    long random;
    JTextField nametext, fnametext, emailtext, addresstext, citytext, statetext, pincodetext;
    JButton next;
    JRadioButton male, female, married, unmarried, other;
    JDateChooser dateChooser;

    SignupOne() {
        setLayout(null);
        Random ran = new Random();
        random = Math.abs((ran.nextLong() % 900L) + 1000L);

        // Heading
        JLabel formno = new JLabel("APLLICATION FORM NO." + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);

        //Personal Details
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);

        //name
        JLabel name = new JLabel("Name: ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        //naemtext
        nametext = new JTextField();
        nametext.setFont(new Font("Raleway", Font.BOLD, 14));
        nametext.setBounds(300, 140, 400, 30);
        add(nametext);

        //Fathers name
        JLabel fname = new JLabel("Fathers Name: ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);
        //fnametext
        fnametext = new JTextField();
        fnametext.setFont(new Font("Raleway", Font.BOLD, 14));
        fnametext.setBounds(300, 190, 400, 30);
        add(fnametext);


        //Date Of birth
        JLabel DOB = new JLabel("Date Of Birth: ");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 240, 200, 30);
        add(DOB);
        //datechooser
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 240, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        //Gender
        JLabel Gender = new JLabel("Gender: ");
        Gender.setFont(new Font("Raleway", Font.BOLD, 20));
        Gender.setBounds(100, 290, 200, 30);
        add(Gender);
        //male radio button
        male = new JRadioButton("Male");
        male.setBounds(300, 290, 100, 30);
        male.setBackground(Color.WHITE);
        add(male);
        //female radio button
        female = new JRadioButton("Female");
        female.setBounds(450, 290, 100, 30);
        female.setBackground(Color.WHITE);
        add(female);
        //Grouping gender buttons
        ButtonGroup genderbutton = new ButtonGroup();
        genderbutton.add(male);
        genderbutton.add(female);


        //email
        JLabel email = new JLabel("Email: ");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);
        //emailtext
        emailtext = new JTextField();
        emailtext.setFont(new Font("Raleway", Font.BOLD, 14));
        emailtext.setBounds(300, 340, 400, 30);
        add(emailtext);


        //Marital
        JLabel marital = new JLabel("Marital Status: ");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 30);
        add(marital);
        //marital radiobuttons
        //married
        married = new JRadioButton("Married");
        married.setBounds(300, 390, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);
        //unmarried
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(450, 390, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        //other
        other = new JRadioButton("Other");
        other.setBounds(630, 390, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);
        // Grouping marital button
        ButtonGroup maritalbutton = new ButtonGroup();
        maritalbutton.add(married);
        maritalbutton.add(unmarried);
        maritalbutton.add(other);


        //address
        JLabel address = new JLabel("Address: ");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);
        //addresstext
        addresstext = new JTextField();
        addresstext.setFont(new Font("Raleway", Font.BOLD, 14));
        addresstext.setBounds(300, 440, 400, 30);
        add(addresstext);


        //City
        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);
        //citytext
        citytext = new JTextField();
        citytext.setFont(new Font("Raleway", Font.BOLD, 14));
        citytext.setBounds(300, 490, 400, 30);
        add(citytext);


        //State
        JLabel state = new JLabel("State: ");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);
        //statetext
        statetext = new JTextField();
        statetext.setFont(new Font("Raleway", Font.BOLD, 14));
        statetext.setBounds(300, 540, 400, 30);
        add(statetext);


        // pincode
        JLabel pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 30);
        add(pincode);
        //pincodetext
        pincodetext = new JTextField();
        pincodetext.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodetext.setBounds(300, 590, 400, 30);
        add(pincodetext);

        //next button
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(385, 660, 80, 30);
        next.addActionListener(this);
        add(next);


        // Frame
        setSize(850, 800);
        setLocation(350, 200);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {
        String formno = "" + random;
        String name = nametext.getText();
        String fname = fnametext.getText();
        String DOB = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";
        }
        String email = emailtext.getText();
        String marital = null;
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = addresstext.getText();
        String city = citytext.getText();
        String state = statetext.getText();
        String pincode = pincodetext.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signup values('"+formno+"','" + name + "','" + fname + "','" + DOB + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pincode + "')";
                System.out.print(query);
                c.s1.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    public static void main(String[] args) {
        new SignupOne();

    }
}

