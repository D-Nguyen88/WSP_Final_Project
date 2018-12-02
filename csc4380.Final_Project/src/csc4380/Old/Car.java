/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380.Old;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author escottmurrell
 */
public class Car extends JLabel implements ActionListener {
    int deltaX = 2;
    int deltaY = 3;
    int directionX = 1;
    int directionY = 1;
    Image img;
    String color;
    
    public Car(
        int startX, int startY,
        int deltaX, int deltaY,
        int directionX, int directionY,
        int delay, String colorDir)
    {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
        this.directionX = directionX;
        this.directionY = directionY;
        this.color = color;
        
        String localDir = System.getProperty("user.dir");
        img = Toolkit.getDefaultToolkit().createImage(localDir + colorDir);
        setIcon( new ImageIcon(img) );
        setSize( getPreferredSize() );
        setLocation(startX, startY);
        new javax.swing.Timer(delay, this).start();
    }
    
    boolean finished = false;
    public void actionPerformed(ActionEvent e) {
        if(!finished)
        {
        Container parent = getParent();

        //  Determine next X position

        int nextX = getLocation().x + (deltaX * directionX);


        int nextY = getLocation().y + (deltaY * directionY);


        if(parent == null)
        {
            this.remove(this);
        }
        else if ( nextY + getSize().height > parent.getSize().height)
        {

            parent.remove(this);
            parent.repaint();
            finished = true;
            return;
        }

        //  Move the label
            setLocation(nextX, nextY);
        }
    }

    public static void main(String[] args)
    {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setContentPane(panel);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.getContentPane().setLayout(null);
        frame.setSize(700, 400);
        frame.setLocationRelativeTo( null );
        frame.setVisible(true);
    }
}
