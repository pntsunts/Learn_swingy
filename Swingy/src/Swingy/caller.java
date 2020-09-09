package Swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class caller {
    public static void main(String[] args){
        me obj = new me();
    }
}

class me extends JFrame implements ActionListener{
    int i;
    JProgressBar p;

    public me(){

        JButton X = new JButton("ADD form");
        p = new JProgressBar(0, 20);
        Timer t = new Timer(250, this);

        X.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                t.start();
            }
        });

        add(X);
        add(p);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(400, 400);
    }
    public void actionPerformed(ActionEvent e){
        if (i == 20)
        {
            new Input();
            dispose();
        }
        i++;
        p.setValue(i);
    }
}
