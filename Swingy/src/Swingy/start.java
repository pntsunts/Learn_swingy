package Swingy;

import javax.swing.*;
import java.awt.*;

public class start {

    public static void main(String[] args) {
	    Abc obj = new Abc();

    }
}

class Abc extends JFrame {
    public Abc(){
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400, 400);
        JLabel P = new JLabel("Peter Pan");
        JLabel x = new JLabel("Come here");
        add(x);
        add(P);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
