import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerVai extends JFrame {
    private Container c;
    private JTextField field1;
    private JTextArea area1;
    private Font f;

    KeyListenerVai() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f = new Font("Arial", Font.BOLD, 17);

        field1 = new JTextField();
        field1.setBounds(50, 50, 200, 50);
        field1.setBorder(null);
        field1.setFont(f);
        c.add(field1);

        area1 = new JTextArea();
        area1.setBounds(50, 110, 300, 300);
        area1.setFont(f);
        area1.setMargin(new Insets(10, 10, 10, 10));
        c.add(area1);

        field1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                area1.append("Key Typed : " + e.getKeyChar() + "\n");
            }

            public void keyPressed(KeyEvent e) {

                area1.append("Key Pressed : " + e.getKeyChar() + "\n");
            }

            public void keyReleased(KeyEvent e) {

                area1.append("Key Released : " + e.getKeyChar() + "\n");
            }
        });

    }

    public static void main(String[] args) {

        KeyListenerVai frame = new KeyListenerVai();

        frame.setBounds(100, 100, 600, 700);
        frame.setTitle("Key Listener");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
