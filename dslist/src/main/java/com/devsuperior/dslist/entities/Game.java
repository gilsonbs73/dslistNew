package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity /*Configura a classe java p/ que seja equivalente a uma tabela do banco relacional */
@Table /* Custominar o nome da tabela no banco */
public class Game {

	@Id /* Define o Id da minha tabela*/
	@GeneratedValue(strategy = GenerationType.IDENTITY) /* Indica que o meu Id é um campo auto incremento. */
	private Long id;
	private String title;
	
	@Column(name = "game_year")  /* custominar o nome da coluna na tabela do banco, já que o nome year é uma palavra do sql.*/
	private Integer year;
	private String genre;
	private String platform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public Game() {
	}  /* Construtor sem argumento */

	public Game(Long id, String title, Integer year, String genre, String platform, String imgUrl,
			String shortDescription, String longDescription) {
		/*super(); Pode apagar esse */
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platform = platform;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription; /* esse tipo camelcase no banco vai ficar com short_Description*/
		this.longDescription = longDescription; /* esse tipo camelcase no banco vai ficar com long_Description*/
	} /* Construtor com argumentos. */

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatform() {
		return platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
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
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
}
