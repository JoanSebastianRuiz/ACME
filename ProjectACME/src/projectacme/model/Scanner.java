package projectacme.model;

import projectacme.repository.implementation.AccessLogImpl;
import projectacme.service.RegisterAccessService;
import projectacme.util.Enum.AccessType;
import projectacme.util.Enum.ScannerType;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Optional;

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
    public void registerAccess(ScannerType type, String id) {
        AccessLogImpl accessLogImpl = new AccessLogImpl();
        AccessLog lastAccessLog = accessLogImpl.getAllAccessLog().stream().filter(accessLog -> accessLog.getIdAccessSubject().equals(id)).findFirst().orElse(null);
        if (type == ScannerType.entry){
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.entry.toString())){
            accessLogImpl.addAccessLog(new AccessLog(AccessType.entry, Timestamp.from(Instant.now()), id, this.id, null));
            System.out.println("Entry Logged");
            } else {
                System.out.println("The Individual Is Already Inside");
            }
        } else if (type == ScannerType.exit) {
            if (lastAccessLog == null || !lastAccessLog.getType().toString().equals(ScannerType.exit.toString())){
            accessLogImpl.addAccessLog(new AccessLog(AccessType.exit, Timestamp.from(Instant.now()), id, this.id, null));
            System.out.println("Exit Logged");
            } else {
                System.out.println("The Individual Is Already Outside");
            }
        } else {
            System.out.println("Access Type Invalid");
        }
    }
}
