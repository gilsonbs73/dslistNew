package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/* 1 tipo representando 2 campos. */
@Embeddable /* Encapsula + de 1 atribuitos em uma chave só, nesse campo os dois atributos criados abaixo. */
public class BelongingPK {

	@ManyToOne  /* Anotação para indicar que o meu relacionamento é 1 pra muitos. */
	@JoinColumn( name = "game_id")   /* Configurar o nome da minha chave estrangeira.*/
	private Game game;
	
	@ManyToOne  /* Anotação para indicar que o meu relacionamento é 1 pra muitos. */
	@JoinColumn( name = "list_id")   /* Configurar o nome da minha chave estrangeira.*/
	private GameList list;
	
	public BelongingPK() {
	}

	public BelongingPK(Game game, GameList list) {
		this.game = game;
		this.list = list;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getList() {
		return list;
	}

	public void setList(GameList list) {
		this.list = list;
	}

	@Override
	public int hashCode() {
		return Objects.hash(game, list);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(list, other.list);
	}
	
	
}
