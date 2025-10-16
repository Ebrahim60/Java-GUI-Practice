package StudentManagement;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;

public class StudentManage extends JFrame implements ActionListener {
    private Container c;
    private JLabel headLabel, flabel, llabel, plabel, glabel, list;
    private JTextField ffield, lfield, pfield, gfield;
    private JButton addButton, updateButton, deleteButton, clearButton;
    private JTable table;
    private JScrollPane scroll;
    private DefaultTableModel model;
    private Font f, f1, f2, f3;

    private String[] columns = { "First Name", "Last Name", "Phone No.", "GPA" };
    private String[] row = new String[4];

    public StudentManage() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        f = new Font("Arial", Font.BOLD, 30);
        f1 = new Font("Arial", Font.BOLD, 18);
        f2 = new Font("Arial", Font.PLAIN, 18);
        f3 = new Font("Arial", Font.TYPE1_FONT, 15);

        headLabel = new JLabel(" Student Management ");
        headLabel.setBounds(250, 30, 330, 50);
        headLabel.setBackground(Color.MAGENTA);
        headLabel.setFont(f);
        headLabel.setOpaque(true);
        headLabel.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        c.add(headLabel);

        flabel = new JLabel("First Name");
        flabel.setBounds(110, 100, 100, 50);
        flabel.setFont(f1);
        c.add(flabel);

        llabel = new JLabel("Last Name");
        llabel.setBounds(110, 150, 100, 50);
        llabel.setFont(f1);
        c.add(llabel);

        plabel = new JLabel("Phone No.");
        plabel.setBounds(110, 203, 100, 50);
        plabel.setFont(f1);
        c.add(plabel);

        glabel = new JLabel("GPA");
        glabel.setBounds(110, 255, 100, 50);
        glabel.setFont(f1);
        c.add(glabel);

        ffield = new JTextField();
        ffield.setBounds(240, 104, 230, 30);
        ffield.setFont(f2);
        ffield.setBorder(null);
        c.add(ffield);

        lfield = new JTextField();
        lfield.setBounds(240, 160, 230, 30);
        lfield.setFont(f2);
        lfield.setBorder(null);
        c.add(lfield);

        pfield = new JTextField();
        pfield.setBounds(240, 213, 230, 30);
        pfield.setFont(f2);
        pfield.setBorder(null);
        c.add(pfield);

        gfield = new JTextField();
        gfield.setBounds(240, 265, 230, 30);
        gfield.setFont(f2);
        gfield.setBorder(null);
        c.add(gfield);

        addButton = new JButton("Add");
        addButton.setBounds(560, 104, 90, 30);
        addButton.setBackground(Color.GREEN);
        addButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        addButton.setFont(f1);
        c.add(addButton);

        updateButton = new JButton("Update");
        updateButton.setBounds(560, 160, 90, 30);
        updateButton.setBackground(Color.YELLOW);
        updateButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        updateButton.setFont(f1);
        c.add(updateButton);

        deleteButton = new JButton("Delete");
        deleteButton.setBounds(560, 215, 90, 30);
        deleteButton.setBackground(Color.RED);
        deleteButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        deleteButton.setFont(f1);
        c.add(deleteButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(560, 270, 90, 30);
        clearButton.setBackground(Color.cyan);
        clearButton.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        clearButton.setFont(f1);
        c.add(clearButton);

        list = new JLabel("List Of Student");
        list.setBounds(280, 330, 320, 50);
        list.setForeground(Color.BLUE);
        list.setFont(f);
        c.add(list);

        table = new JTable();

        model = new DefaultTableModel();
        model.setColumnIdentifiers(columns);
        table.setModel(model);
        table.setFont(f3);
        table.setSelectionBackground(Color.PINK);
        table.setBackground(Color.WHITE);
        table.setRowHeight(30);
        table.getTableHeader().setBackground(Color.ORANGE);
        table.getTableHeader().setFont(f1);

        scroll = new JScrollPane(table);
        scroll.setBounds(40, 390, 700, 250);
        c.add(scroll);

        addButton.addActionListener(this);
        clearButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);

        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table.getSelectedRow();

                String fName = model.getValueAt(selectedRow, 0).toString();
                String lName = model.getValueAt(selectedRow, 1).toString();
                String phoneno = model.getValueAt(selectedRow, 2).toString();
                String gpa = model.getValueAt(selectedRow, 3).toString();

                ffield.setText(fName);
                lfield.setText(lName);
                pfield.setText(phoneno);
                gfield.setText(gpa);

            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == addButton) {
            row[0] = ffield.getText();
            row[1] = lfield.getText();
            row[2] = pfield.getText();
            row[3] = gfield.getText();

            model.addRow(row);

        } else if (e.getSource() == clearButton) {

            ffield.setText("");
            lfield.setText("");
            pfield.setText("");
            gfield.setText("");

        } else if (e.getSource() == deleteButton) {

            int rowNumber = table.getSelectedRow();

            if (rowNumber >= 0) {
                model.removeRow(rowNumber);
            } else {
                JOptionPane.showMessageDialog(StudentManage.this, "No row has been selected or no row exist.");
            }
        } else if (e.getSource() == updateButton) {

            int rowNumber = table.getSelectedRow();

            String fName = ffield.getText();
            String lName = lfield.getText();
            String poneno = pfield.getText();
            String gpa = gfield.getText();

            model.setValueAt(fName, rowNumber, 0);
            model.setValueAt(lName, rowNumber, 1);
            model.setValueAt(poneno, rowNumber, 2);
            model.setValueAt(gpa, rowNumber, 3);

        }

    }

    public static void main(String[] args) {

        StudentManage frame = new StudentManage();

        frame.setBounds(700, 180, 800, 700);
        frame.setTitle("Student Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
