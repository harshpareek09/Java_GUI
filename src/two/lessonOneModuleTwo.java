package two;

import javax.swing.*;
import java.awt.*;

public class lessonOneModuleTwo extends JFrame {
    JButton btnadd,btnedit,btndelete,btnsearch,btnexit;


    public lessonOneModuleTwo(){
        setTitle("FlowLayout Form");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnadd = new JButton("Add");
        btnedit = new JButton("Edit");
        btndelete = new JButton("Delete");
        btnsearch = new JButton("Search");
        btnexit = new JButton("Exit");

        //FlowLayout
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,5));

        add(btnadd);
        add(btnedit);
        add(btndelete);
        add(btnsearch);
        add(btnexit);
        setVisible(true);

    }

    public static void main(String[] args) {
        new lessonOneModuleTwo();
    }
}
