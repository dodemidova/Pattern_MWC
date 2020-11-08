package com.company.view;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyPanel panel;

    public MyFrame(MyPanel panel){
        this.panel=panel;
        add(panel);
        setSize(800,600);
        //pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
