import javax.swing.*;
import java.awt.*;

public class GridLayoutDemo extends JFrame {

    private Container c;
    private GridLayout grid;
    private JButton buttons[];

    GridLayoutDemo() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        grid = new GridLayout(5, 2, 5, 5);
        c.setLayout(grid);

        // multiple buttton creat using array
        buttons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("" + (i + 1));
            c.add(buttons[i]);
        }

    }

    public static void main(String[] args) {

        GridLayoutDemo frame = new GridLayoutDemo();

        frame.setVisible(true);
        frame.setTitle("BorderLayout Example");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
    }
}