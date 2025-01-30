package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projection.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
	}

	/*public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {*/
	public GameMinDTO(Game entities) {  /* Instancia Construtor GameMinDto usando a classe entidade copiando os dados do Game para o DTO.*/
		/*super(); Não faço uso de super(), posso apagar. */
		this.id = entities.getId();  /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. id; */
		title = entities.getTitle(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. title; */
		this.year = entities.getYear(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. year; */
		imgUrl = entities.getImgUrl(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. imgUrl; */
		shortDescription = entities.getShortDescription(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. getShortDescription; */
		/*Pode apagar o this. porque não tem ambiguidade. Apagar de uns pra exemplificar.  */
	}
	
	/*public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {*/
	public GameMinDTO(GameMinProjection projection) {  /* Instancia Construtor GameMinDto usando a classe entidade copiando os dados do Game para o DTO.*/
		this.id = projection.getId();  /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. id; */
		this.title = projection.getTitle(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. title; */
		this.year = projection.getYear(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. year; */
		imgUrl = projection.getImgUrl(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. imgUrl; */
		shortDescription = projection.getShortDescription(); /* Se não tivesse pegando os dados da entidade, usaria normal os paramentos passado no argumentos. getShortDescription; */
		/*Pode apagar o this. porque não tem ambiguidade. Apagar de uns pra exemplificar.  */
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	/* Na classe DTO não precisa criar os sets, apenas os gets porque é uma classe de busca. */
}
