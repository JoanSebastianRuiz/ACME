package projectacme.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {
    private String url;
    private String user;
    private String password;
    private static java.sql.Connection instance;

    private ConnectionData(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public static java.sql.Connection getConnectionDatabase() throws SQLException {
        if (instance == null || instance.isClosed()) {
            try {
            instance = DriverManager.getConnection("jdbc:mysql://localhost:3306/acme", "root", "tebas1998");
            System.out.println("Connection Successfully");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return instance;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Connection getInstance() {
        return instance;
    }

    public static void setInstance(Connection instance) {
        ConnectionData.instance = instance;
    }
}
