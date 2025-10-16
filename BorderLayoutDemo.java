import javax.swing.*;
import java.awt.*;

public class BorderLayoutDemo extends JFrame {

    private Container c;
    private BorderLayout bLayout;
    private JButton button1, button2, button3, button4, button5;

    BorderLayoutDemo() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        bLayout = new BorderLayout();
        // bLayout.setHgap(10);
        // bLayout.setVgap(10);
        c.setLayout(bLayout);

        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");

        c.add(button1, BorderLayout.NORTH);
        c.add(button2, BorderLayout.CENTER);
        c.add(button3, BorderLayout.SOUTH);
        c.add(button4, BorderLayout.WEST);
        c.add(button5, BorderLayout.EAST);
    }

    public static void main(String[] args) {

        BorderLayoutDemo frame = new BorderLayoutDemo();

        frame.setVisible(true);
        frame.setTitle("BorderLayout Example");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
    }
}
