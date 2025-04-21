package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lessonFive extends JFrame implements ActionListener {

    JLabel lblemail,lblphone,lblempty;
    JTextField txtemail,txtphone;
    JButton btnSubmit;

    public lessonFive(){
        setTitle("Personal Detail - Email and Phone No.");
        setSize(400,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblemail = new JLabel("Email");
        lblphone = new JLabel("Contact number");
        lblempty = new JLabel();

        txtemail = new JTextField();
        txtphone = new JTextField();

        btnSubmit = new JButton("Submit");

        GridLayout g = new GridLayout(3,2);
        setLayout(g);

        btnSubmit.addActionListener(this);

        add(lblemail);
        add(txtemail);
        add(lblphone);
        add(txtphone);
        add(lblempty);
        add(btnSubmit);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String Email_Detail = txtemail.getText();
        String Phone_Detail = txtphone.getText();
        JOptionPane.showMessageDialog(this,"Your Email "+Email_Detail+"\n"+"Your Phone number "+Phone_Detail+"\n");
    }

    public static void main(String[] args) {
        new lessonFive();
    }
}
