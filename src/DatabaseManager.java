import javax.swing.*;
import java.sql.*;
import java.util.Objects;

enum User {
    ADMIN,
    TRAINEE,
    TRAINER
}

public class DatabaseManager {
    private static String URL = "jdbc:mysql://";
    private static String username = "java";
    private static String password = "java";

    public static User verifyLogin(String username, String password, int[] id) {

        if (Objects.equals(username, "admin") && Objects.equals(password, "dbadmin123"))
            return User.ADMIN;
        else try {
            ResultSet rs = execute(
                "SELECT * FROM trainee WHERE username = '" + username + "' AND password = '" + password + "';"
                );

            rs.next();
            if (Objects.equals(rs.getString("username"), username)) {
                id[0] = rs.getInt("ID");
                return User.TRAINEE;
            }
            else {
                rs = execute(
                    "SELECT * FROM trainer WHERE username = '" + username + "' AND password = '" + password + "';"
                );
                rs.next();
                if (Objects.equals(rs.getString("username"), username)) {
                    id[0] = rs.getInt("ID");
                    return User.TRAINER;
                }
            }
        }
        catch (SQLException e) {
            try {
                ResultSet rs = execute(
                        "SELECT * FROM trainer WHERE username = '" + username + "' AND password = '" + password + "';"
                );
                rs.next();
                if (Objects.equals(rs.getString("username"), username)) {
                    id[0] = rs.getInt("ID");
                    return User.TRAINER;
                }
            }
            catch (SQLException s) {
                JOptionPane.showMessageDialog(null, s.getMessage());
            }
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

    public ResultSet selectTable(String table, String columns) {

        ResultSet resultSet = null;
        try {
            resultSet = execute("SELECT " + columns + " FROM " + table);
        }
        catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getStackTrace());
        }
        return resultSet;
    }

    public ResultSet selectTable(String table) {
        return selectTable(table, "*");
    }

    public static ResultSet execute(String sql) throws SQLException {
        Connection c = DriverManager.getConnection(URL, username, password);
        PreparedStatement ps = c.prepareStatement(sql);
        return ps.executeQuery();
    }

}


















































