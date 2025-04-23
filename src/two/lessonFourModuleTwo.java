package two;

import javax.swing.*;
import java.awt.*;

public class lessonFourModuleTwo extends JFrame {

    JLabel lblheading, lblfullname, lblemail, lblphone;
    JTextField txtfullname, txtemail, txtphone;
    JButton btnregister;

    public lessonFourModuleTwo() {
        setTitle("Registration Form - BoxLayout");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set BoxLayout in vertical direction
        BoxLayout box = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
        setLayout(box);

        // Heading
        lblheading = new JLabel("Registration Form");
        lblheading.setFont(new Font("Arial", Font.BOLD, 20));
        lblheading.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Full Name
        lblfullname = new JLabel("Full Name");
        lblfullname.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtfullname = new JTextField();
        txtfullname.setMaximumSize(new Dimension(250, 20));
        txtfullname.setAlignmentX(Component.CENTER_ALIGNMENT); // 💡 Important!

        // E-mail
        lblemail = new JLabel("E-mail");
        lblemail.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtemail = new JTextField();
        txtemail.setMaximumSize(new Dimension(250, 20));
        txtemail.setAlignmentX(Component.CENTER_ALIGNMENT); // 💡 Important!

        // Phone
        lblphone = new JLabel("Phone number");
        lblphone.setAlignmentX(Component.LEFT_ALIGNMENT);
        txtphone = new JTextField();
        txtphone.setMaximumSize(new Dimension(250, 20));
        txtphone.setAlignmentX(Component.CENTER_ALIGNMENT); // 💡 Important!

        // Register Button
        btnregister = new JButton("Register");
        btnregister.setAlignmentX(Component.CENTER_ALIGNMENT); // center the button
        btnregister.setBorder(BorderFactory.createLineBorder(Color.red));

        // Add Components with Spacing
        add(Box.createRigidArea(new Dimension(0, 12)));
        add(lblheading);

        add(Box.createRigidArea(new Dimension(0, 12)));
        add(lblfullname);
        add(txtfullname);

        add(Box.createRigidArea(new Dimension(0, 12)));
        add(lblemail);
        add(txtemail);

        add(Box.createRigidArea(new Dimension(0, 12)));
        add(lblphone);
        add(txtphone);

        add(Box.createRigidArea(new Dimension(0, 15)));
        add(btnregister);

        setVisible(true);
    }

    public static void main(String[] args) {
        new lessonFourModuleTwo();
    }
}
