package projectacme.util.validators;


import projectacme.model.Annotation;
import projectacme.repository.implementation.AnnotationImpl;
import projectacme.repository.implementation.ReportManagerImpl;
import projectacme.util.Enum.StateEnum;

import java.util.stream.Collectors;

public class AnnotationValidator {
    private static final AnnotationImpl annotationImpl = new AnnotationImpl();
    private static final ReportManagerImpl reportManagerImpl = new ReportManagerImpl();

    public static boolean personHasAnnotations(String document){
        int countAnnotations = annotationImpl.getAllAnnotation().stream()
                .filter(annotation -> annotation.getIdAccessSubject().equals(document) && annotation.getSuspended() && annotation.getState()== StateEnum.active)
                .collect(Collectors.toList())
                .size();

        return countAnnotations>=1;
    }

    public static boolean annotationValidator(int id){
        Annotation annotation = annotationImpl.getAnnotationLogById(id);
        return annotation != null;
    }

    public static boolean annotationHasJustification(int id){
        int countJustification = reportManagerImpl.getInformationJustifications().stream()
                .filter(element->(Integer)element.get("Identifier")==id)
                .collect(Collectors.toList())
                .size();

        return countJustification>=1;
    }
}
