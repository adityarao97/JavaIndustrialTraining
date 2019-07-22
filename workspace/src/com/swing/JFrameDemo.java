package com.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JFrameDemo extends JFrame {
    private JButton btnClose;
    private JButton btnBeep;
    private JPanel panel;

    JFrameDemo(){
        setTitle("Swing Demo");
        setSize(600,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
        btnClose = new JButton("Close");
        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });
        btnBeep = new JButton("Beep");
        btnBeep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                getToolkit().beep();
            }
        });
        panel.add(btnClose);
        panel.add(btnBeep);
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameDemo();

    }
}
