package two;

import javax.swing.*;
import java.awt.*;

public class lessonTwoModuleTwo extends JFrame {
    JLabel lbldashboard;
    JButton btnlogout,btnmenu,btnsettings;
    JTextArea txtmain;

    public lessonTwoModuleTwo(){
        setTitle("Dashboard using BorderLayout");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lbldashboard = new JLabel("Dash Board");
        btnlogout = new JButton("Log Out");
        btnmenu = new JButton("Menu");
        btnsettings = new JButton("Settings");
        txtmain = new JTextArea("Welcome to Your Dash Board");

        setLayout(new BorderLayout(10,10));

        add(lbldashboard,BorderLayout.NORTH);
        add(btnlogout,BorderLayout.SOUTH);
        add(btnmenu,BorderLayout.WEST);
        add(btnsettings,BorderLayout.EAST);
        add(txtmain,BorderLayout.CENTER);

        setVisible(true);

    }

    public static void main(String[] args) {
        new lessonTwoModuleTwo();
    }
}
