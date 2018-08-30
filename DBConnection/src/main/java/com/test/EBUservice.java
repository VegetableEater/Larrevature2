package com.test;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EBUservice {
	
	@Autowired
	public EBUservice() {
		super();
	}
	
	@Autowired
	EBUdao ebudao;
	
	@Transactional
	public EBUbean createEBUbean (EBUbean ebubean) {
		return ebudao.save(ebubean);
	}
	
	public List<EBUbean> retrieveAll(){
		List<EBUbean> ebubeans = new ArrayList<>();
		ebudao.findAll().forEach(ebubeans::add);
		return ebubeans;
	}
	
	@Transactional
	public void updateEBUbean (EBUbean ebubean) {
		ebudao.save(ebubean);
	}
	
	@Transactional
	public void deleteEBUbean (EBUbean ebubean) {
		ebudao.delete(ebubean);
	}
	
	@Transactional
	public void deleteEBUbeanById (int ebuID) {
		ebudao.deleteById(ebuID);
	}
	
	public EBUbean retrieveOne (int ebuID) {
		return ebudao.getOne(ebuID);
	}
}
