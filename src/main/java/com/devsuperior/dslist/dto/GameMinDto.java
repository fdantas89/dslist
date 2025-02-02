package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.GameMinProjection;
import com.devsuperior.dslist.entities.Game;

//Classe para customizar as informaçoes que serao enviadas para o frontend

public class GameMinDto {
	
	
	private Long id;
	private String title; 
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	
	public GameMinDto() {    //Construtor da classe com argumentos
		
	}

	public GameMinDto(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
		
	}
	
	public GameMinDto(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
		
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
