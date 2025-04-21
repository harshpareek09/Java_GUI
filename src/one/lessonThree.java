package one;
import javax.swing.*;
import java.awt.GridLayout;

public class lessonThree  extends JFrame{

    public lessonThree(){
        setTitle("User Contact Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set 4 rows and 2 columns
        setLayout(new GridLayout(4, 2));

        // Components
        JLabel lblName = new JLabel("Name:");
        JTextField txtName = new JTextField();

        JLabel lblEmail = new JLabel("Email:");
        JTextField txtEmail = new JTextField();

        JLabel lblPhone = new JLabel("Phone:");
        JTextField txtPhone = new JTextField();

        JLabel emptyLabel = new JLabel(); // just to fill 4th row, 1st column
        JButton btnSubmit = new JButton("Submit");

        // Add all to the frame
        add(lblName);
        add(txtName);

        add(lblEmail);
        add(txtEmail);

        add(lblPhone);
        add(txtPhone);

        add(emptyLabel);   // leave first column blank in last row
        add(btnSubmit);    // button in last row, 2nd column

        setVisible(true);
    }

    public static void main(String[] args) {
        new lessonThree();
    }
}
