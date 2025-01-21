package com.elton.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elton.devsuperior.dslist.dto.GameMinDTO;
import com.elton.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() { // lista tipo GameMinDTO 
	  var result = 	gameRepository.findAll();
	  return result.stream().map(x -> new GameMinDTO(x)).toList();
	  
	  
	}

}
