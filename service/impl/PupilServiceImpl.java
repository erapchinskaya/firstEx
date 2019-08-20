package main.java.com.it.app.service.impl;

import main.java.com.it.app.dao.PupilDao;
import main.java.com.it.app.dao.impl.PupilDaoImpl;
import main.java.com.it.app.domain.Pupil;
import main.java.com.it.app.service.PupilService;

import java.util.Collection;
import java.util.Optional;

public class PupilServiceImpl implements PupilService {
	private static PupilService instance;

	private PupilDao pupilDao = PupilDaoImpl.getInstance();

	private PupilServiceImpl() {

	}

	public static PupilService getInstance() {
		if (instance == null) {
			instance = new PupilServiceImpl();
		}
		return instance;
	}
	 @Override
	    public Optional<Pupil> save(Pupil pupil) {
	        return pupilDao.save(pupil);
	    }

	    @Override
	    public Optional<Pupil> update(Pupil pupil) {
	        return pupilDao.update(pupil);
	    }

	    @Override
	    public Collection<Pupil> getAll() {
	        return pupilDao.getAll();
	    }

	    @Override
	    public Optional<Pupil> getById(Long id) {
	        return pupilDao.getById(id);
	    }

	    @Override
	    public void delete(Pupil pupil) {
	    	pupilDao.delete(pupil);
	    }

	    @Override
	    public void deleteAll() {
	    	pupilDao.deleteAll();
	    }

	    @Override
	    public void deleteById(Long id) {
	    	pupilDao.deleteById(id);
	    }

}
