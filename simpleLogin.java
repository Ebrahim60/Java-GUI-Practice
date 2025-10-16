import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class simpleLogin {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Action Listener");
        Font f = new Font("Arial", Font.BOLD, 15);
        Font f1 = new Font("Arial", Font.TYPE1_FONT, 13);
        Font f2 = new Font("Arial", Font.BOLD, 20);

        JLabel label1 = new JLabel("Enter Username");
        label1.setBounds(50, 50, 150, 50);
        label1.setFont(f);
        frame.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(190, 58, 200, 35);
        field1.setBorder(null);
        field1.setFont(f1);
        frame.add(field1);

        JLabel label2 = new JLabel("Enter Password");
        label2.setBounds(50, 105, 150, 50);
        label2.setFont(f);
        frame.add(label2);

        JPasswordField field2 = new JPasswordField();
        field2.setBounds(190, 110, 200, 35);
        field2.setBorder(null);
        // field2.setEchoChar('*');//for set custom password echo
        field2.setFont(f1);
        frame.add(field2);

        JLabel radioLabel = new JLabel("Select Gender");
        radioLabel.setBounds(50, 180, 200, 35);
        radioLabel.setFont(f);
        frame.add(radioLabel);

        ButtonGroup grp = new ButtonGroup();
        ButtonGroup grpc = new ButtonGroup();

        JRadioButton male = new JRadioButton("Male");
        male.setBounds(190, 173, 80, 50);
        male.setBackground(Color.lightGray);
        male.setFont(f);
        frame.add(male);

        JRadioButton female = new JRadioButton("Female");
        female.setBounds(270, 173, 100, 50);
        female.setBackground(Color.lightGray);
        female.setFont(f);
        frame.add(female);

        JRadioButton other = new JRadioButton("Other");
        other.setBounds(380, 173, 80, 50);
        other.setBackground(Color.lightGray);
        other.setSelected(true);
        other.setFont(f);
        frame.add(other);

        grp.add(male);
        grp.add(female);
        grp.add(other);

        JLabel checkBoxLabel = new JLabel("Select Age");
        checkBoxLabel.setBounds(50, 240, 200, 35);
        checkBoxLabel.setFont(f);
        frame.add(checkBoxLabel);

        JCheckBox box1 = new JCheckBox("10-20");
        box1.setBounds(190, 230, 75, 50);
        box1.setBackground(Color.lightGray);
        box1.setFont(f);
        frame.add(box1);

        JCheckBox box2 = new JCheckBox("20-30");
        box2.setBounds(260, 230, 75, 50);
        box2.setBackground(Color.lightGray);
        box2.setFont(f);
        frame.add(box2);

        JCheckBox box3 = new JCheckBox("20-30");
        box3.setBounds(330, 230, 75, 50);
        box3.setBackground(Color.lightGray);
        box3.setFont(f);
        frame.add(box3);

        grpc.add(box1);
        grpc.add(box2);
        grpc.add(box3);

        JLabel ComboBoxLabel = new JLabel("Select Job");
        ComboBoxLabel.setBounds(50, 290, 200, 35);
        ComboBoxLabel.setFont(f);
        frame.add(ComboBoxLabel);

        JComboBox<String> cbox1 = new JComboBox<>(new String[] { "Van Driver", "Govt Job", "Business", "Other" });
        cbox1.setBounds(190, 290, 100, 30);
        cbox1.setBackground(Color.WHITE);
        cbox1.setEditable(true);
        cbox1.setSelectedIndex(1);
        cbox1.setBorder(null);
        frame.add(cbox1);

        Cursor cr = new Cursor((Cursor.HAND_CURSOR));
        JButton button = new JButton("Submit");
        button.setBounds(195, 380, 100, 40);
        button.setFont(f2);
        button.setCursor(cr);
        button.setBackground(Color.orange);
        frame.add(button);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = field1.getText();
                String password = new String(field2.getPassword());

                if (username.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "⚠ All fields are required!");
                } else {
                    JOptionPane.showMessageDialog(frame, "Successfullt Log In.");
                    field1.setText("");
                    field2.setText("");
                }
            }
        };

        button.addActionListener(listener);

        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setBounds(50, 50, 500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
