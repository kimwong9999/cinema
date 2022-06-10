package com.qa.cinema.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@CrossOrigin
public class Movie 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private String article;
	private int release;
	private int duration;
	private String chroma;
	private String ratio;
	
	@ManyToMany
	@JoinTable
		(name="movie_actors"
		,joinColumns=@JoinColumn(name="movie_id", referencedColumnName="id")
		,inverseJoinColumns=@JoinColumn(name="actor_id", referencedColumnName="id")
		)
    private List<Actor> cast;
}
