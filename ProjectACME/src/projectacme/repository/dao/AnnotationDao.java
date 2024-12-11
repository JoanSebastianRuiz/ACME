package projectacme.repository.dao;

import projectacme.model.Annotation;
import projectacme.util.Enum.StateEnum;

import java.sql.Date;
import java.util.List;

public interface AnnotationDao {
    void addAnnotation(Annotation annotation);
    Annotation getAnnotationLogById(int id);
    List<Annotation> getAllAnnotation();
    void updateAnnotation(Annotation annotation, Date datetime, String reason, Boolean suspended, StateEnum state);
}
