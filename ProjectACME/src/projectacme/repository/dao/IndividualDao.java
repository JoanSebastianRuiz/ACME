package projectacme.repository.dao;

import projectacme.model.Enum.IndividualRoleEnum;
import projectacme.model.Enum.StateEnum;
import projectacme.model.Individual;

import java.util.List;

public interface IndividualDao {
    void addIndividual(Individual individual);
    Individual getIndividualLogById(int id);
    List<Individual> getAllIndividuals();
    void updateIndividual(Individual individual, String id, String name, IndividualRoleEnum role, StateEnum state, String phone, String emailAddress, int idCompany);
    void deleteIndividual(Individual individual);
    void deleteAllCIndividuals();
    void truncateIndividual();
}
