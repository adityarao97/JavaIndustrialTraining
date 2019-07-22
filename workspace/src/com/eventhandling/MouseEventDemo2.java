package com.eventhandling;

import java.applet.Applet;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MouseEventDemo2 extends Applet {
    @Override
    public void init() {
        addMouseListener(new MyMouseListener(this));
    }
}

class MyMouseListener extends MouseAdapter{

    Applet enclosingApplet;
    MyMouseListener(Applet applet){
        enclosingApplet = applet;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        enclosingApplet.showStatus("Mouse Clicked ****");
    }
}