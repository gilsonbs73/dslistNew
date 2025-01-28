package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity /*Configura a classe java p/ que seja equivalente a uma tabela do banco relacional */
@Table(name = "tb_belonging") /* Custominar o nome da tabela no banco */
public class Belonging {

	@EmbeddedId /* indica que esse campo esta representado dois campos na tabela vindo da classe BelongingPK, 
	por isso foi usado @Embeddable na classe BelongingPK, ai usa o @EmbeddedId nessa classe. */
	private BelongingPK id = new BelongingPK();
	
	private Long position;
	
	public Belonging() {
	}

	/*public Belonging(BelongingPK id, Long position) {, muda porque o contrutor tem que fazer referência aos dois campos*/
	public Belonging(Game game, GameList list , Long position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Long getPosition() {
		return position;
	}

	public void setPosition(Long position) {
		this.position = position;
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
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
