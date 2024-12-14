package projectacme.repository.dao;

import java.util.List;
import java.util.Map;

public interface ReportManagerDAO {
    List<Map<String,Object>> getInformationAccessSubjects();
    List<Map<String,Object>> getInformationVehicles();
    List<Map<String,Object>> getInformationAnnotations();
    List<Map<String,Object>> getInformationJustifications();
    List<Map<String,Object>> getInformationCompanies();
    List<Map<String,Object>> getInformationAccessLogs();
}
