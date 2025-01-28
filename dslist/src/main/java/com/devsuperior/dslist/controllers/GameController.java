package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.services.GameService;

@RestController  /* Anotação para falar que a classe é um controlador. */
@RequestMapping( value = "/games")  /* Anotação para mapear o recurso. que chama na url. */
public class GameController {

	@Autowired()  /* Anotação usada para injetar uma instancia da classe GameService no Controller */
	private GameService gameService;
	
	@GetMapping /* Anotação para dizer que esse método é do tipo GET*/
	public List<GameMinDTO> findAll(){
		
		List <GameMinDTO> result = gameService.findAll();
		return result;
		
	}
}
