package faca.training.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import faca.training.bean.May;
import faca.training.dao.MayDao;

@Service
@Transactional
public class MayServices {
	@Autowired
	private MayDao repository;

	public List<May> findAll() {
		return repository.findAll();
	}

	public void persitst(May May) {
		repository.persist(May);
	}

	public void delete(String id) {

		May May = findById(id);
		repository.delete(May);
	}

	public May findById(String id) {
		return repository.findById(id);
	}
}