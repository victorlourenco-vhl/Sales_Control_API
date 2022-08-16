package com.tgid.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tgid.spring.domain.Categoria;
import com.tgid.spring.repositories.CategoriaRepository;
import com.tgid.spring.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id 
					+ ", Tip: " + Categoria.class.getName());
		}
		return obj.orElse(null);
	}
	
}
