package faca.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.SuDungDichVu;
import faca.training.bean.SuDungDichVuId;
import faca.training.dao.SuDungDichVuDao;

@Service
@Transactional
public class SuDungDichVuServices {

	@Autowired
	private SuDungDichVuDao repository;

	public List<SuDungDichVu> findAll() {
		return repository.findAll();
	}

	public void persitst(SuDungDichVu SuDungDichVu) {
		repository.persist(SuDungDichVu);
	}

	public void delete(SuDungDichVuId id) {

		SuDungDichVu SuDungDichVu = findById(id);
		repository.delete(SuDungDichVu);
	}

	public SuDungDichVu findById(SuDungDichVuId id) {
		return repository.findById(id);
	}
}
