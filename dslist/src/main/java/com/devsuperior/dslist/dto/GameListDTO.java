package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;
	
	public GameListDTO() {
	}
  
	/*public GameListDTO(Long id, String name) { usar a entities Gamelist  */
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
		/* BeanUtils.copyProperties(entity, this);  não foi usado esse BeanUtils porque são poucos campos, 
		 * então implementos só o metodo gets(), se tivesse usado, teria que criar os gets e sets */
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	
	
}
