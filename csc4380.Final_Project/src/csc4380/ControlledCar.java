/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc4380;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author escottmurrell
 */
public class ControlledCar extends Car implements KeyListener {
    
    public ControlledCar(
        int startX, int startY,
        int deltaX, int deltaY,
        int directionX, int directionY,
        int delay, String colorDir) {
        super(startX,startY, deltaX, deltaY, directionX, directionY, delay, colorDir);
        this.addKeyListener(this);
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        int nextX = getLocation().x;
        Container parent = getParent();
        if (e.getKeyCode() == 39) {
          nextX += (deltaX * 1);
        } else if (e.getKeyCode()== 37) {
          nextX += (deltaX * -1);
        }
        if (nextX < 0 || nextX + getSize().width > parent.getSize().width) {
            setLocation(getLocation().x, getLocation().y);
        } else {
            setLocation(nextX, getLocation().y);
        }
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}

