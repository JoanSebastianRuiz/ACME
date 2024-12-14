package projectacme.util;

import java.io.*;

public class FileManagement {
    public static void SetConnectionDatabase() {
        File file = new File("ConnectionDatabaseInformation.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
                String url = "localhost:3306";
                String user = "root";
                String password = "WandaSQL";
                try (FileWriter fileWriter = new FileWriter(file)) {
                    fileWriter.write("url: " + url + "\n");
                    fileWriter.write("user: " + user + "\n");
                    fileWriter.write("password: " + password + "\n");
                }
                System.out.println("A");
                ConnectionData.setUrl(url);
                ConnectionData.setUser(user);
                ConnectionData.setPassword(password);
                System.out.println("B");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
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
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }

        }
    }
}
