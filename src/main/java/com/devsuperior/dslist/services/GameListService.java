package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

//Registro do componente para que seja gerenciado pelo framework 
@Service
public class GameListService {
	
	//metodo da classe
	@Autowired
	private GameListRepository gameListRepository;

	
	@Transactional(readOnly = true) //não bloqueia o banco de dados para escrita, deixando a consulta mais rapida
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll(); //Busca todos os games no banco de dados findAll ja executa a query e retorna os dados
		return  result.stream().map(x -> new GameListDTO(x)).toList();
		
	}

}
