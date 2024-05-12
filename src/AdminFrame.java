import javax.swing.*;

public class AdminFrame extends UserFrame {
    private JTabbedPane tabbedPane;

    public AdminFrame() {
        super("Administrator");
        tabbedPane = super.getTabbedPane();
        tabbedPane.addTab("Trainees", new AdminListPanel("trainee", "trainee").$$$getRootComponent$$$());
        tabbedPane.addTab("Trainers", new AdminListPanel("trainer", "trainer").$$$getRootComponent$$$());
        tabbedPane.addTab("Courses", new AdminListPanel("course", "course").$$$getRootComponent$$$());
    }

}
