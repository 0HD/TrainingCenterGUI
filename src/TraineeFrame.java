import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TraineeFrame extends UserFrame {
    private JTabbedPane tabbedPane;
    private JLabel welcomeText;
    public TraineeFrame(int id){
        super("Trainee");
        welcomeText = super.getWelcomeLabel();

        SwingWorker s = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                try {
                    DatabaseManager db = new DatabaseManager();
                    ResultSet rs = db.selectTable("trainee WHERE ID = " + id + ";");
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
        tabbedPane.addTab("My Sessions", new UserListPanel(id).$$$getRootComponent$$$());
        tabbedPane.addTab("My Profile", new MyProfile(id).$$$getRootComponent$$$());
//        tabbedPane.addTab("a", new UserListPanel().$$$getRootComponent$$$());
    }
}
