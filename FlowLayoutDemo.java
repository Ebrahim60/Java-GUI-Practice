import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    private Container c;
    private FlowLayout flow;
    private JButton buttons[];

    FlowLayoutDemo() {
        c = this.getContentPane();
        c.setBackground(Color.PINK);
        flow = new FlowLayout(FlowLayout.LEFT);
        flow.setHgap(20);
        flow.setVgap(30);
        c.setLayout(flow);

        // multiple buttton creat using array
        buttons = new JButton[10];

        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton("" + (i + 1));
            c.add(buttons[i]);
        }

    }

    public static void main(String[] args) {

        FlowLayoutDemo frame = new FlowLayoutDemo();

        frame.setVisible(true);
        frame.setTitle("BorderLayout Example");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
    }
}