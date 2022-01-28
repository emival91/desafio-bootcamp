package com.capitulo1.desafio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capitulo1.desafio.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
}
