package com.gjm.gjmproj.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gjm.gjmproj.domain.Categoria;
import com.gjm.gjmproj.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;

	public Categoria buscar(Integer id) {
		// Categoria obj = repo.findOne(id);
		// return obj;

		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
}
