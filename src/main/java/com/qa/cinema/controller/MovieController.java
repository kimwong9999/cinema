package com.qa.cinema.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.cinema.domain.Movie;
import com.qa.cinema.input.MovieInput;
import com.qa.cinema.load.MovieLoad;
import com.qa.cinema.service.MovieService;

@RestController
@RequestMapping("/cinema/movie")
@CrossOrigin
public class MovieController 
{
	private MovieService service;
	
	public MovieController(MovieService service)
	{
		this.service = service;
	}
	
	// get all rows
	@GetMapping("/list")
	public ResponseEntity<List<Movie>> list()
	{
		return new ResponseEntity<List<Movie>>(this.service.list(), HttpStatus.OK);
	}
	
	// get actor details using the actor's id
	@GetMapping("/view/{id}")
	public ResponseEntity<Optional<Movie>> view(@PathVariable int id)
	{
		return new ResponseEntity<Optional<Movie>>(this.service.view(id), HttpStatus.ACCEPTED);
	}
	
	// add a Movie
	@PostMapping("/add")
	public ResponseEntity<Movie> add(@RequestBody MovieInput mv)
	{
		MovieLoad movie = new MovieLoad(mv.getId(), mv.getTitle(), mv.getArticle(), mv.getRelease(), mv.getDuration(), mv.getChroma(), mv.getRatio(), mv.getCast());
		return new ResponseEntity<Movie>(this.service.add(movie), HttpStatus.CREATED);
	}

	// add cast for a particular movie
	@PostMapping("/update")
	public ResponseEntity<Movie> cast(@RequestBody MovieInput mv)
	{
		MovieLoad movie = new MovieLoad(mv.getId(), mv.getTitle(), mv.getArticle(), mv.getRelease(), mv.getDuration(), mv.getChroma(), mv.getRatio(), mv.getCast());
		return new ResponseEntity<Movie>(this.service.add(movie), HttpStatus.CREATED);
	}
	
	// update
	@GetMapping("/update/{id}")
	public ResponseEntity<Movie> update(@PathVariable int id, @RequestBody Movie movie) throws Exception
	{
			return new ResponseEntity<Movie>(this.service.update(id, movie), HttpStatus.ACCEPTED);
	}
/*	
	// update a Movie
	@PostMapping("/update")
	public ResponseEntity<Movie> update(@RequestBody Movie movie)
	{
		return new ResponseEntity<Movie>(this.service.add(movie), HttpStatus.CREATED);
	}
*/	
	// delete Movie
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		return new ResponseEntity<String>(this.service.delete(id), HttpStatus.ACCEPTED);
	}
	
	// add a list of Movies
	@PostMapping("/addmany")
	public ResponseEntity<List<Movie>> addmany(@RequestBody List<Movie> movie)
	{
		return new ResponseEntity<List<Movie>>(this.service.addMany(movie), HttpStatus.CREATED);
	}
}
