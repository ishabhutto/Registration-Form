package GUIComponnts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisTerForM extends JFrame implements ActionListener {
    ImageIcon background;
    Image img;
    Image temp;
    JLabel back, name;
    JPanel p, p1;
    JButton Register, Reset;
    JTextField txt1, txt2, txt4, txt6;
    JRadioButton male, female;
    ButtonGroup group;
    JComboBox<String> City1;
    JCheckBox b, showpassy;
    JPasswordField pass;
    JLabel Name, Gender, FatherName, Password, City, Email, phoneno;

    public RegisTerForM() {
        //Header
        p = new JPanel();
        p.setBackground(new Color(0, 0, 0, 90));
        p.setBounds(177, 0, 500, 70);
        name = new JLabel("Registration Form");
        name.setForeground(Color.BLACK);
        name.setBounds(200, 25, 400, 50);
        name.setFont(new Font("Serif", Font.BOLD, 30));

        //Background
        background = new ImageIcon("F:\\JAVA TASKS\\src\\59e11e694221ad0001bde6ef_Interactions & Animations.png");
        img = background.getImage();
        temp = img.getScaledInstance(900, 750, Image.SCALE_SMOOTH);
         background = new ImageIcon(temp);
         back = new JLabel("", background, JLabel.CENTER);
         back.setLayout(null);
         back.setBounds(0, 0, 900, 750);

        //Registration Form
        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0, 0, 0, 60));
        p1.setBounds(130, 130, 600, 500);

        Name = new JLabel("Name");
        Name.setBounds(10, 90, 200, 30);
        Name.setFont(new Font("Serif", Font.BOLD, 19));
        Name.setForeground(Color.BLACK);

        txt1 = new JTextField();
        txt1.setBounds(180, 90, 290, 30);
        txt1.setBackground(Color.WHITE);

        Gender = new JLabel("Gender");
        Gender.setBounds(10, 130, 200, 30);
        Gender.setFont(new Font("Serif", Font.BOLD, 19));
        Gender.setForeground(Color.BLACK);

        male = new JRadioButton("Male");
        male.setBounds(180, 130, 60, 30);
        male.setForeground(Color.BLACK);
        male.setBackground(Color.WHITE);
        male.setFocusable(false);

        female = new JRadioButton("Female");
        female.setBounds(310, 130, 90, 30);
        female.setBackground(Color.WHITE);
        female.setForeground(Color.BLACK);
        female.setFocusable(false);

        group = new ButtonGroup();
        group.add(male);
        group.add(female);

        FatherName = new JLabel("Father Name");
        FatherName.setBounds(10, 170, 230, 30);
        FatherName.setFont(new Font("Serif", Font.BOLD, 19));
        FatherName.setForeground(Color.BLACK);

        txt2 = new JTextField();
        txt2.setBounds(180, 170, 290, 30);
        txt2.setBackground(Color.WHITE);

        Password = new JLabel("Password");
        Password.setBounds(10, 210, 230, 30);
        Password.setFont(new Font("Serif", Font.BOLD, 19));
        Password.setForeground(Color.BLACK);


        pass = new JPasswordField();
        pass.setBounds(180, 210, 290, 30);
        pass.setBackground(Color.WHITE);


        showpassy = new JCheckBox("Show Password");
        showpassy.setBounds(180, 249, 230, 30);
        showpassy.setBackground(Color.WHITE);
        showpassy.setForeground(Color.BLACK);
        showpassy.setFocusable(false);

        phoneno = new JLabel("Phone Number");
        phoneno.setBounds(10, 287, 230, 30);
        phoneno.setFont(new Font("Serif", Font.BOLD, 19));
        phoneno.setForeground(Color.BLACK);

        txt4 = new JTextField();
        txt4.setBounds(180, 287, 290, 30);
        txt4.setBackground(Color.WHITE);

        City = new JLabel("City");
        City.setBounds(10, 330, 230, 30);
        City.setFont(new Font("Serif", Font.BOLD, 19));
        City.setForeground(Color.BLACK);

        String[] cities = {"Select", "Hala", "Hyderabad", "Karachi"};
        City1 = new JComboBox<>(cities);
        City1.setBounds(180, 330, 290, 30);
        City1.setBackground(Color.WHITE);


        Email = new JLabel("Email");
        Email.setBounds(10, 370, 230, 30);
        Email.setFont(new Font("Serif", Font.BOLD, 19));
        Email.setForeground(Color.BLACK);

        txt6 = new JTextField();
        txt6.setBounds(180, 370, 290, 30);
        txt6.setBackground(Color.WHITE);

        b = new JCheckBox("Accept the terms and conditions");
        b.setBounds(180, 410, 290, 30);
        b.setBackground(Color.WHITE);
        b.setForeground(Color.BLACK);
        b.setFocusable(false);

        Register = new JButton("Register");
        Register.setBounds(150, 455, 100, 30);
        Register.setBackground(new Color(170, 188, 170));
        Register.setForeground(Color.BLACK);
        Register.setFocusable(false);

        Reset = new JButton("Reset");
        Reset.setBounds(290, 455, 100, 30);
        Reset.setBackground(new Color(170, 183, 170));
        Reset.setForeground(Color.BLACK);
        Reset.setFocusable(false);

        //Frame
        back.add(p);
        back.add(p1);
        p.add(name);
        p1.add(Name);
        p1.add(txt1);
        p1.add(Gender);
        p1.add(male);
        p1.add(female);
        p1.add(FatherName);
        p1.add(txt2);
        p1.add(Password);
        p1.add(pass);
        p1.add(showpassy);
        showpassy.addActionListener(this);
        p1.add(phoneno);
        p1.add(txt4);
        p1.add(City);
        p1.add(City1);
        p1.add(Email);
        p1.add(txt6);
        p1.add(b);
        p1.add(Register);
        p1.add(Reset);
        showpassy.addActionListener(e -> {

            //Show Pass
            if (e.getSource() == showpassy) {
                if (showpassy.isSelected()) {
                    pass.setEchoChar((char) 0);
                } else {
                    pass.setEchoChar('*');
                }
            }
        });

        Register.addActionListener(this);

        Reset.addActionListener(e -> {
            if (e.getSource() == Reset) {
                txt1.setText("");
                txt2.setText("");
                txt4.setText("");
                txt6.setText("");
                pass.setText("");
                City1.setSelectedIndex(0);
                b.setSelected(false);
                group.clearSelection();
            }
        });

        this.add(back);
        this.setTitle("Registration Form");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(900, 750);
        this.setLayout(new BorderLayout());
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        //Set Password
        if (e.getSource() == Register) {
            String x = txt6.getText();
            String t = txt4.getText();
            String z = "@";
            String y = "gmail.com";
            String w = "030";
            String pass2 = String.valueOf(pass.getPassword());
            if (pass2.equalsIgnoreCase("1234")) {
                if (x.contains(z) && x.contains(y) && t.contains(w)) {
                    if (b.isSelected()) {
                        JOptionPane.showMessageDialog(null, "Login Successfully");
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "All Conditions must be selected, Try Again");
                    }
                }else {
                    JOptionPane.showMessageDialog(null, "Invalid Email or Phone Number , Try Again");
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Password, Try Again");
            }
        }


    }
}

class Mainn {
    public static void main(String[] args) {
        new RegisTerForM();
    }
}


