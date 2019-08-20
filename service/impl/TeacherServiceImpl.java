package main.java.com.it.app.service.impl;

import main.java.com.it.app.dao.TeacherDao;
import main.java.com.it.app.dao.impl.TeacherDaoImpl;
import main.java.com.it.app.domain.Teacher;
import main.java.com.it.app.service.TeacherService;

import java.util.Optional;
import java.util.Set;

public class TeacherServiceImpl implements TeacherService {

	private static TeacherService instance;

	private TeacherDao teacherDao = TeacherDaoImpl.getInstance();

	private TeacherServiceImpl() {

	}

	public static TeacherService getInstance() {
		if (instance == null) {
			instance = new TeacherServiceImpl();
		}
		return instance;
	}

	@Override
	public Optional<Teacher> getBySubject(Integer subject) {
		return teacherDao.getBySubject(subject);
	}

	@Override
	public boolean fire(Teacher teacher) {
		teacherDao.delete(teacher);
		return true;
	}

	@Override
	public boolean hire(Teacher teacher) {
		teacherDao.save(teacher);
		return true;
	}

	@Override
	public boolean promote(Teacher teacher) {
		teacherDao.update(teacher);
		return true;
	}

	@Override
	public Optional<Teacher> save(Teacher teacher) {
		return teacherDao.save(teacher);
	}

	@Override
	public Optional<Teacher> update(Teacher teacher) {
		return teacherDao.update(teacher);
	}

	@Override
	public Set<Teacher> getAll() {
		return teacherDao.getAll();
	}

	@Override
	public Optional<Teacher> getById(Long id) {
		return teacherDao.getById(id);
	}

	@Override
	public void delete(Teacher teacher) {
		teacherDao.delete(teacher);
	}

	@Override
	public void deleteAll() {
		teacherDao.deleteAll();
	}

	@Override
	public void deleteById(Long id) {
		teacherDao.deleteById(id);
	}
}
