package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import faca.training.bean.DichVu;
@Repository
public class DichVuDao {

	@Autowired
	private EntityManager entity;
	
	public List<DichVu> findAll(){
		return entity.createQuery("FROM DichVu", DichVu.class).getResultList();
	}
	
	public void persist(DichVu DichVu) {
		entity.persist(DichVu);
	}
	
	public void delete(DichVu DichVu) {
		entity.remove(DichVu);
	}
	
	public DichVu findById(String id) {
		return entity.find(DichVu.class, id);
	}
}
