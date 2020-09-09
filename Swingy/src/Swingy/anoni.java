package Swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class anoni {
    public static void main(String[] args) {
        myclass obj = new myclass();
    }
}

class myclass extends JFrame {

    JTextField x1, x2;
    JButton a, b;
    JLabel P;

    public myclass(){
        x1 = new JTextField(10);
        x2 = new JTextField(10);
        a = new JButton("Multi");
        b = new JButton("Div");
        P =  new JLabel("Result");

        add(x1);
        add(x2);
        add(a);
        add(b);
        add(P);

        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(x1.getText());
                int y = Integer.parseInt(x2.getText());
                int value = i * y;
                P.setText("Multi is = " + value);
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x = Integer.parseInt(x1.getText());
                int y = Integer.parseInt(x2.getText());
                int res = x / y;
                P.setText("Division is = " + res);
            }
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
