package com.shotastage;

import java.awt.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        ImageIcon   icon   = new ImageIcon("./Assets/swift.gif");
	    JFrame      window = new JFrame("Swiftは神");
        JButton     button = new JButton(icon);


        
        window.add(button, BorderLayout.NORTH);
        window.pack();
        window.setVisible(true);
        System.out.println("S");
    }
}
