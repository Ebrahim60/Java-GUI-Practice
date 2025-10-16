import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JColorChooserDemo extends JFrame {
    private Container c;
    private JButton button;

    JColorChooserDemo() {
        c = this.getContentPane();
        c.setLayout(null);

        button = new JButton("Select Color");
        button.setBounds(75, 100, 150, 50);
        c.add(button);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                Color color = JColorChooser.showDialog(null, "Choose Color", Color.BLUE);
                c.setBackground(color);
            }

        });

    }

    public static void main(String[] args) {

        JColorChooserDemo frame = new JColorChooserDemo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
