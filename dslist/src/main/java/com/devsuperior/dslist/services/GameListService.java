package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;

/*Toda classe service comum que não esta herdando de nada, tem que registrar pela anotação. 
  @Service para que o framework faça o gerenciamento como componente do sistema.
*/
@Service  /* Registra a classe como se fosse um componente do sistema, porque não herda de nenhuma outro componente ou classe. */
public class GameListService {
	/* O que vai ter nessa classe GameService=Uma operação pra listar os dados*/
	
	@Autowired()  /* Anotação usada para injetar uma instancia da classe GameRepository na classe GameService */
	private GameListRepository gameListRepository;
	
	/* Esse método devolve uma lista do tipo GameListDTO */
	@Transactional(readOnly = true ) /* boa prática para somente leitura e fazer a busca mais rápida no banco. */
	public List<GameListDTO> findAll(){   /* findAll() é um nome que eu dou a função, pode ser qualquer nome. */
		
		List<GameList> result =  gameListRepository.findAll();  /* Todos os métodos que aparece vem da classe GameRepository que extende da GameRepository */
		/* Dessa forma os dados são retornado sem nenhuma linha de programação para fazer busca na tabela. muito legal. */
		List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		/*return result.stream().map(x -> new GameMinDTO(x)).toList(); pode ser assim também. */
		/* Pega o result de Game e converte para GameMinDTO que é uma lista menos campos, essa é a forma de conversão.*/
		return dto;
	}

}
