package main.java.com.it.app.dao;

import main.java.com.it.app.domain.Pupil;

import java.util.Collection;

public interface PupilDao extends GenericDao<Pupil> {
	@Override
	Collection<Pupil> getAll();

}
