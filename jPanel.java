
import javax.swing.*;
import java.awt.*;

public class jPanel extends JFrame {

    private Container c;
    private JPanel panel1, panel2;
    private JButton button1, button2, button3;

    jPanel() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        panel1 = new JPanel();
        panel1.setBounds(20, 80, 200, 400);
        panel1.setBackground(Color.MAGENTA);
        c.add(panel1);

        panel2 = new JPanel();
        panel2.setBounds(250, 80, 200, 400);
        panel2.setBackground(Color.GREEN);
        c.add(panel2);

        button1 = new JButton("Panel-1");
        panel1.add(button1);

        button2 = new JButton("Panel-2");
        panel2.add(button2);

        button3 = new JButton("Button-3");
        button3.setBounds(100, 10, 150, 50);
        c.add(button3);
    }

    public static void main(String[] args) {

        jPanel frame = new jPanel();
        frame.setVisible(true);
        frame.setTitle("JPanel");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 600, 600);
    }
}
