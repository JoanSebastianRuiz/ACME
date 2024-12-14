package projectacme.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionData {
    private static String url;
    private static String user;
    private static String password;
    private static java.sql.Connection instance;


    public static java.sql.Connection getConnectionDatabase() throws SQLException {
        if (instance == null || instance.isClosed()) {
            try {
                System.out.println("url: " + url);
                System.out.println("user: " + user);
                System.out.println("password: " + password);
            instance = DriverManager.getConnection("jdbc:mysql://" + url +"/acme", user, password);
            System.out.println("Connection Successfully");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return instance;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ConnectionData.url = url;
    }

    public static String getUser() {
        return user;
    }

    public static void setUser(String user) {
        ConnectionData.user = user;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        ConnectionData.password = password;
    }

    public static Connection getInstance() {
        return instance;
    }

    public static void setInstance(Connection instance) {
        ConnectionData.instance = instance;
    }
}
