package main.java.com.it.app.dao;

import main.java.com.it.app.domain.CleaningLady;

import java.util.Optional;

public interface CleaningLadyDao extends EmployeeDao< CleaningLady> {
    Optional<CleaningLady> getByRetiree(boolean retiree);

}

