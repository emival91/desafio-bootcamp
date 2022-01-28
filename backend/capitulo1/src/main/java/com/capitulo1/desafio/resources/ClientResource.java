package com.capitulo1.desafio.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capitulo1.desafio.dto.ClientDTO;
import com.capitulo1.desafio.entities.Client;
import com.capitulo1.desafio.services.ClientService;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@Autowired
	public ClientService clientService;
	
	@GetMapping
	public ResponseEntity<List<ClientDTO>> findAll() {
		List<ClientDTO> list = clientService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Optional<Client>> findById(@PathVariable Long id) {
		Optional<Client> client = clientService.findById(id);
		return ResponseEntity.ok().body(client);
	}

}
