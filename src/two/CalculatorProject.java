package two;

import javax.swing.*;
import java.awt.*;

public class CalculatorProject extends JFrame {

    public CalculatorProject(){
        setTitle("Calculator");
        setSize(300,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout g  = new GridLayout(2,1,5,5);
        setLayout(g);

        //Row 1 where the calculation occurs
        GridLayout displayGrid = new GridLayout(1,1);
        JPanel displayPanel = new JPanel(displayGrid);
        JTextField txtdisplay = new JTextField("0");
        //Makes text edit off
        txtdisplay.setEditable(false);
        txtdisplay.setFont(new Font("Arial",Font.BOLD,38));
        txtdisplay.setHorizontalAlignment(JTextField.RIGHT);

        //Add into JPanel - displayPanel
        displayPanel.add(txtdisplay);


        //Creation of JPanel For buttons
        GridLayout btnGrid = new GridLayout(7,4,5,5);
        JPanel buttonPanel = new JPanel(btnGrid);

        //Array creation for adding button
        String str[] = {"MC","MR","M+","M-",    //line 1
                        "%","CE","C","←",       //line 2
                        "1/x","x²","√x","÷",    //line 3
                        "7","8","9","×",        //line4
                        "4","5","6","−",        //line 5
                        "1","2","3","+",        //line 6
                        "±","0",".","="         //line 7
        };

        for(String var:str){
            //Crete new object every time of JButton class, btn is just a reference
            JButton btn = new JButton(var);
            //Font set to plain
            btn.setFont(new Font("Arial",Font.PLAIN,18));
            //btn is added in panel just like that all button added in panel one by one
            buttonPanel.add(btn);
        }


        //Add into Frame
        add(displayPanel);
        add(buttonPanel);
        setVisible(true);



    }


    public static void main(String[] args){
        new CalculatorProject();
    }
}
