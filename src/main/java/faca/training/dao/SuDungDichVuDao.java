package faca.training.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import faca.training.bean.DichVu;
import faca.training.bean.Khach;
import faca.training.bean.SuDungDichVu;
import faca.training.bean.SuDungDichVuId;

@Repository
public class SuDungDichVuDao {

	@Autowired
	private EntityManager entity;
	
	public List<SuDungDichVu> findAll(){
		return entity.createQuery("FROM SuDungDichVu", SuDungDichVu.class).getResultList();
	}
	
	public void persist(SuDungDichVu DichVu) {
		Khach khach = entity.find(Khach.class, DichVu.getId().getMakh());
		DichVu dv = entity.find(DichVu.class, DichVu.getId().getMadv());
		DichVu.setMakh(khach);
		DichVu.setMadv(dv);
		entity.persist(DichVu);
	}
	
	public void delete(SuDungDichVu SuDungDichVu) {
		entity.remove(SuDungDichVu);
	}
	
	public SuDungDichVu findById(SuDungDichVuId id) {
		return entity.find(SuDungDichVu.class, id);
	}
}
