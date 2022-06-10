package com.qa.cinema.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.cinema.domain.Actor;
import com.qa.cinema.domain.Movie;
import com.qa.cinema.repository.ActorRepository;
import com.qa.cinema.repository.MovieRepository;

@Service
public class ActorService 
{
	ActorRepository service;
	MovieRepository movieservice;
	
	public ActorService(ActorRepository service, MovieRepository movieservice)
	{
		this.service = service;
		this.movieservice = movieservice;
	}
	
	public Actor add(Actor actor)
	{
		return this.service.saveAndFlush(actor);
	}
	
	public List<Actor> list()
	{
		return this.service.findAll();
	}
	
	public List<Actor> names()
	{
		return this.service.names();
	}
	
	public Optional<Actor> view(int id)
	{
		return this.service.findById(id);
	}
	
	public Actor update(Actor actor)
	{
		return this.service.saveAndFlush(actor);
	}
	
	public String delete(int id)
	{
		String message = "";
		
		if (this.service.existsById(id))
		{
			this.service.deleteById(id);
			message = "0: has been successfully deleted from the database";
		}
		else
		{
			message = "1: Deletion failed, no actor with id: " + id;
		}
		
		return message;
	}
	
	public List<Actor> addMany(List<Actor> actor)
	{
		return this.service.saveAllAndFlush(actor);
	}
	
	public ArrayList<String> movies(int id)
	{
		ArrayList<String> movies = new ArrayList<>();
	
		List<Movie> mv = this.movieservice.movies(id);
		
		String title = "";
		for (Movie m:mv)
		{
			if(m.getArticle() == "")
			{
				title = m.getTitle();
			}
			else
			{
				title = m.getTitle() + ", " + m.getArticle();
			}
			
			movies.add(title);
		}
		
		return movies;
	}
}
