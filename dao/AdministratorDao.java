package main.java.com.it.app.dao;

import main.java.com.it.app.domain.Administrator;

import java.util.Optional;

public interface AdministratorDao extends EmployeeDao<Administrator> {
	
	Optional<Administrator> getByPosition(String position);
}
