import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;

public class LoginFrame {
    private JPanel UI;
    private JTextField textField1;
    private JButton loginButton;
    private JPasswordField passwordField1;

    public JButton getLoginButton() {
        return loginButton;
    }

    LoginFrame() {
        loginButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        SwingWorker s = new SwingWorker() {
                            @Override
                            protected Object doInBackground() throws Exception {
                                loginButton.setText("                        Logging in...                        ");
                                loginButton.setEnabled(false);
                                textField1.setEditable(false);
                                passwordField1.setEditable(false);
                                String password = new String(passwordField1.getPassword());
                                int[] id = new int[1];
                                User type = DatabaseManager.verifyLogin(textField1.getText(), password, id);
                                UserFrame uf = null;
                                if (type == User.ADMIN) {
                                    uf = new AdminFrame();
                                } else if (type == User.TRAINEE) {
                                    uf = new TraineeFrame(id[0]);
                                } else if (type == User.TRAINER) {
                                    uf = new TrainerFrame(id[0]);
                                }

                                if (uf != null) {
                                    textField1.setText(null);
                                    passwordField1.setText(null);
                                    JFrame frame = TrainingCenterGUI.getFrame();
                                    frame.setContentPane(uf.getUI());
                                    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                                    frame.pack();
                                    frame.setSize(600, 500);
                                    frame.setMinimumSize(frame.getSize());
                                    frame.setMaximumSize(null);
                                    frame.setResizable(true);
                                    frame.setVisible(true);
                                    frame.getRootPane().setDefaultButton(null);
                                }

                                return type;
                            }

                            protected void done() {
                                try {
                                    loginButton.setEnabled(true);
                                    loginButton.setText("                              Login                              ");
                                    textField1.setEditable(true);
                                    passwordField1.setEditable(true);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        s.execute();
                    }
                }
        );
    }

    public JComponent getUI() {
        return $$$getRootComponent$$$();
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
        UI = new JPanel();
        UI.setLayout(new BorderLayout(0, 0));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        UI.add(panel1, BorderLayout.CENTER);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout(0, 0));
        panel1.add(panel2, BorderLayout.CENTER);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new BorderLayout(0, 0));
        panel2.add(panel3, BorderLayout.NORTH);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.BOLD, 16, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setHorizontalAlignment(0);
        label1.setText("Training Center");
        panel3.add(label1, BorderLayout.NORTH);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new BorderLayout(0, 0));
        panel3.add(panel4, BorderLayout.SOUTH);
        final JLabel label2 = new JLabel();
        label2.setText(" ");
        panel4.add(label2, BorderLayout.WEST);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel2.add(panel5, BorderLayout.CENTER);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new BorderLayout(0, 0));
        panel5.add(panel6, BorderLayout.NORTH);
        final JSplitPane splitPane1 = new JSplitPane();
        splitPane1.setContinuousLayout(false);
        splitPane1.setDividerLocation(70);
        splitPane1.setDividerSize(0);
        splitPane1.setEnabled(false);
        panel6.add(splitPane1, BorderLayout.CENTER);
        final JLabel label3 = new JLabel();
        label3.setText("Username");
        splitPane1.setLeftComponent(label3);
        textField1 = new JTextField();
        splitPane1.setRightComponent(textField1);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new BorderLayout(0, 0));
        panel5.add(panel7, BorderLayout.CENTER);
        final JSplitPane splitPane2 = new JSplitPane();
        splitPane2.setDividerLocation(70);
        splitPane2.setDividerSize(0);
        splitPane2.setEnabled(false);
        panel7.add(splitPane2, BorderLayout.NORTH);
        final JLabel label4 = new JLabel();
        label4.setText("Password");
        splitPane2.setLeftComponent(label4);
        passwordField1 = new JPasswordField();
        splitPane2.setRightComponent(passwordField1);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new BorderLayout(0, 0));
        panel7.add(panel8, BorderLayout.SOUTH);
        final JLabel label5 = new JLabel();
        label5.setText(" ");
        panel8.add(label5, BorderLayout.WEST);
        final JPanel panel9 = new JPanel();
        panel9.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        panel7.add(panel9, BorderLayout.CENTER);
        loginButton = new JButton();
        loginButton.setLabel("                              Login                              ");
        loginButton.setText("                              Login                              ");
        panel9.add(loginButton);
        final JPanel panel10 = new JPanel();
        panel10.setLayout(new BorderLayout(0, 0));
        UI.add(panel10, BorderLayout.EAST);
        final JLabel label6 = new JLabel();
        label6.setText("   ");
        panel10.add(label6, BorderLayout.EAST);
        final JPanel panel11 = new JPanel();
        panel11.setLayout(new BorderLayout(0, 0));
        UI.add(panel11, BorderLayout.WEST);
        final JLabel label7 = new JLabel();
        label7.setText("   ");
        panel11.add(label7, BorderLayout.WEST);
        final JPanel panel12 = new JPanel();
        panel12.setLayout(new BorderLayout(0, 0));
        UI.add(panel12, BorderLayout.NORTH);
        final JLabel label8 = new JLabel();
        label8.setText(" ");
        panel12.add(label8, BorderLayout.NORTH);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        Font font = new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
        boolean isMac = System.getProperty("os.name", "").toLowerCase(Locale.ENGLISH).startsWith("mac");
        Font fontWithFallback = isMac ? new Font(font.getFamily(), font.getStyle(), font.getSize()) : new StyleContext().getFont(font.getFamily(), font.getStyle(), font.getSize());
        return fontWithFallback instanceof FontUIResource ? fontWithFallback : new FontUIResource(fontWithFallback);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return UI;
    }

}
