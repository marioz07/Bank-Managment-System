package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignupTwo extends JFrame implements ActionListener {

        String formno;
        JLabel additionalDetails, religion, caste,education,occuptaion,citizen,income,existingAccount, pan, adhar;
        JTextField pantext, adhartext;
        JComboBox religionbox, castebox, incomebox, educationbox, occupationbox;
        JButton next;
        JRadioButton syes, sno, eyes, eno;

        SignupTwo(String formno) {
            this.formno =formno;
            setLayout(null);


            setTitle("New Account Application Form - Page 2");


            //Personal Details
            additionalDetails = new JLabel("Page 1: Additional Details");
            additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
            additionalDetails.setBounds(290, 80, 400, 30);
            add(additionalDetails);

            //religion
            religion= new JLabel("Religion : ");
            religion.setFont(new Font("Raleway", Font.BOLD, 20));
            religion.setBounds(100, 140, 100, 30);
            add(religion);
            //Religion combobox
            String valrelgion[] = {"Hindu", "Muslim", "Christian", "Sikh", "Other"};
            religionbox = new JComboBox(valrelgion);
            religionbox.setBackground(Color.WHITE);
            religionbox.setBounds(300, 140, 400, 30);
            add(religionbox);



            //Fathers name
            caste = new JLabel("Caste : ");
            caste.setFont(new Font("Raleway", Font.BOLD, 20));
            caste.setBounds(100, 190, 200, 30);
            add(caste);
            //Caste Combobox
            String valcaste[]={"Open", "OBC", "SC", "ST", "NT", "Other"};
            castebox = new JComboBox(valcaste);
            castebox.setBounds(300, 190, 400, 30);
            add(castebox);



            //Date Of birth
            income = new JLabel("Income : ");
            income.setFont(new Font("Raleway", Font.BOLD, 20));
            income.setBounds(100, 240, 200, 30);
            add(income);
            //datechooser
            String valsalary[]={"NULL", "<1,50,000", "<2,50,000", "<5,00,000", "<10,00,00", "upto 20,00,00"};
            incomebox = new JComboBox(valsalary);
            incomebox.setBounds(300, 240, 400, 30);
            add(incomebox);

            //Gender
            education = new JLabel("Education : ");
            education.setFont(new Font("Raleway", Font.BOLD, 20));
            education.setBounds(100, 290, 200, 30);
            add(education);
            //male radio button
            String edu[]={"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Other"};
            educationbox = new JComboBox(edu);
            educationbox.setBounds(300, 290, 400, 30);
            add(educationbox);


            //Marital
            occuptaion = new JLabel("Occupation : ");
            occuptaion.setFont(new Font("Raleway", Font.BOLD, 20));
            occuptaion.setBounds(100, 390, 200, 30);
            add(occuptaion);
            String valoccupation[]={"Salaried", "Self-Employed", "Bussinessman", "Studen", "Retired", "Other"};
            occupationbox = new JComboBox(valoccupation);
            occupationbox.setBounds(300, 390, 400, 30);
            add(occupationbox);


            //address
            pan = new JLabel("PAN No.: ");
            pan.setFont(new Font("Raleway", Font.BOLD, 20));
            pan.setBounds(100, 440, 200, 30);
            add(pan);
            //addresstext
            pantext = new JTextField();
            pantext.setFont(new Font("Raleway", Font.BOLD, 14));
            pantext.setBounds(300, 440, 400, 30);
            add(pantext);


            //City
            adhar = new JLabel("Aadhar card no.: ");
            adhar.setFont(new Font("Raleway", Font.BOLD, 20));
            adhar.setBounds(100, 490, 200, 30);
            add(adhar);
            //citytext
            adhartext = new JTextField();
            adhartext.setFont(new Font("Raleway", Font.BOLD, 14));
            adhartext.setBounds(300, 490, 400, 30);
            add(adhartext);


            //State
            citizen = new JLabel("Senior Citizen: ");
            citizen.setFont(new Font("Raleway", Font.BOLD, 20));
            citizen.setBounds(100, 540, 200, 30);
            add(citizen);
            //statetext
            syes = new JRadioButton("yes");
            syes.setBounds(300, 540, 100, 30);
            syes.setBackground(Color.WHITE);
            add(syes);
            //female radio button
            sno = new JRadioButton("no");
            sno.setBounds(450, 540, 100, 30);
            sno.setBackground(Color.WHITE);
            add(sno);
            //Grouping gender buttons
            ButtonGroup seniorbutton = new ButtonGroup();
            seniorbutton.add(syes);
            seniorbutton.add(sno);


            // existingAccount
            existingAccount = new JLabel("Existing Account : ");
            existingAccount.setFont(new Font("Raleway", Font.BOLD, 20));
            existingAccount.setBounds(100, 590, 200, 30);
            add(existingAccount);
            //existingAccounttext
            eyes = new JRadioButton("yes");
            eyes.setBounds(300, 590, 100, 30);
            eyes.setBackground(Color.WHITE);
            add(eyes);
            //female radio button
            eno = new JRadioButton("no");
            eno.setBounds(450, 590, 100, 30);
            eno.setBackground(Color.WHITE);
            add(eno);
            //Grouping gender buttons
            ButtonGroup accountbutton = new ButtonGroup();
            accountbutton.add(eyes);
            accountbutton.add(eno);

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

            String sreligion = (String) religionbox.getSelectedItem();
            String scaste = (String) castebox.getSelectedItem();
            String sincome = (String) incomebox.getSelectedItem();
            String seducation = (String) educationbox.getSelectedItem();
            String soccupation = (String) occupationbox.getSelectedItem();
            String seniorcitizen = null;
            if (syes.isSelected()){
                seniorcitizen = "yes";
            } else if (sno.isSelected()){
                seniorcitizen = "no";
            }
            String existingAccount = null;
            if(eyes.isSelected()){
                existingAccount = "yes";
            } else if (eno.isSelected()) {
                existingAccount = "no";
            }

            String span = pantext.getText();
            String sadhar = adhartext.getText();

            try {

                Conn c = new Conn();
                String query;
                query = "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scaste+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+sadhar+"','"+span+"','"+seniorcitizen+"','"+existingAccount+"')";
                System.out.print(query);
                c.s1.executeUpdate(query);
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            } catch (Exception e) {
                System.out.println(e);
            }
        }



        public static void main(String[] args) {
            new bank_management_system.SignupTwo("");

        }
    }


