package com.example.demo;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl implements PersonaService {
	
	@Autowired
	PersonaRepositorio personaRepositorio;

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public <S extends Persona> S save(S entity) {
		return personaRepositorio.save(entity);
	}

	@Override
	public <S extends Persona> Iterable<S> saveAll(Iterable<S> entities) {
		return personaRepositorio.saveAll(entities);
	}

	@Override
	public Optional<Persona> findById(Integer id) {
		return personaRepositorio.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		return personaRepositorio.existsById(id);
	}

	@Override
	public Iterable<Persona> findAll() {
		return personaRepositorio.findAll();
	}

	@Override
	public Iterable<Persona> findAllById(Iterable<Integer> ids) {
		return personaRepositorio.findAllById(ids);
	}

	@Override
	public long count() {
		return personaRepositorio.count();
	}

	@Override
	public void deleteById(Integer id) {
		personaRepositorio.deleteById(id);
	}

	@Override
	public void delete(Persona entity) {
		personaRepositorio.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		personaRepositorio.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends Persona> entities) {
		personaRepositorio.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		personaRepositorio.deleteAll();
	}
	
	@Override
	public Iterable<Legajo> findAllLikeLegajos(String palabraBuscar)
	{
		String sql = "SELECT * FROM ejemplo.legajo 1 where 1.caratula LIKE :parametro";
		
		Query nativeQuery = em.createNativeQuery(sql, Legajo.class);
		nativeQuery.setParameter(0, palabraBuscar);
		return nativeQuery.getResultList();
	}
}
