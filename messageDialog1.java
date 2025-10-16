
import javax.swing.*;

public class messageDialog1 {
    public static void main(String[] args) {

        // ImageIcon icon = new ImageIcon("Here the path of icon"); //for use custom
        // icon and we have to use icon object as 5th parameter in JOption dialog

        JOptionPane.showMessageDialog(null, "Wrong Password", "Warning", 2);
    }
}

// messageType 0,1,2,3,-1 for icon