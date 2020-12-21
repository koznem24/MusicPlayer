package com.koznem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGui1B implements ActionListener {

    JButton button;
    MyDrawPanel drawPanel = new MyDrawPanel();

    public static void main(String[] args) {
        SimpleGui1B gui = new SimpleGui1B();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame();
//        button = new JButton("Click me");
//
//        button.addActionListener((actionEvent)->button.setText("I have been clicked"));
//
//        frame.getContentPane().add(button);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST,new Button("Button1"));
        frame.getContentPane().add(BorderLayout.WEST, new Button("Button2"));
        frame.setSize(300, 300);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        button.setText("I've been clicked!");
    }
}
