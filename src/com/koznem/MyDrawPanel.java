package com.koznem;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g){

        Image image = new ImageIcon("view.jpg").getImage();
        g.drawImage(image,3,4,this);

    }
}
