package projectacme.repository.dao;

import projectacme.model.AccessSubject;
import projectacme.util.Enum.StateEnum;
import projectacme.util.Enum.AccessSubjectRoleEnum;

import java.util.List;

public interface AccessSubjectDao {
    void addAccessSubject(AccessSubject accessSubject);
    AccessSubject getAccessSubjectById(String id);
    List<AccessSubject> getAccessSubjects();
    void updateAccessSubject(AccessSubject accessSubject, String name, String phone, String emailAddress, AccessSubjectRoleEnum role, StateEnum state, String password);
}
