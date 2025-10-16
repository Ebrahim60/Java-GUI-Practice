
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

public class JTableDemo extends JFrame {
    private Container c;
    private JLabel label;
    private JTable table;
    private Font f, f1;
    private JScrollPane scrol;

    private String[] col = { "Id", "Name", "GPA" };
    private String[][] rows = {

            { "242311057", "Md Ebrahim Ali", "4.00" },
            { "242311074", "Musfiqur Rahim", "1.10" },
            { "242311071", "Rahanur Rahman", "1.10" },
            { "242311046", "Md Rabbi Khan", "1.10" },
            { "242311062", "Abu Sadiq Ifta", "4.00" },
            { "242311080", "MArjan Mahmud", "4.00" },
            { "242311059", "Ainal Haque", "4.00" },
            { "242311060", "Samiul Alim Porosh", "4.00" },
            { "242311046", "Md Rabbi Khan", "1.00" },
    };

    JTableDemo() {
        c = this.getContentPane();
        c.setLayout(null);

        f = new Font("Arial", Font.BOLD, 20);
        f1 = new Font("Arial", Font.PLAIN, 17);

        label = new JLabel("Student Information");
        label.setBounds(210, 20, 200, 50);
        label.setFont(f);
        c.add(label);

        table = new JTable(rows, col);
        // table.setEnabled(false);
        table.setSelectionBackground(Color.orange);
        table.setRowHeight(40);
        table.setFont(f1);
        table.setBackground(Color.PINK);
        table.getTableHeader().setFont(f);
        table.getTableHeader().setBackground(Color.YELLOW);
        scrol = new JScrollPane(table);
        scrol.setBounds(20, 70, 540, 150);
        c.add(scrol);
    }

    public static void main(String[] args) {

        JTableDemo frame = new JTableDemo();
        frame.setVisible(true);
        frame.setBounds(100, 100, 600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
