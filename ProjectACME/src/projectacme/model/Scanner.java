package projectacme.model;

import projectacme.model.Enum.ScannerType;

public class Scanner {
    private int id; // * Autoincrement
    private ScannerType type;

    public Scanner(int id, ScannerType type) {
        this.id = id;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ScannerType getType() {
        return type;
    }

    public void setType(ScannerType type) {
        this.type = type;
    }
}
