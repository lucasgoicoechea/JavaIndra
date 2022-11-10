package com.example.demo;

import java.util.Optional;

public interface LegajoService {

	<S extends Legajo> S save(S entity);

	<S extends Legajo> Iterable<S> saveAll(Iterable<S> entities);

	Optional<Legajo> findById(Integer id);

	boolean existsById(Integer id);

	Iterable<Legajo> findAll();

	Iterable<Legajo> findAllById(Iterable<Integer> ids);

	long count();

	void deleteById(Integer id);

	void delete(Legajo entity);

	void deleteAllById(Iterable<? extends Integer> ids);

	void deleteAll(Iterable<? extends Legajo> entities);

	void deleteAll();

}

