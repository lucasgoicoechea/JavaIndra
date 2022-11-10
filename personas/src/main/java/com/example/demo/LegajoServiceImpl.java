package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

public class LegajoServiceImpl implements LegajoService{
	
	
	@Autowired
	LegajoRepository legajoRepository; 

	@Override
	public <S extends Legajo> S save(S entity) {
		return legajoRepository.save(entity);
	}

	@Override
	public <S extends Legajo> Iterable<S> saveAll(Iterable<S> entities) {
		return legajoRepository.saveAll(entities);
	}

	@Override
	public Optional<Legajo> findById(Integer id) {
		return legajoRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return legajoRepository.existsById(id);
	}

	@Override
	public Iterable<Legajo> findAll() {
		return legajoRepository.findAll();
	}

	@Override
	public Iterable<Legajo> findAllById(Iterable<Integer> ids) {
		return legajoRepository.findAllById(ids);
	}

	@Override
	public long count() {
		return legajoRepository.count();
	}

	@Override
	public void deleteById(Integer id) {
		legajoRepository.deleteById(id);
		
	}

	@Override
	public void delete(Legajo entity) {
		legajoRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		legajoRepository.deleteAllById(ids);
		
	}

	@Override
	public void deleteAll(Iterable<? extends Legajo> entities) {
		legajoRepository.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		legajoRepository.deleteAll();
		
	}

}
