package main.java.com.it.app.service.impl;

import main.java.com.it.app.dao.CleaningLadyDao;
import main.java.com.it.app.dao.impl.CleaningLadyDaoImpl;
import main.java.com.it.app.domain.CleaningLady;
import main.java.com.it.app.service.CleaningLadyService;

import java.util.Optional;
import java.util.Set;


public class CleaningLadyServiceImpl implements CleaningLadyService{
	private static CleaningLadyService instance;

    private CleaningLadyDao cleaningLadyDao = CleaningLadyDaoImpl.getInstance();

    private CleaningLadyServiceImpl() {

    }

    public static CleaningLadyService getInstance() {
        if (instance == null) {
            instance = new CleaningLadyServiceImpl();
        }
        return instance;
    }

    @Override
    public Optional<CleaningLady> getByRetiree(boolean retiree) {
        return cleaningLadyDao.getByRetiree(retiree);
    }

    @Override
    public boolean fire(CleaningLady cleaningLady) {
    	cleaningLadyDao.delete(cleaningLady);
        return true;
    }

    @Override
    public boolean hire(CleaningLady cleaningLady) {
    	cleaningLadyDao.save(cleaningLady);
        return true;
    }

    @Override
    public boolean promote(CleaningLady cleaningLady) {
    	cleaningLadyDao.update(cleaningLady);
        return true;
    }

    @Override
    public Optional<CleaningLady> save(CleaningLady cleaningLady) {
        return cleaningLadyDao.save(cleaningLady);
    }

    @Override
    public Optional<CleaningLady> update(CleaningLady cleaningLady) {
        return cleaningLadyDao.update(cleaningLady);
    }

    @Override
    public Set<CleaningLady> getAll() {
        return cleaningLadyDao.getAll();
    }

    @Override
    public Optional<CleaningLady> getById(Long id) {
        return cleaningLadyDao.getById(id);
    }

    @Override
    public void delete(CleaningLady cleaningLady) {
    	cleaningLadyDao.delete(cleaningLady);
    }

    @Override
    public void deleteAll() {
    	cleaningLadyDao.deleteAll();
    }

    @Override
    public void deleteById(Long id) {
    	cleaningLadyDao.deleteById(id);
    }
}

