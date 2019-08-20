package main.java.com.it.app.service;

import main.java.com.it.app.domain.CleaningLady;

import java.util.Optional;

public interface CleaningLadyService extends EmployeeService<CleaningLady> {
	Optional<CleaningLady> getByRetiree(boolean retiree);
}
