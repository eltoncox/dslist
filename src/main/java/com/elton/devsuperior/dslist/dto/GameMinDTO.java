package com.elton.devsuperior.dslist.dto;

import com.elton.devsuperior.dslist.entities.Game;

public class GameMinDTO {
	
	private Long id;
	private String title;	
	private Integer year;	
	private String imgUrl;	
	private String shortDescription;
	
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game entitiy) {
		
		id = entitiy.getId();
		title = entitiy.getTitle();
		year = entitiy.getYear();
		imgUrl = entitiy.getImgUrl();
		shortDescription = entitiy.getShortDescription();
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
}
