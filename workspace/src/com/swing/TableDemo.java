package com.swing;

import com.service.StudentService;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

public class TableDemo extends JFrame {

    private JTable jtable;
    private JButton btnDelete;
    private JScrollPane scrollpane;

    TableDemo(){
        setTitle("Table Demo");
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        btnDelete = new JButton("Delete");
        jtable = new JTable(StudentService.getTableModel());
        scrollpane = new JScrollPane(jtable);

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int idx = jtable.getSelectedRow();
                TableModel model = jtable.getModel();
                String strRollNo = (String)model.getValueAt(idx,0);
                int rollNo = Integer.parseInt(strRollNo);
//                StudentService.create(rollNo);
                jtable.setModel(StudentService.getTableModel());
            }
        });

        add(btnDelete, BorderLayout.SOUTH);
        add(scrollpane);


        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableDemo();
            }
        });
    }
}
