package com.swing;

import com.aditya.Student;
import com.service.StudentService;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldDemo extends JFrame {

    private JButton btnSubmit;
    private JPanel panel;
    private JTextField Name;
    private JTextField RollNo;

    TextFieldDemo(){
        setTitle("Text Field Demo");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Name = new JTextField(5);
        RollNo = new JTextField(5);
        panel = new JPanel();
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String name = Name.getText();
                String rollNo = RollNo.getText();

                if(StudentService.create(new Student(Integer.parseInt(rollNo),name))){
                    Name.setText("");
                    RollNo.setText("");
                    JOptionPane.showMessageDialog(panel,"Student Created Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        panel.add(Name);
        panel.add(RollNo);
        panel.add(btnSubmit);
        add(panel);
        System.out.println(Thread.currentThread());
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TextFieldDemo();
            }
        });
    }
}
