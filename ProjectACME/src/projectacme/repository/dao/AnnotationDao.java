package projectacme.repository.dao;

import projectacme.model.Annotation;
import projectacme.model.Enum.StateEnum;

import java.sql.Date;
import java.util.List;

public interface AnnotationDao {
    void addAnnotation(Annotation annotation);
    Annotation getAnnotationLogById(int id);
    List<Annotation> getAllAnnotation();
    void updateAnnotation(Annotation annotation, Date datetime, String reason, Boolean suspended, StateEnum state, String idIndividual, String idUser);
    void deleteAnnotation(Annotation annotation);
    void deleteAllAnnotations();
    void truncateAnnotation();
}
