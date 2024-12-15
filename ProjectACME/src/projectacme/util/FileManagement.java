package projectacme.util;

import projectacme.controller.AccessDatabaseController;
import projectacme.controller.LoginController;
import projectacme.view.IntefarceLogin;
import projectacme.view.InterfaceAccessDataBase;

import java.io.*;
import java.sql.SQLException;

public class FileManagement {
    private static final File configurationDataBase = new File("src/projectacme/config/ConnectionDatabaseInformation.txt");
    private static final InterfaceAccessDataBase accessDatabaseView = new InterfaceAccessDataBase();
    private static final IntefarceLogin loginView = new IntefarceLogin();
    private static final LoginController loginController = new LoginController(loginView);

    public static void SetConnectionDatabase(String url, String user , String password) throws SQLException {
        ConnectionData.setUrl(url);
        ConnectionData.setUser(user);
        ConnectionData.setPassword(password);
        if (ConnectionData.getConnectionDatabase() != null){
            try {
                configurationDataBase.createNewFile();
                try (FileWriter fileWriter = new FileWriter(configurationDataBase)) {
                    fileWriter.write("url: " + url + "\n");
                    fileWriter.write("user: " + user + "\n");
                    fileWriter.write("password: " + password + "\n");
                }
                System.out.println("A");
                ConnectionData.setUrl(url);
                ConnectionData.setUser(user);
                ConnectionData.setPassword(password);
                System.out.println("B");
                loginView.setVisible(true);
                accessDatabaseView.dispose();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Connection Database Failure");
        }
    }

    public static void ReadConnectionDatabaseInformation() {
        if (configurationDataBase.exists()) {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(configurationDataBase))) {
                String line;
                String url = "";
                String user = "";
                String password = "";
                while ((line = bufferedReader.readLine()) != null) {
                    String substring = line.substring(line.indexOf(":") + 1).trim();
                    if (line.startsWith("url:")) {
                        url = substring;
                    } else if (line.startsWith("user:")) {
                        user = substring;
                    } else if (line.startsWith("password:")) {
                        password = substring;
                    }
                }
                System.out.println("C");
                ConnectionData.setUrl(url);
                ConnectionData.setUser(user);
                ConnectionData.setPassword(password);
                System.out.println("D");
                loginView.setVisible(true);
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("File not found");
            AccessDatabaseController accessDatabaseController = new AccessDatabaseController(accessDatabaseView);
            accessDatabaseView.setVisible(true);
        }
    }
}
