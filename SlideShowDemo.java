import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SlideShowDemo extends JFrame {

    private Container c;
    private JPanel panel1;
    private JButton button1, button2;
    private ImageIcon icon;
    private JLabel label;
    private CardLayout card;

    SlideShowDemo() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        card = new CardLayout();

        panel1 = new JPanel(card);
        panel1.setBounds(20, 20, 540, 440);
        c.add(panel1);

        button1 = new JButton("Previous");
        button1.setBounds(20, 475, 100, 50);
        c.add(button1);

        button2 = new JButton("Next");
        button2.setBounds(460, 475, 100, 50);
        c.add(button2);

        String[] imageName = { "image1.jpeg", "image2.jpeg", "image3.jpeg", "image4.jpeg", "image5.jpeg" };
        for (String n : imageName) {
            icon = new ImageIcon(n);
            // resize image
            Image img = icon.getImage().getScaledInstance(panel1.getWidth(), panel1.getHeight(), Image.SCALE_SMOOTH);
            icon = new ImageIcon(img);

            label = new JLabel(icon);
            panel1.add(label);
        }

        ActionListener Listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                if (e.getSource() == button2) {
                    card.next(panel1);
                } else {
                    card.previous(panel1);
                }
            }
        };
        button1.addActionListener(Listener);
        button2.addActionListener(Listener);
    }

    public static void main(String[] args) {
        SlideShowDemo frame = new SlideShowDemo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
