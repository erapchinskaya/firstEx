package main.java.com.it.app.service;

import main.java.com.it.app.domain.Teacher;

import java.util.Optional;

public interface TeacherService extends EmployeeService<Teacher> {

    Optional<Teacher> getBySubject(Integer subject);

}
