package projectacme.repository.dao;

import projectacme.model.AccessSubject;
import projectacme.model.Enum.StateEnum;
import projectacme.model.Enum.UserRoleEnum;

import java.util.List;

public interface AccessSubjectDao {
    void addAccessSubject(AccessSubject accessSubject);
    AccessSubject getAccessSubjectById(String id);
    List<AccessSubject> getAccessSubjects();
    void updateAccessSubject(AccessSubject accessSubject, String name, String phone, String emailAddress, UserRoleEnum role, StateEnum state, String password);
}
