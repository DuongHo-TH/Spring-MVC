package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import faca.training.bean.Khach;
import faca.training.bean.May;
import faca.training.bean.SuDungMay;
import faca.training.bean.SuDungMayId;

@Repository
public class SuDungMayDao {

	@Autowired
	private EntityManager entity;
	
	public List<SuDungMay> findAll(){
		return entity.createQuery("FROM SuDungMay", SuDungMay.class).getResultList();
	}
	
	public void persist(SuDungMay SuDungMay) {
		Khach khach = entity.find(Khach.class, SuDungMay.getId().getMakh());
		May may = entity.find(May.class, SuDungMay.getId().getMamay());
		SuDungMay.setMakh(khach);
		SuDungMay.setMamay(may);
		entity.persist(SuDungMay);
	}
	
	public void delete(SuDungMay SuDungMay) {
		entity.remove(SuDungMay);
	}
	
	public SuDungMay findById(SuDungMayId id) {
		return entity.find(SuDungMay.class, id);
	}
}
