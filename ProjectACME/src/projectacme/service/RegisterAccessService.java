package projectacme.service;

import projectacme.util.Enum.ScannerType;

public interface RegisterAccessService {
    public void registerAccess(ScannerType type, String id);
}
