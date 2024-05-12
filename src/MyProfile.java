import javax.swing.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MyProfile {
    private JPanel panel1;
    private JTextArea fName;
    private JTextArea mName;
    private JTextArea LName;
    private JTextArea email;
    private JTextArea phone;
    private JTextArea major;
    private JTextArea address;
    private JTextArea username;
    private JButton editProfileButton;

    public MyProfile(int TraineeID) {
        SwingWorker s = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                try {
                    DatabaseManager db = new DatabaseManager();
                    ResultSet rs = db.selectTable("trainee " +
                            "WHERE ID = " + TraineeID + ";");
                    rs.next();
                    fName.setText(rs.getString("FName"));
                    mName.setText(rs.getString("MName"));
                    LName.setText(rs.getString("LName"));
                    email.setText(rs.getString("Email"));
                    phone.setText(rs.getString("Phone"));
                    major.setText(rs.getString("majorOrField"));
                    address.setText(rs.getString("city") + ", " + rs.getString("postcode"));
                    username.setText(rs.getString("username"));
                } catch (SQLException s) {
                    JOptionPane.showMessageDialog(null, s.getStackTrace(), s.getMessage(), JOptionPane.WARNING_MESSAGE);
                }
                return null;
            }
        };

        s.execute();
    }

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
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel2.add(panel3, BorderLayout.CENTER);
        final JLabel label1 = new JLabel();
        label1.setText("First name:");
        panel3.add(label1, BorderLayout.CENTER);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel3.add(panel4, BorderLayout.EAST);
        fName = new JTextArea();
        fName.setColumns(40);
        fName.setEditable(false);
        panel4.add(fName, BorderLayout.CENTER);
        final JLabel label2 = new JLabel();
        label2.setText(" ");
        panel3.add(label2, BorderLayout.NORTH);
        final JLabel label3 = new JLabel();
        label3.setText("     ");
        panel2.add(label3, BorderLayout.EAST);
        final JLabel label4 = new JLabel();
        label4.setText("     ");
        panel2.add(label4, BorderLayout.WEST);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel1.add(panel5, BorderLayout.CENTER);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout(0, 0));
        panel5.add(panel6, BorderLayout.NORTH);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new BorderLayout(0, 0));
        panel6.add(panel7, BorderLayout.CENTER);
        final JLabel label5 = new JLabel();
        label5.setText("Middle name:");
        panel7.add(label5, BorderLayout.CENTER);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new BorderLayout(0, 0));
        panel7.add(panel8, BorderLayout.EAST);
        mName = new JTextArea();
        mName.setColumns(40);
        mName.setEditable(false);
        panel8.add(mName, BorderLayout.CENTER);
        final JLabel label6 = new JLabel();
        label6.setText("     ");
        panel6.add(label6, BorderLayout.EAST);
        final JLabel label7 = new JLabel();
        label7.setText("     ");
        panel6.add(label7, BorderLayout.WEST);
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new BorderLayout(0, 0));
        panel5.add(panel9, BorderLayout.CENTER);
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new BorderLayout(0, 0));
        panel9.add(panel10, BorderLayout.NORTH);
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new BorderLayout(0, 0));
        panel10.add(panel11, BorderLayout.CENTER);
        final JLabel label8 = new JLabel();
        label8.setText("Last name:");
        panel11.add(label8, BorderLayout.CENTER);
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new BorderLayout(0, 0));
        panel11.add(panel12, BorderLayout.EAST);
        LName = new JTextArea();
        LName.setColumns(40);
        LName.setEditable(false);
        panel12.add(LName, BorderLayout.CENTER);
        final JLabel label9 = new JLabel();
        label9.setText("     ");
        panel10.add(label9, BorderLayout.EAST);
        final JLabel label10 = new JLabel();
        label10.setText("     ");
        panel10.add(label10, BorderLayout.WEST);
        final JPanel panel13 = new JPanel();
        panel13.setLayout(new BorderLayout(0, 0));
        panel9.add(panel13, BorderLayout.CENTER);
        final JPanel panel14 = new JPanel();
        panel14.setLayout(new BorderLayout(0, 0));
        panel13.add(panel14, BorderLayout.NORTH);
        final JPanel panel15 = new JPanel();
        panel15.setLayout(new BorderLayout(0, 0));
        panel14.add(panel15, BorderLayout.CENTER);
        final JLabel label11 = new JLabel();
        label11.setText("Email address:");
        panel15.add(label11, BorderLayout.CENTER);
        final JPanel panel16 = new JPanel();
        panel16.setLayout(new BorderLayout(0, 0));
        panel15.add(panel16, BorderLayout.EAST);
        email = new JTextArea();
        email.setColumns(40);
        email.setEditable(false);
        panel16.add(email, BorderLayout.CENTER);
        final JLabel label12 = new JLabel();
        label12.setText("     ");
        panel14.add(label12, BorderLayout.EAST);
        final JLabel label13 = new JLabel();
        label13.setText("     ");
        panel14.add(label13, BorderLayout.WEST);
        final JPanel panel17 = new JPanel();
        panel17.setLayout(new BorderLayout(0, 0));
        panel13.add(panel17, BorderLayout.CENTER);
        final JPanel panel18 = new JPanel();
        panel18.setLayout(new BorderLayout(0, 0));
        panel17.add(panel18, BorderLayout.NORTH);
        final JPanel panel19 = new JPanel();
        panel19.setLayout(new BorderLayout(0, 0));
        panel18.add(panel19, BorderLayout.CENTER);
        final JLabel label14 = new JLabel();
        label14.setText("Phone number:");
        panel19.add(label14, BorderLayout.CENTER);
        final JPanel panel20 = new JPanel();
        panel20.setLayout(new BorderLayout(0, 0));
        panel19.add(panel20, BorderLayout.EAST);
        phone = new JTextArea();
        phone.setColumns(40);
        phone.setEditable(false);
        panel20.add(phone, BorderLayout.CENTER);
        final JLabel label15 = new JLabel();
        label15.setText("     ");
        panel18.add(label15, BorderLayout.EAST);
        final JLabel label16 = new JLabel();
        label16.setText("     ");
        panel18.add(label16, BorderLayout.WEST);
        final JPanel panel21 = new JPanel();
        panel21.setLayout(new BorderLayout(0, 0));
        panel17.add(panel21, BorderLayout.CENTER);
        final JPanel panel22 = new JPanel();
        panel22.setLayout(new BorderLayout(0, 0));
        panel21.add(panel22, BorderLayout.NORTH);
        final JPanel panel23 = new JPanel();
        panel23.setLayout(new BorderLayout(0, 0));
        panel22.add(panel23, BorderLayout.CENTER);
        final JLabel label17 = new JLabel();
        label17.setText("Major/Field:");
        panel23.add(label17, BorderLayout.CENTER);
        final JPanel panel24 = new JPanel();
        panel24.setLayout(new BorderLayout(0, 0));
        panel23.add(panel24, BorderLayout.EAST);
        major = new JTextArea();
        major.setColumns(40);
        major.setEditable(false);
        panel24.add(major, BorderLayout.CENTER);
        final JLabel label18 = new JLabel();
        label18.setText("     ");
        panel22.add(label18, BorderLayout.EAST);
        final JLabel label19 = new JLabel();
        label19.setText("     ");
        panel22.add(label19, BorderLayout.WEST);
        final JPanel panel25 = new JPanel();
        panel25.setLayout(new BorderLayout(0, 0));
        panel21.add(panel25, BorderLayout.CENTER);
        final JPanel panel26 = new JPanel();
        panel26.setLayout(new BorderLayout(0, 0));
        panel25.add(panel26, BorderLayout.NORTH);
        final JPanel panel27 = new JPanel();
        panel27.setLayout(new BorderLayout(0, 0));
        panel26.add(panel27, BorderLayout.CENTER);
        final JLabel label20 = new JLabel();
        label20.setText("Address:");
        panel27.add(label20, BorderLayout.CENTER);
        final JPanel panel28 = new JPanel();
        panel28.setLayout(new BorderLayout(0, 0));
        panel27.add(panel28, BorderLayout.EAST);
        address = new JTextArea();
        address.setColumns(40);
        address.setEditable(false);
        panel28.add(address, BorderLayout.CENTER);
        final JLabel label21 = new JLabel();
        label21.setText("     ");
        panel26.add(label21, BorderLayout.EAST);
        final JLabel label22 = new JLabel();
        label22.setText("     ");
        panel26.add(label22, BorderLayout.WEST);
        final JPanel panel29 = new JPanel();
        panel29.setLayout(new BorderLayout(0, 0));
        panel25.add(panel29, BorderLayout.CENTER);
        final JPanel panel30 = new JPanel();
        panel30.setLayout(new BorderLayout(0, 0));
        panel29.add(panel30, BorderLayout.NORTH);
        final JPanel panel31 = new JPanel();
        panel31.setLayout(new BorderLayout(0, 0));
        panel30.add(panel31, BorderLayout.CENTER);
        final JLabel label23 = new JLabel();
        label23.setText("Username:");
        panel31.add(label23, BorderLayout.CENTER);
        final JPanel panel32 = new JPanel();
        panel32.setLayout(new BorderLayout(0, 0));
        panel31.add(panel32, BorderLayout.EAST);
        username = new JTextArea();
        username.setColumns(40);
        username.setEditable(false);
        panel32.add(username, BorderLayout.CENTER);
        final JLabel label24 = new JLabel();
        label24.setText("     ");
        panel30.add(label24, BorderLayout.EAST);
        final JLabel label25 = new JLabel();
        label25.setText("     ");
        panel30.add(label25, BorderLayout.WEST);
        final JPanel panel33 = new JPanel();
        panel33.setLayout(new BorderLayout(0, 0));
        panel29.add(panel33, BorderLayout.SOUTH);
        editProfileButton = new JButton();
        editProfileButton.setText("Edit profile");
        panel33.add(editProfileButton, BorderLayout.CENTER);
        final JLabel label26 = new JLabel();
        label26.setText("     ");
        panel33.add(label26, BorderLayout.WEST);
        final JLabel label27 = new JLabel();
        label27.setText("     ");
        panel33.add(label27, BorderLayout.EAST);
        final JLabel label28 = new JLabel();
        label28.setText(" ");
        panel33.add(label28, BorderLayout.SOUTH);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }
}
