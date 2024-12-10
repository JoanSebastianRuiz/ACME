package projectacme.repository.dao;

import projectacme.model.Justification;

import java.sql.Date;
import java.util.List;

public interface JustificationDao {
    void addJustification(Justification justification);
    Justification getJustificationLogById(int id);
    List<Justification> getAllJustifications();
    void updateJustification(Justification justification, Date datetime, String reason, String idUser, String idAnnotation);
    void deleteJustification(Justification justification);
    void deleteAllCJustifications();
    void truncateJustification();
}
