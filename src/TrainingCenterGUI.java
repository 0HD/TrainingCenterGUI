import javax.swing.*;

public class TrainingCenterGUI {
    private static JFrame frame;

    public static JFrame getFrame() {
        return frame;
    }

    public static void main(String[] args) {
        frame = new JFrame("Training Center");
        LoginFrame lf = new LoginFrame();
        frame.setContentPane(lf.getUI());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(270,200);
        frame.setMinimumSize(frame.getSize());
        frame.setMaximumSize(frame.getSize());
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getRootPane().setDefaultButton(lf.getLoginButton());

    }
}