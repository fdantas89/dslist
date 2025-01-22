package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

//Registro do componente para que seja gerenciado pelo framework 
@Service
public class GameService {
	
	//metodo da classe
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true) //não bloqueia o banco de dados para escrita, deixando a consulta mais rapida
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true) //não bloqueia o banco de dados para escrita, deixando a consulta mais rapida
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll(); //Busca todos os games no banco de dados findAll ja executa a query e retorna os dados
		List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
		return dto;
	}

}
