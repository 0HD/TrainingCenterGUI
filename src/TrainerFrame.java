import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TrainerFrame extends UserFrame {
    private JTabbedPane tabbedPane;

    private JLabel welcomeText;
    public TrainerFrame(int id) {
        super("Trainer");

        welcomeText = super.getWelcomeLabel();

        SwingWorker s = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                try {
                    DatabaseManager db = new DatabaseManager();
                    ResultSet rs = db.selectTable("trainer WHERE ID = " + id + ";");
                    rs.next();
                    welcomeText.setText("Welcome, " + rs.getString("FName")
                            + " " + rs.getString("LName") + "!");
                } catch (SQLException s) {
                    JOptionPane.showMessageDialog(null, s.getStackTrace(), s.getMessage(), JOptionPane.WARNING_MESSAGE);
                }
                return null;
            }
        };
        s.execute();

        tabbedPane = super.getTabbedPane();
        tabbedPane.addTab("My Courses", new AdminListPanel("course\n" +
                "    LEFT JOIN is_assigned ON course.CourseId = is_assigned.CourseID\n" +
                "    WHERE TrainerID = " + id + ";", "Course").$$$getRootComponent$$$());
        tabbedPane.addTab("All Sessions", new AdminListPanel("training_session", "Session").$$$getRootComponent$$$());
        tabbedPane.addTab("My Trainees", new AdminListPanel("(((course\n" +
                "LEFT JOIN `Trainig_center(2)`.is_assigned ON course.CourseId = is_assigned.CourseID)\n" +
                "LEFT JOIN training_session ON training_session.CourseId = course.CourseID)\n" +
                "LEFT JOIN is_enrolled ON is_enrolled.SessionNumber = training_session.SessionID)\n" +
                "LEFT JOIN trainee ON trainee.ID = is_enrolled.TraineeID\n" +
                "WHERE TrainerID = " + id + ";", "Trainee", "trainee.*").$$$getRootComponent$$$());
    }
}
