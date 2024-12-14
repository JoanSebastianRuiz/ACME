package projectacme.service;

import projectacme.util.Enum.ScannerType;

public interface RegisterAccessService {
    public boolean registerAccess(ScannerType type, String id);
}
