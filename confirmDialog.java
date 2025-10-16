import javax.swing.*;

public class confirmDialog {
    public static void main(String[] args) {
        int choice = JOptionPane.showConfirmDialog(null, "Do you Want To quite", "Confirm", 1);

        if (choice == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "You click yes", "Message", -1);
        } else if (choice == JOptionPane.CANCEL_OPTION) {
            JOptionPane.showMessageDialog(null, "You click cancel", "Message", -1);

        } else {
            JOptionPane.showMessageDialog(null, "You click no", "Message", -1);

        }

    }

}
