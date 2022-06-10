package com.qa.cinema.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.cinema.domain.Actor;
import com.qa.cinema.domain.Movie;
import com.qa.cinema.load.MovieLoad;
import com.qa.cinema.repository.ActorRepository;
import com.qa.cinema.repository.MovieRepository;

@Service
public class MovieService 
{
	private MovieRepository service;
	private ActorRepository actorservice;
	
	public MovieService(MovieRepository service, ActorRepository actorservice)
	{
		this.service = service;
		this.actorservice = actorservice;
	}
	
	public Movie add(MovieLoad ml)
	{
		List<Actor> data = actorservice.findAll();
		HashMap<Integer, Actor> actors = new HashMap<>();
		for (Actor d:data)
		{
			actors.put(d.getId(), d);
		}
		
		Movie mv = new Movie();
		mv.setId(ml.getId());
		mv.setTitle(ml.getTitle());
		mv.setArticle(ml.getArticle());
		mv.setRelease(ml.getRelease());
		mv.setDuration(ml.getDuration());
		mv.setChroma(ml.getChroma());
		mv.setRatio(ml.getRatio());
		
		Movie movie = this.service.saveAndFlush(mv);

		List<Actor> cast = new ArrayList<>();
		
		for (int i = 0; i < ml.getCast().length;i++)
		{
			int actorId = ml.getCast()[i];
			Actor actor = actors.get(actorId);
			cast.add(actor);
		}
		
		movie.setCast(cast);
		
		return this.service.saveAndFlush(movie);
	}
	
	public List<Movie> list()
	{
		return this.service.findAll();
	}
	
	public Optional<Movie> view(int id)
	{
		return this.service.findById(id);
	}
	
	public Movie updatee(Movie movie)
	{
		return this.service.saveAndFlush(movie);
	}
	
	// update
	public Movie update(int id, Movie movie) throws Exception
	{
		Movie exists = this.service.findById(id).orElseThrow(Exception::new);
		exists.setId(movie.getId());
		exists.setTitle(movie.getTitle());
		exists.setArticle(movie.getArticle());
		exists.setRelease(movie.getRelease());
		exists.setDuration(movie.getDuration());
		exists.setChroma(movie.getChroma());
		exists.setRatio(movie.getRatio());
		exists.setCast(movie.getCast());
		
		
		return this.service.saveAndFlush(exists);
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
			message = "1: Deletion failed, no Movie with id: " + id;
		}
		
		return message;
	}
	
	public List<Movie> addMany(List<Movie> movie)
	{
		return this.service.saveAllAndFlush(movie);
	}
}
