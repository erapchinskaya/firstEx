package main.java.com.it.app.service;


import main.java.com.it.app.domain.Administrator;

import java.util.Optional;

public interface AdministratorService extends EmployeeService<Administrator> {

    Optional<Administrator> getByPosition(String position);
}
