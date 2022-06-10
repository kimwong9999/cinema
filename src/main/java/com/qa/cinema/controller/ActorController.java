package com.qa.cinema.controller;

import java.util.ArrayList;
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

import com.qa.cinema.domain.Actor;
import com.qa.cinema.domain.Location;
import com.qa.cinema.service.ActorService;

@RestController
@RequestMapping("/cinema/actor")
@CrossOrigin
public class ActorController 
{
	private ActorService service;
	
	public ActorController(ActorService service)
	{
		this.service = service;
	}
	
	@GetMapping
	public String cinema()
	{
		return "cinema.html";
	}
	
	// add an actor
	@PostMapping("/add")
	public ResponseEntity<Actor> add(@RequestBody Actor actor)
	{
		if (actor.getBplace() == null & actor.getDplace() == null)
		{
			return new ResponseEntity<Actor>(this.service.add(actor), HttpStatus.CREATED);
		}
		else
		{
			Location bloc = null;
			Location dloc = null;
			if (actor.getBplace() != null)
			{
				bloc = actor.getBplace();
				actor.setBplace(null);
			}
			if (actor.getDplace() != null)
			{
				dloc = actor.getDplace();
				actor.setDplace(null);
			}
			
			Actor ac = this.service.add(actor);
			actor.setId(ac.getId());
			actor.setBplace(bloc);
			actor.setDplace(dloc);
			ac = this.service.add(actor);
			
			return new ResponseEntity<Actor>(ac, HttpStatus.CREATED);
		}
	}
	
	// get all rows
	@GetMapping("/list")
	public ResponseEntity<List<Actor>> list()
	{
		return new ResponseEntity<List<Actor>>(this.service.list(), HttpStatus.OK);
	}
	
	// get all rows sorted by surname
	@GetMapping("/names")
	public ResponseEntity<List<Actor>> names()
	{
		return new ResponseEntity<List<Actor>>(this.service.names(), HttpStatus.OK);
	}
	
	// get actor details using the actor's id
	@GetMapping("/view/{id}")
	public ResponseEntity<Optional<Actor>> view(@PathVariable int id)
	{
		return new ResponseEntity<Optional<Actor>>(this.service.view(id), HttpStatus.ACCEPTED);
	}
	
	// update
	@PostMapping("/update")
	public ResponseEntity<Actor> update(@RequestBody Actor actor)
	{
			return new ResponseEntity<Actor>(this.service.update(actor), HttpStatus.ACCEPTED);
	}
	
	// delete
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{		
			return new ResponseEntity<String>(this.service.delete(id), HttpStatus.ACCEPTED);
	}
	
	// add a list of actors
	@PostMapping("/addmany")
	public ResponseEntity<List<Actor>> addMany(@RequestBody List<Actor> actor)
	{
		return new ResponseEntity<List<Actor>>(this.service.addMany(actor), HttpStatus.CREATED);
	}
	
	// get a list of movie names in alphabetical order
	@GetMapping("/movies/{id}")
	public ResponseEntity<ArrayList<String>> movies(@PathVariable int id)
	{
		return new ResponseEntity<ArrayList<String>>(this.service.movies(id), HttpStatus.OK);
	}
}