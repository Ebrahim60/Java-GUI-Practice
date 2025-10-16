import java.awt.Color;

import javax.swing.*;
import java.awt.*;

public class JFrameSetup {
    public static void main(String[] args) {

        JFrame j = new JFrame("Ebrahim");
        Font f = new Font("Arial", Font.BOLD, 30);

        ImageIcon icon = new ImageIcon("avatar.png");
        j.setIconImage(icon.getImage());

        JLabel lebel1 = new JLabel();
        lebel1.setText("Hello Ebrahim");
        lebel1.setBounds(50, 20, 250, 50);
        lebel1.setFont(f);
        lebel1.setForeground(Color.BLUE);
        lebel1.setOpaque(true);
        lebel1.setBackground(Color.YELLOW);
        lebel1.setToolTipText("Eta Toya Er Husband");
        j.add(lebel1);

        JLabel lebel2 = new JLabel("Hello Toya");
        lebel2.setBounds(50, 60, 150, 50);
        lebel2.setFont(f);
        lebel2.setForeground(Color.green);
        lebel2.setToolTipText("Eta Ebrahim Er Wife");
        j.add(lebel2);

        JLabel lebel3 = new JLabel(icon);
        lebel3.setBounds(50, 150, icon.getIconWidth(), icon.getIconHeight());

        j.add(lebel3);

        JTextField f1 = new JTextField();
        Font f12 = new Font("Arial", Font.BOLD + Font.ITALIC, 20);
        f1.setBounds(300, 50, 250, 50);
        f1.setHorizontalAlignment(JTextField.CENTER);
        f1.setForeground(Color.RED);
        f1.setBackground(Color.ORANGE);
        f1.setFont(f12);
        j.add(f1);

        j.getContentPane().setLayout(null);
        j.getContentPane().setBackground(Color.white);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
        j.setBounds(500, 300, 800, 800);

    }
}
