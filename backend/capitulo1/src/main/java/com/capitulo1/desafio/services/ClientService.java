package com.capitulo1.desafio.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.capitulo1.desafio.dto.ClientDTO;
import com.capitulo1.desafio.entities.Client;
import com.capitulo1.desafio.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	
	@Transactional(readOnly = true)
	public List<ClientDTO> findAll() {
		List<Client> list = clientRepository.findAll();		
		return list.stream().map(x -> new ClientDTO(x)).collect(Collectors.toList());
	
	}

	public Optional<Client> findById(Long id) {
		
		return clientRepository.findById(id);
	}

}
