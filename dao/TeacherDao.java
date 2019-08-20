package main.java.com.it.app.dao;


import main.java.com.it.app.domain.Teacher;

import java.util.Optional;

public interface TeacherDao extends EmployeeDao<Teacher> {
    Optional<Teacher> getBySubject(Integer subject);
}
