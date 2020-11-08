package com.company;


import com.company.view.MyFrame;
import com.company.view.MyPanel;

public class Main {

    public static void main(String[] args) {
        MyPanel panel = new MyPanel();
        MyFrame frame = new MyFrame(panel);
    }
}
