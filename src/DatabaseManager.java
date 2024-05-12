import javax.swing.*;
import java.sql.*;
import java.util.Objects;

enum User {
    ADMIN,
    TRAINEE,
    TRAINER
}

public class DatabaseManager {
    private static String URL = "";
    private static String username = "";
    private static String password = "";

    public static User verifyLogin(String username, String password) {

        if (Objects.equals(username, "admin") && Objects.equals(password, "dbadmin123"))
            return User.ADMIN;
        else try {
            ResultSet rs = execute(
                "SELECT * FROM trainee WHERE username = '" + username + "' AND password = '" + password + "';"
                );

            rs.next();
            if (Objects.equals(rs.getString("username"), username))
                return User.TRAINEE;
            else {
                rs = execute(
                    "SELECT * FROM trainer WHERE username = '" + username + "' AND password = '" + password + "';"
                );
                rs.next();
                if (Objects.equals(rs.getString("username"), username))
                    return User.TRAINER;
            }
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        return null;
    }

    public ResultSet connectionTest() {

        ResultSet resultSet = null;
        try {
            resultSet = execute("SELECT * FROM trainee");
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
        return resultSet;
    }

    public static ResultSet execute(String sql) throws SQLException {
        Connection c = DriverManager.getConnection(URL, username, password);
        PreparedStatement ps = c.prepareStatement(sql);
        return ps.executeQuery();
    }

}
