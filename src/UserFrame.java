import javax.swing.*;
import java.awt.*;

public class UserFrame {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(0, 0));
        panel1.add(panel2, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        label1.setText(" ");
        panel2.add(label1, BorderLayout.NORTH);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel2.add(panel3, BorderLayout.CENTER);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel3.add(panel4, BorderLayout.CENTER);
        final JLabel label2 = new JLabel();
        label2.setText("Welcome, user!");
        panel4.add(label2, BorderLayout.NORTH);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel3.add(panel5, BorderLayout.WEST);
        final JLabel label3 = new JLabel();
        label3.setText("    ");
        panel5.add(label3, BorderLayout.NORTH);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout(0, 0));
        panel2.add(panel6, BorderLayout.EAST);
        final JLabel label4 = new JLabel();
        label4.setText("    ");
        panel6.add(label4, BorderLayout.WEST);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new BorderLayout(0, 0));
        panel1.add(panel7, BorderLayout.SOUTH);
        final JLabel label5 = new JLabel();
        label5.setText(" ");
        panel7.add(label5, BorderLayout.NORTH);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new BorderLayout(0, 0));
        panel1.add(panel8, BorderLayout.CENTER);
        tabbedPane1 = new JTabbedPane();
        panel8.add(tabbedPane1, BorderLayout.CENTER);
        final JScrollPane scrollPane1 = new JScrollPane();
        tabbedPane1.addTab("Untitled", scrollPane1);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
