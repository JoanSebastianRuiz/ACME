package projectacme.service;

import java.util.List;
import java.util.Map;

public interface ReportService {
    List<Map<String,Object>> getReportsWorkers();
    List<Map<String,Object>> getReportsGuest();
    List<Map<String,Object>> getReportsIndividuals();
}
