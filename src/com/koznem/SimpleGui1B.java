package com.koznem;

import javax.swing.*;
import java.awt.*;

class SimpleGui1B{
    public static void main(String[] args) {
        SimpleGui1B object = new SimpleGui1B();

        object.go();
    }



    public void play(){

    }

    public void go(){
        JFrame frame = new JFrame();
        MyDrawPanel myDrawPanel = new MyDrawPanel();
        JButton button = new JButton("Click me");

        button.addActionListener(x-> frame.repaint());

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, myDrawPanel);



        frame.setVisible(true);
        frame.setSize(600, 600);


    }


}