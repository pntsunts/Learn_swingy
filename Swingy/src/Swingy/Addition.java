package Swingy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {
    public static void main(String[] args){
        add obj = new add();
    }
}

class add extends JFrame {
    public add(){

         JTextField x1 = new JTextField(10);
         JTextField x2 = new JTextField(10);
         JButton b = new JButton("Ok");
         JLabel p = new JLabel("result");


         add(x1);
         add(x2);
         add(b);
         add(p);

         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 int i = Integer.parseInt(x1.getText());
                 int y = Integer.parseInt(x2.getText());
                 int res = i + y;
                 p.setText("RESULT IS " + res );
             }
         });

         setLayout(new FlowLayout());
         setVisible(true);
         setSize(400, 400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}