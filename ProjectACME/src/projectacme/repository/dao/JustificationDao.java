package projectacme.repository.dao;

import projectacme.model.Justification;

import java.sql.Timestamp;
import java.util.List;

public interface JustificationDao {
    void addJustification(Justification justification);
    Justification getJustificationLogById(int id);
    List<Justification> getAllJustifications();
    void updateJustification(Justification justification, Timestamp datetime, String reason);
}
