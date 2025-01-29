package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.services.GameListService;

@RestController  /* Anotação para falar que a classe é um controlador. */
@RequestMapping( value = "/lists")  /* Anotação para mapear o recurso. que chama na url. */
public class GameListController {

	@Autowired()  /* Anotação usada para injetar uma instancia da classe GameService no Controller */
	private GameListService gameListService;
	
	@GetMapping /* Anotação para dizer que esse método é do tipo GET*/
	public List<GameListDTO> findAll(){
		List <GameListDTO> result = gameListService.findAll();
		return result;
	}
}
