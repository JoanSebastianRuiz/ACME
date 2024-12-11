package projectacme.repository.dao;

import projectacme.model.Enum.ScannerType;
import projectacme.model.Scanner;

import java.util.List;

public interface ScannerDao {
    void addScanner(Scanner scanner);
    Scanner getScannerById(int id);
    List<Scanner> getScanners();
    void updateScanner(Scanner scanner, ScannerType type);
}
