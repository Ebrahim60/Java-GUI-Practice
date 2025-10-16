package VowelCounter;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class vowel extends JFrame {
    private Container c;
    private JLabel label1, label2, tlabel, alabel, elabel, ilabel, olabel, ulabel;
    private Font f1, f2, f3, f4;
    private JTextArea area1;
    private JScrollPane p;

    int totalCount = 0;
    int total_a = 0;
    int total_e = 0;
    int total_i = 0;
    int total_o = 0;
    int total_u = 0;

    vowel() {

        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        f1 = new Font("Arial", Font.BOLD + Font.ITALIC, 40);
        label1 = new JLabel("Vowel Counter");
        label1.setFont(f1);
        label1.setBounds(18, 20, 296, 60);
        label1.setOpaque(true);
        label1.setBackground(Color.WHITE);
        label1.setForeground(Color.MAGENTA);
        label1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        c.add(label1);

        f2 = new Font("Arial", Font.BOLD, 20);
        label2 = new JLabel("Enter A String:");
        label2.setFont(f2);
        label2.setBounds(18, 95, 296, 60);
        label2.setForeground(Color.BLUE);
        c.add(label2);

        area1 = new JTextArea();
        p = new JScrollPane(area1);
        f3 = new Font("Arial", Font.TYPE1_FONT, 15);
        p.setBounds(18, 150, 296, 110);
        p.setBorder(null);
        area1.setLineWrap(true);
        area1.setWrapStyleWord(true);
        area1.setFont(f3);
        p.setBorder(BorderFactory.createLineBorder(Color.GRAY, 3));
        c.add(p);

        tlabel = new JLabel();
        tlabel.setText("Total Number Of Vowel : " + totalCount);
        tlabel.setFont(f2);
        tlabel.setForeground(Color.RED);
        tlabel.setBounds(18, 270, 300, 50);
        c.add(tlabel);

        f4 = new Font("Arial", Font.BOLD, 17);

        alabel = new JLabel();
        alabel.setFont(f4);
        alabel.setText("Vowel 'a','A': " + total_a);
        alabel.setBounds(18, 310, 200, 50);
        c.add(alabel);

        elabel = new JLabel();
        elabel.setFont(f4);
        elabel.setText("Vowel 'e','E': " + total_e);
        elabel.setBounds(18, 350, 200, 50);
        c.add(elabel);

        ilabel = new JLabel();
        ilabel.setFont(f4);
        ilabel.setText("Vowel 'i','I': " + total_i);
        ilabel.setBounds(18, 390, 200, 50);
        c.add(ilabel);

        olabel = new JLabel();
        olabel.setFont(f4);
        olabel.setText("Vowel 'o','O': " + total_o);
        olabel.setBounds(18, 430, 200, 50);
        c.add(olabel);

        ulabel = new JLabel();
        ulabel.setFont(f4);
        ulabel.setText("Vowel 'u','U': " + total_u);
        ulabel.setBounds(18, 470, 200, 50);
        c.add(ulabel);

        area1.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

                if (e.getSource() == area1) {

                    if (e.getKeyChar() == 'a' || e.getKeyChar() == 'A') {
                        totalCount++;
                        total_a++;
                        alabel.setText("Vowel 'a','A' : " + total_a);
                    }
                    if (e.getKeyChar() == 'e' || e.getKeyChar() == 'E') {
                        totalCount++;
                        total_e++;
                        elabel.setText("Vowel 'e','E' : " + total_e);
                    }
                    if (e.getKeyChar() == 'i' || e.getKeyChar() == 'I') {
                        totalCount++;
                        total_i++;
                        ilabel.setText("Vowel 'i','I'   : " + total_i);
                    }
                    if (e.getKeyChar() == 'o' || e.getKeyChar() == 'O') {
                        totalCount++;
                        total_o++;
                        olabel.setText("Vowel 'o','O': " + total_o);
                    }
                    if (e.getKeyChar() == 'u' || e.getKeyChar() == 'U') {
                        totalCount++;
                        total_u++;
                        ulabel.setText("Vowel 'u','U': " + total_u);
                    }

                    tlabel.setText("Total Number Of Vowel : " + totalCount);

                }

            }

            public void keyReleased(KeyEvent e) {

            }
        });

    }

    public static void main(String[] args) {

        vowel frame = new vowel();
        frame.setTitle("Vowel Counter");
        frame.setBounds(100, 100, 350, 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
