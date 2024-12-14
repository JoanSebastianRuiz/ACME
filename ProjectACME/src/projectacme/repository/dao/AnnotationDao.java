package projectacme.repository.dao;

import projectacme.model.Annotation;
import projectacme.util.Enum.StateEnum;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

public interface AnnotationDao {
    void addAnnotation(Annotation annotation);
    Annotation getAnnotationLogById(int id);
    List<Annotation> getAllAnnotation();
    void updateAnnotation(Annotation annotation, Timestamp datetime, String reason, Boolean suspended, StateEnum state);
}
