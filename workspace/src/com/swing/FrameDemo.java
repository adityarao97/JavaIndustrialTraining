package com.swing;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameDemo extends Frame {
    FrameDemo(){
        setTitle("Frame Demo");
        setSize(300,300);
        setLocation(300,400);
    }

    public static void main(String[] args) {
        Frame f = new FrameDemo();
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        f.setVisible(true);
    }
}
