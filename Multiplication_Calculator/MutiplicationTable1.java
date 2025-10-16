package Multiplication_Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MutiplicationTable1 extends JFrame {

    private Container c;
    private JLabel imgLabel, textLabel;
    private JTextArea ta;
    private JTextField tf;
    private JButton clearButton, calButton;
    private ImageIcon img;
    private Font f;
    private Cursor cursor;

    MutiplicationTable1() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        img = new ImageIcon("Images.jpg");
        imgLabel = new JLabel(img);
        imgLabel.setBounds(13, 13, img.getIconWidth(), img.getIconHeight());
        c.add(imgLabel);

        f = new Font("Tahoma", Font.BOLD, 20);
        textLabel = new JLabel("Enter Any Number :");
        textLabel.setBounds(13, 200, 250, 50);
        textLabel.setForeground(Color.MAGENTA);
        textLabel.setFont(f);
        c.add(textLabel);

        tf = new JTextField();
        tf.setFont(f);
        tf.setHorizontalAlignment(JTextField.CENTER);
        tf.setBounds(230, 200, 80, 47);
        tf.setBorder(null);
        c.add(tf);

        clearButton = new JButton("Clear");
        f = new Font("Tahoma", Font.BOLD, 17);
        cursor = new Cursor(Cursor.HAND_CURSOR);
        clearButton.setBounds(180, 265, 120, 40);
        clearButton.setForeground(Color.PINK);
        clearButton.setBackground(Color.blue);
        clearButton.setCursor(cursor);
        clearButton.setFont(f);
        clearButton.setFocusPainted(false);
        c.add(clearButton);

        calButton = new JButton("Calculate");
        calButton.setBounds(40, 265, 120, 40);
        calButton.setForeground(Color.PINK);
        calButton.setBackground(Color.blue);
        calButton.setCursor(cursor);
        calButton.setFont(f);
        calButton.setFocusPainted(false);
        c.add(calButton);

        ta = new JTextArea();
        f = new Font("Tahoma", Font.BOLD, 20);
        ta.setBounds(13, 320, 313, 328);
        ta.setMargin(new Insets(10, 15, 10, 15));
        ta.setFont(f);
        c.add(ta);

        calButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String value = tf.getText();

                if (value.isEmpty()) {
                    JOptionPane.showMessageDialog(MutiplicationTable1.this, "Please Enter A Number", "Alert!!", 3);
                } else {
                    ta.setText("");
                    int num;
                    try {
                        num = Integer.parseInt(tf.getText());
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(MutiplicationTable1.this, "Enter a valid number!", "Error",
                                0);
                        return;
                    }

                    for (int i = 1; i <= 10; i++) {
                        int result = num * i;

                        // For Convert int to string
                        // String r = String.valueOf(result);
                        // String n = String.valueOf(num);
                        // String incr = String.valueOf(i);

                        ta.append(num + " x " + i + " = " + result + "\n");
                    }

                }

            }
        });

        clearButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
                ta.setText("");
            }
        });

    }

    public static void main(String[] args) {

        MutiplicationTable1 frame = new MutiplicationTable1();
        ImageIcon icon = new ImageIcon("calculator.png");

        frame.setBounds(700, 180, 360, 700);
        frame.setIconImage(icon.getImage());
        frame.setTitle("Mutiplication Table");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
