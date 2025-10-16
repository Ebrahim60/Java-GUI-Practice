import javax.swing.*;
import java.awt.*;

public class Jtextarea {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Text Area");

        Font f = new Font("Arial", Font.BOLD, 15);
        JTextArea area = new JTextArea();
        JScrollPane p = new JScrollPane(area);
        p.setBounds(20, 20, 300, 200);
        area.setLineWrap(true);
        area.setWrapStyleWord(true);
        area.setFont(f);
        frame.add(p);

        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 400);

    }
}
