package ColorMaker;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class colorMaker extends JFrame implements ChangeListener {

    private Container c;
    private JLabel labelRed, labelGreen, labelBlue, preview;
    private JSlider sliderRed, sliderGreen, sliderBlue;
    private JTextField fieldRed, filedGreen, fieldBlue;
    private JPanel panel;
    private Font f1, f2;

    colorMaker() {
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.WHITE);

        f1 = new Font("Arial", Font.BOLD, 18);
        f2 = new Font("Arial", Font.PLAIN, 18);

        labelRed = new JLabel("Red");
        labelRed.setBounds(40, 80, 50, 30);
        labelRed.setFont(f1);
        c.add(labelRed);

        labelGreen = new JLabel("Green");
        labelGreen.setBounds(40, 135, 90, 30);
        labelGreen.setFont(f1);
        c.add(labelGreen);

        labelBlue = new JLabel("Blue");
        labelBlue.setBounds(40, 190, 50, 30);
        labelBlue.setFont(f1);
        c.add(labelBlue);

        sliderRed = new JSlider(0, 255, 0);
        sliderRed.setBounds(110, 80, 200, 30);
        sliderRed.setBackground(Color.WHITE);
        c.add(sliderRed);

        sliderGreen = new JSlider(0, 255, 0);
        sliderGreen.setBounds(110, 135, 200, 30);
        sliderGreen.setBackground(Color.WHITE);
        c.add(sliderGreen);

        sliderBlue = new JSlider(0, 255, 0);
        sliderBlue.setBounds(110, 190, 200, 30);
        sliderBlue.setBackground(Color.WHITE);
        c.add(sliderBlue);

        fieldRed = new JTextField();
        fieldRed.setBounds(320, 75, 80, 40);
        fieldRed.setHorizontalAlignment(JTextField.CENTER);
        fieldRed.setFont(f2);
        c.add(fieldRed);

        filedGreen = new JTextField();
        filedGreen.setBounds(320, 130, 80, 40);
        filedGreen.setHorizontalAlignment(JTextField.CENTER);
        filedGreen.setFont(f2);
        c.add(filedGreen);

        fieldBlue = new JTextField();
        fieldBlue.setBounds(320, 185, 80, 40);
        fieldBlue.setHorizontalAlignment(JTextField.CENTER);
        fieldBlue.setFont(f2);
        c.add(fieldBlue);

        panel = new JPanel();
        panel.setBounds(430, 60, 200, 180);
        panel.setBackground(Color.BLACK);
        c.add(panel);

        preview = new JLabel("Preview");
        preview.setBounds(500, 245, 100, 30);
        preview.setFont(f1);
        c.add(preview);

        sliderRed.addChangeListener(this);
        sliderGreen.addChangeListener(this);
        sliderBlue.addChangeListener(this);
    }

    public void stateChanged(ChangeEvent e) {

        int redValue = sliderRed.getValue();
        int greenValue = sliderGreen.getValue();
        int blueValue = sliderBlue.getValue();

        fieldRed.setText("" + redValue);
        filedGreen.setText("" + greenValue);
        fieldBlue.setText("" + blueValue);

        Color col = new Color(redValue, greenValue, blueValue);
        panel.setBackground(col);
    }

    public static void main(String[] args) {
        colorMaker frame = new colorMaker();

        frame.setTitle("Color Maker");
        frame.setVisible(true);
        frame.setBounds(300, 300, 700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
