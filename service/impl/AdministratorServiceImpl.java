package main.java.com.it.app.service.impl;

import main.java.com.it.app.dao.AdministratorDao;
import main.java.com.it.app.dao.impl.AdministratorDaoImpl;
import main.java.com.it.app.domain.Administrator;
import main.java.com.it.app.service.AdministratorService;

import java.util.Optional;
import java.util.Set;

public class AdministratorServiceImpl implements AdministratorService {

	private static AdministratorService instance;

	private AdministratorDao administratorDao = AdministratorDaoImpl.getInstance();

	private AdministratorServiceImpl() {

	}

	public static AdministratorService getInstance() {
		if (instance == null) {
			instance = new AdministratorServiceImpl();
		}
		return instance;
	}

	@Override
	public Optional<Administrator> getByPosition(String position) {
		return administratorDao.getByPosition(position);
	}

	@Override
	public boolean hire(Administrator administrator) {
		administratorDao.save(administrator);
		return true;
	}

	@Override
	public boolean promote(Administrator administrator) {
		administratorDao.update(administrator);
		return true;
	}

	@Override
	public Optional<Administrator> save(Administrator administrator) {
		return administratorDao.save(administrator);
	}

	@Override
	public Optional<Administrator> update(Administrator administrator) {
		return administratorDao.update(administrator);
	}

	@Override
	public Set<Administrator> getAll() {
		return administratorDao.getAll();
	}

	@Override
	public Optional<Administrator> getById(Long id) {
		return administratorDao.getById(id);
	}

	@Override
	public void delete(Administrator administrator) {
		administratorDao.delete(administrator);
	}

	@Override
	public void deleteAll() {
		administratorDao.deleteAll();
	}

	@Override
	public void deleteById(Long id) {
		administratorDao.deleteById(id);
	}

	@Override
	public boolean fire(Administrator employee) {
		return false;
	}
}
