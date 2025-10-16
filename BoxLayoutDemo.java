import javax.swing.*;
import java.awt.*;

public class BoxLayoutDemo extends JFrame {

    private Container c;
    private BoxLayout box;
    private JButton buttons[];

    BoxLayoutDemo() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        box = new BoxLayout(c, BoxLayout.X_AXIS);
        c.setLayout(box);

        // multiple buttton creat using array
        buttons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("" + (i + 1));
            c.add(buttons[i]);
            c.add(Box.createHorizontalStrut(20));// for button gap
        }

    }

    public static void main(String[] args) {

        BoxLayoutDemo frame = new BoxLayoutDemo();

        frame.setVisible(true);
        frame.setTitle("BorderLayout Example");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
    }
}