package com.elton.devsuperior.dslist.projections;

public interface GameMinProjection {

	// métodos gets correspondente a consulta em GameRepository
	
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();
}

