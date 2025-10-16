
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class testLogin {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Login Frame");
        Cursor c = new Cursor(Cursor.HAND_CURSOR);
        Font f1 = new Font("Arial", Font.BOLD, 18);
        Font f2 = new Font("Arial", Font.PLAIN, 16);

        JLabel label1 = new JLabel("Enter Username:");
        label1.setFont(f1);
        label1.setBounds(50, 50, 200, 50);
        frame.add(label1);

        JTextField field1 = new JTextField();
        field1.setBounds(200, 55, 200, 40);
        field1.setFont(f2);
        field1.setBorder(null);
        frame.add(field1);

        JLabel label2 = new JLabel("Enter Password:");
        label2.setFont(f1);
        label2.setBounds(50, 120, 200, 50);
        frame.add(label2);

        JPasswordField field2 = new JPasswordField();
        field2.setBounds(200, 125, 200, 40);
        field2.setFont(f2);
        field2.setBorder(null);
        frame.add(field2);

        JButton button1 = new JButton("Log In");
        button1.setBounds(160, 200, 100, 40);
        button1.setFont(f1);
        button1.setBackground(Color.ORANGE);
        button1.setCursor(c);
        frame.add(button1);

        JButton button2 = new JButton("Clear");
        button2.setBounds(290, 200, 100, 40);
        button2.setFont(f1);
        button2.setBackground(Color.pink);
        button2.setCursor(c);
        frame.add(button2);

        ActionListener Listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String username = "Ebrahim420";
                String password = "Ebrahim2020$";

                if (e.getSource() == button2) {
                    field1.setText("");
                    field2.setText("");
                } else {
                    if (username.equals(field1.getText()) && password.equals(new String(field2.getPassword()))) {
                        JOptionPane.showMessageDialog(null, "Log In Successfull.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Login Failed.Invalid Credentials.");
                    }
                }
            }

        };

        button1.addActionListener(Listener);
        button2.addActionListener(Listener);

        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.LIGHT_GRAY);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(300, 200, 600, 600);

    }
}
