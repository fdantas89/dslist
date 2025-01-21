package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*Configurações do anotation */

@Entity
@Table(name = "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /*Incrementa o ID na gravação do banco de dados*/
	private Long id;
	private String title; 
	
	@Column(name = "game_year")/* Customiza o nome do campo no banco de dados */ 
	private Integer year;
	
	@Column(name = "genre")
	private String genere;
	
	private String platforms;
	private double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT") /*Ajuste o campo para texto mais que 255 caracteres*/
	private String shortDescription;
	
	@Column(columnDefinition = "TEXT") /*Ajuste o campo para texto mais que 255 caracteres*/
	private String longDescription; 
	
	public Game() {
	}

	public Game(Long id, String title, Integer year, String genere, String platforms, Double score,String imgUrl,
			String shortDescription, String lomgDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genere = genere;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		shortDescription = shortDescription;
		this.longDescription = lomgDescription;
	}

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

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	public String getPlatform() {
		return platforms;
	}

	public void setplatforms(String platforms) {
		this.platforms = platforms;
	}
	
	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
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
		shortDescription = shortDescription;
	}

	public String getLomgDescription() {
		return longDescription;
	}

	public void setLomgDescription(String lomgDescription) {
		this.longDescription = lomgDescription;
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
