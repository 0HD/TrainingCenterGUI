import javax.swing.*;

public class AdminFrame extends UserFrame {
    private JTabbedPane tabbedPane;

    public AdminFrame() {
        tabbedPane = super.getTabbedPane();
        tabbedPane.add(new ListPanel().$$$getRootComponent$$$());
    }

}
