package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;

//Registro do componente para que seja gerenciado pelo framework 
@Service
public class GameService {
	
	//metodo da classe
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll(); //Busca todos os games no banco de dados findAll ja executa a query e retorna os dados
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}

}
