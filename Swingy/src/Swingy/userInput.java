package Swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class userInput {
    public static void main(String[] args){
        Input obj = new Input();
    }
}

class Input extends  JFrame implements ActionListener {

     JTextField x1;
     JButton p;
     JRadioButton m1, f1;
     JLabel x2;
     JCheckBox c1, c2;

    public Input(){
        x1 = new JTextField(10);
        p = new JButton("Ok");
        m1 = new JRadioButton("Male");
        f1 = new JRadioButton("Female");
        x2 = new JLabel("Greetings");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");

        c1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Dancer");
            }
        });

        ButtonGroup sw = new ButtonGroup();

        sw.add(m1);
        sw.add(f1);
        add(x1);
        add(m1);
        add(f1);
        add(c1);
        add(c2);
        add(p);
        add(x2);

        p.addActionListener(this) ;

        setLayout(new FlowLayout());
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){

        String name = x1.getText();

        if (m1.isSelected()){
            name = "Hello Mr " + name;
        }
        else
            name = "Hello Mrs " + name;
        if (c1.isSelected()){
            name = name + ", Loves dancing";
        }
        if (c2.isSelected()){
            name = name + ", Loves Singing";
        }
        x2.setText(name);
    }
}

