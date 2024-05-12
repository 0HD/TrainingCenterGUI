import javax.swing.*;
import java.sql.*;

public class SessionButton extends JButton {
    public SessionButton(String sessionNo) {
        setEnabled(false);
        setText("Fetching course name...");
        addActionListener(e -> {
            JFrame frame = new JFrame("Session Details");
            frame.setContentPane(new SessionWindow(sessionNo).getUI());
            frame.pack();
            frame.setResizable(false);
            frame.setVisible(true);
        });
        SwingWorker s = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                DatabaseManager db = new DatabaseManager();
                ResultSet rs = db.selectTable("training_session WHERE SessionID = " + sessionNo + ";");
                setEnabled(true);
                rs.next();
                setText(rs.getString("SessionName"));
                return null;
            }
        };

        s.execute();
    }
}
