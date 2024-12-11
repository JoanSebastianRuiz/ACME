package projectacme.repository.implementation;

import projectacme.model.Enum.ScannerType;
import projectacme.model.Scanner;
import projectacme.repository.dao.ScannerDao;

import java.util.List;

public class ScannerImpl implements ScannerDao {
    @Override
    public void addScanner(Scanner scanner) {

    }

    @Override
    public Scanner getScannerById(int id) {
        return null;
    }

    @Override
    public List<Scanner> getScanners() {
        return List.of();
    }

    @Override
    public void updateScanner(Scanner scanner, ScannerType type) {

    }
}
