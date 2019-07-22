package com.eventhandling;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEventDemo extends Applet implements MouseListener {

    String msg="";

    @Override
    public void init() {
        addMouseListener(this);
    }

    @Override
    public void paint(Graphics g){
//        g.drawString(msg);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("mouse clicked");
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("mouse pressed");repaint();
    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("mouse released");repaint();
    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("mouse entered");repaint();
    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("mouse exited");repaint();
    }
}
