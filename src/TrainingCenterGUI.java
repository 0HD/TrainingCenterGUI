import javax.swing.*;

public class TrainingCenterGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login to Training Center");
        frame.setContentPane(new LoginFrame().getUI());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(245,194);
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());
        frame.setResizable(false);
        frame.setVisible(true);
    }
}