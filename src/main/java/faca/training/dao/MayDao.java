package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import faca.training.bean.May;

@Repository
public class MayDao {

	@Autowired
	private EntityManager entity;

	public List<May> findAll() {
		return entity.createQuery("FROM May", May.class).getResultList();
	}

	public void persist(May May) {
		entity.persist(May);
	}

	public void delete(May May) {
		entity.remove(May);
	}

	public May findById(String id) {
		return entity.find(May.class, id);
	}
}
