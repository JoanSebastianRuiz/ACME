package projectacme.model;

import projectacme.service.RegisterAccessService;
import projectacme.util.Enum.ScannerType;

public class Scanner implements RegisterAccessService {
    private int id; // * Autoincrement
    private ScannerType type;

    public Scanner(int id, ScannerType type) {
        this.id = id;
        this.type = type;
    }

    public Scanner(ScannerType type) {
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

    @Override
    public void registerAccess(ScannerType type) {
        if (type == ScannerType.entry){
            // TODO: Entry Logic
            System.out.println("Entry Logged");
        } else if (type == ScannerType.exit) {
            // TODO: Exit Logic
            System.out.println("Exit Logged");
        } else {
            System.out.println("Access Type Invalid");
        }
    }
}
