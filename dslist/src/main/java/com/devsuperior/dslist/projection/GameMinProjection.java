package com.devsuperior.dslist.projection;

public interface GameMinProjection {

	/*Métodos get correspondentes aos campos da consulta */
	Long getId();
	String getTitle();
	Integer getYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}
