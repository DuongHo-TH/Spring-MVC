package faca.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.Khach;
import faca.training.dao.KhachDao;

@Service
@Transactional
public class KhachServices {
	@Autowired
	private KhachDao repository;

	public List<Khach> findAll() {
		return repository.findAll();
	}

	public void persitst(Khach Khach) {
		repository.persist(Khach);
	}

	public void delete(String id) {

		Khach Khach = findById(id);
		repository.delete(Khach);
	}

	public Khach findById(String id) {
		return repository.findById(id);
	}
}
