package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniProjectOne extends JFrame implements ActionListener {

    JLabel lblname,lblcourse,lblrollno,lblempty;
    JTextField txtname,txtcourse,txtrollno;
    JButton btnsubmit;

    public MiniProjectOne(){
        setTitle("Student Information Form");
        setSize(450,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lblname = new JLabel("Name");
        lblcourse = new JLabel("Course");
        lblrollno = new JLabel("Roll number");
        lblempty = new JLabel();


        txtname = new JTextField();
        txtcourse = new JTextField();
        txtrollno = new JTextField();

        btnsubmit = new JButton("Submit");

        GridLayout g = new GridLayout(4,2);
        setLayout(g);

        btnsubmit.addActionListener(this);

        add(lblrollno);
        add(txtrollno);
        add(lblname);
        add(txtname);
        add(lblcourse);
        add(txtcourse);
        add(lblempty);
        add(btnsubmit);
        setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String roll_Detail = txtrollno.getText();
        String name_Detail = txtname.getText();
        String course_Detail = txtcourse.getText();

        //Dialog box
        JOptionPane.showMessageDialog(this,"Roll number: "+roll_Detail+"\n"+"Name: "+name_Detail+"\n"+"Course: "+course_Detail+"\n");
    }

    public static void main(String[] args) {
        new MiniProjectOne();
    }
}
