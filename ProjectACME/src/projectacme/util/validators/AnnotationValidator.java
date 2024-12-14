package projectacme.util.validators;

import projectacme.repository.implementation.AnnotationImpl;
import projectacme.util.Enum.StateEnum;

import java.util.stream.Collectors;

public class AnnotationValidator {
    public static boolean personHasAnnotations(String document){
        AnnotationImpl annotationImpl = new AnnotationImpl();
        int countAnnotations = annotationImpl.getAllAnnotation().stream()
                .filter(annotation -> annotation.getIdAccessSubject().equals(document) && annotation.getSuspended() && annotation.getState()== StateEnum.active)
                .collect(Collectors.toList())
                .size();

        return countAnnotations>=1;
    }
}
