package com.tgid.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tgid.spring.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{
	 
	
	
}
