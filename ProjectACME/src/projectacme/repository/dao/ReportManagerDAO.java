package projectacme.repository.dao;

import java.util.List;
import java.util.Map;

public interface ReportManagerDAO {
    List<Map<String,Object>> getInformationAccessSubjects();
    List<Map<String,Object>> getInformationVehicles();
}
