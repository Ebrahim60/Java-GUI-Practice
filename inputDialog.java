import javax.swing.*;

public class inputDialog {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog(null, "Enter Name", "Name Input", 3);

        JOptionPane.showMessageDialog(null, name + " welcome to swing tutorial", "Message", -1);
    }
}
