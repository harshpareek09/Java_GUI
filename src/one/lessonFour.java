package one;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class lessonFour extends JFrame implements ActionListener {

    JLabel lblname, lblempty;
    JTextField txtname;
    JButton btnsubmit;

    public lessonFour(){
        setTitle("Action Listener");
        setSize(300,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CLOSE WHEN FORM CLICK CLOSED

        lblname = new JLabel("Full name");
        lblempty = new JLabel();
        txtname = new JTextField();
        btnsubmit = new JButton("Submit");

        GridLayout g = new GridLayout(2,2);
        setLayout(g);

        btnsubmit.addActionListener(this);

        add(lblname);
        add(txtname);
        add(lblempty);
        add(btnsubmit);
        setVisible(true);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String str = txtname.getText();
        JOptionPane.showMessageDialog(this,"Hello "+str);

    }

    public static void main(String[] args) {
        lessonFour obj = new lessonFour();
    }
}
