package Swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args){
        addsub obj = new addsub();
    }
}

class addsub extends JFrame implements ActionListener {
    JTextField x1, x2;
    JButton a, b;
    JLabel p;

    public addsub(){
         x1 = new JTextField(10);
         x2 = new JTextField(10);
         a = new JButton("ADD");
         b = new JButton("SUB");
         p = new JLabel("result");

        add(x1);
        add(x2);
        add(a);
        add(b);
        add(p);

        a.addActionListener(this);
        b.addActionListener(this);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        int i = Integer.parseInt(x1.getText());
        int x = Integer.parseInt(x2.getText());

        int Value;

        if (ae.getSource() == a){
            Value = x + i;
        }
        else
            Value = x - i;
        p.setText("Result " + Value);
    }
}
