package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity /*Configura a classe java p/ que seja equivalente a uma tabela do banco relacional */
@Table(name = "tb_game_list") /* Custominar o nome da tabela no banco */
public class GameList {

	@Id /* Define o Id da minha tabela*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* Indica que o meu Id é um campo auto incremento. */
	private Long id;
	private String name;
	
	public GameList() {
	}

	public GameList(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameList other = (GameList) obj;
		return Objects.equals(id, other.id);
	}
}
