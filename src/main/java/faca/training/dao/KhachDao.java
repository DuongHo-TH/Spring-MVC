package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import faca.training.bean.Khach;

@Repository
public class KhachDao {

	@Autowired
	private EntityManager entity;
	
	public List<Khach> findAll(){
		return entity.createQuery("FROM Khach", Khach.class).getResultList();
	}
	
	public void persist(Khach khach) {
		entity.persist(khach);
	}
	
	public void delete(Khach khach) {
		entity.remove(khach);
	}
	
	public Khach findById(String id) {
		return entity.find(Khach.class, id);
	}
	
}
