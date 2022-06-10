package com.qa.cinema.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.qa.cinema.load.ActorLoad;
import com.qa.cinema.load.LocationLoad;
import com.qa.cinema.load.MovieLoad;
import com.qa.cinema.service.ActorService;
import com.qa.cinema.service.LocationService;
import com.qa.cinema.service.MovieService;

@RestController
@RequestMapping("/cinema/location")
@CrossOrigin
public class LocationController 
{
	private LocationService service;
	private ActorService actorservice;
	private MovieService movieservice;
	
	public LocationController(LocationService service, ActorService actorservice, MovieService movieservice)
	{
		this.service = service;
		this.actorservice = actorservice;
		this.movieservice = movieservice;
		this.loadData();
	}
	
	// get all rows
	@GetMapping("/list")
	public ResponseEntity<List<Location>> list()
	{
		return new ResponseEntity<List<Location>>(this.service.list(), HttpStatus.OK);
	}
	
	// get all rows in city order
	@GetMapping("/cities")
	public ResponseEntity<List<Location>> cities()
	{
		return new ResponseEntity<List<Location>>(this.service.cities(), HttpStatus.OK);
	}
	
	// get actor details using the actor's id
	@GetMapping("/view/{id}")
	public ResponseEntity<Optional<Location>> view(@PathVariable int id)
	{
		return new ResponseEntity<Optional<Location>>(this.service.view(id), HttpStatus.ACCEPTED);
	}
	
	// add a location
	@PostMapping("/add")
	public ResponseEntity<Location> add(@RequestBody Location location)
	{
		return new ResponseEntity<Location>(this.service.add(location), HttpStatus.CREATED);
	}
	
	// update a location
	@PostMapping("/update")
	public ResponseEntity<Location> update(@RequestBody Location location)
	{
		return new ResponseEntity<Location>(this.service.add(location), HttpStatus.CREATED);
	}
	
	// delete location
	@PostMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable int id)
	{
		return new ResponseEntity<String>(this.service.delete(id), HttpStatus.ACCEPTED);
	}
	
	// load location data to the LOCATION table
	public void loadData()
	{
		
		List<Location> data = new ArrayList<>();
		HashMap<Integer, LocationLoad> location = new HashMap<>();
		location.put(1,  new LocationLoad("Winterset", "Iowa", "USA"));
		location.put(2,  new LocationLoad("Hartford", "Connecticut", "USA"));
		location.put(3,  new LocationLoad("Stockwell", "London", "UK"));
		location.put(4,  new LocationLoad("Cleveland", "Ohio", "USA"));
		location.put(5,  new LocationLoad("Lexington", "Kentucky", "USA"));
		location.put(6,  new LocationLoad("Smyrna", "Georgia", "USA"));
		location.put(7,  new LocationLoad("Hackney", "London", "UK"));
		location.put(8,  new LocationLoad("Coloane Island", "Macau", "China"));
		location.put(9,  new LocationLoad("Los Angeles", "California", "USA"));
		location.put(10, new LocationLoad("Fenwick", "Connecticut", "USA"));
		location.put(11, new LocationLoad("Crans-Montana", "Valais", "Switzerland"));
		location.put(12, new LocationLoad("Schöneberg", "Berlin", "Germany"));
		location.put(13, new LocationLoad("8th arrondissement", "Paris", "France"));
		location.put(14, new LocationLoad("Horfield", "Bristol", "UK"));
		location.put(15, new LocationLoad("Davenport", "Iowa", "US"));
		location.put(16, new LocationLoad("Indiana", "Pennsylvania", "US"));
		location.put(17, new LocationLoad("Beverly Hills", "California", "US"));
		location.put(18, new LocationLoad("Lowell", "Massachusetts", "US"));
		location.put(19, new LocationLoad("Neuilly-sur-Seine", "Paris", "France"));
		location.put(20, new LocationLoad("Mount Vernon", "New York", "US"));
		location.put(21, new LocationLoad("Queens", "New York", "US"));
		location.put(22, new LocationLoad("Brooklyn", "New York", "US"));
		location.put(23, new LocationLoad("San Diego", "California", "US"));
		location.put(24, new LocationLoad("Manhattan", "New York", "US"));
		location.put(25, new LocationLoad("Kingston upon Thames", "London", "UK"));
		location.put(26, new LocationLoad("Hammersmith", "London", "England"));
		location.put(27, new LocationLoad("Dalby", "Queensland", "Australia"));
		
		for(Map.Entry<Integer, LocationLoad> l : location.entrySet())
		{  
			Location loc = new Location();
			loc.setId(l.getKey());
			loc.setCity(l.getValue().getCity());
			loc.setCounty(l.getValue().getCounty());
			loc.setCountry(l.getValue().getCountry());
			data.add(loc);	
		}
		
		this.service.addmany(data);
	
		HashMap<Integer, ActorLoad> actors = new HashMap<>();
		actors.put(1,  new ActorLoad("Wayne", "John", "Marion Robert Morrison", "1907-MAY-26", "1979-JUN-11", 1, 9));
		actors.put(2,  new ActorLoad("Hepburn", "Katherine", "Katharine Houghton Hepburn", "1907-MAY-12", "2003-JUN-29", 2, 10));
		actors.put(3,  new ActorLoad("Grant", "Cary", "Archibald Alec Leach", "1904-JAN-18", "1986-NOV-29", 14, 15));
		actors.put(4,  new ActorLoad("Stewart", "James", "James Maitland Stewart", "1908-MAY-20", "1997-JUL-02", 16, 17));
		actors.put(5,  new ActorLoad("Davies", "Bette", "Ruth Elizabeth Davis", "1908-APR-05", "1989-OCT-06", 18, 19));
		actors.put(6,  new ActorLoad("Dietrich", "Marlene", "Marie Magdalene Dietrich", "1901-DEC-27", "1992-MAY-06", 12, 13));
		actors.put(7,  new ActorLoad("Moore", "roger", "Roger George Moore", "1927-OCT-14", "2017-MAY-23", 3, 11));
		actors.put(8,  new ActorLoad("Berry", "Halle", "Maria Halle Berry", "1966-AUG-14", "", 4, 0));
		actors.put(9,  new ActorLoad("Clooney", "George", "George Timothy Clooney", "1961-MAY-06", "", 5, 0));
		actors.put(10, new ActorLoad("Roberts", "Julia", "Julia Fiona Roberts", "1967-OCT-28", "", 6, 0));
		actors.put(11, new ActorLoad("Washington", "Denzel", "Denzel Hayes Washington Jr.", "1954-DEC-28", "", 20, 0));
		actors.put(12, new ActorLoad("Liu", "Lucy", "Lucy Alexis Liu", "1968-DEC-02", "", 21, 0));
		actors.put(13, new ActorLoad("Elba", "Idris", "Idrissa Akuna Elba", "1972-SEP-06", "", 7, 0));
		actors.put(14, new ActorLoad("Wen", "Ming-Na", "Ming-Na Wen", "1963-NOV-20", "", 8, 0));
		actors.put(15, new ActorLoad("Murphy", "Eddie", "Edward Regan Murphy", "1961-APR-03", "", 22, 0));
		actors.put(16, new ActorLoad("Diaz", "Cameron", "Cameron Michelle Diaz", "1972-AUG-30", "", 23, 0));
		actors.put(17, new ActorLoad("Downey Jr.", "Robert", "Robert John Downey Jr.", "1965-APR-04", "", 24, 0));
		actors.put(18, new ActorLoad("Johansson", "Scarlett", "Scarlett Ingrid Johansson", "1984-NOV-22", "", 24, 0));
		actors.put(19, new ActorLoad("Holland", "Tom", "Thomas Stanley Holland", "1996-JUN-01", "", 25, 0));
		actors.put(20, new ActorLoad("Paltrow", "Gwyneth", "Gwyneth Kate Paltrow", "1972-SEP-27", "", 9, 0));
		actors.put(21, new ActorLoad("Cumberbatch", "Benedict", "Benedict Timothy Carlton Cumberbatch", "1976-JUL-19", "", 26, 0));
		actors.put(22, new ActorLoad("Robbie", "Margot", "Margot Elise Robbie", "1990-JUL-02", "", 27, 0));
		
		
		for(Map.Entry<Integer, ActorLoad> ac : actors.entrySet())
		{
			Actor actor = new Actor();
			Location bplace = new Location();
			Location dplace = new Location();
			
/*			System.out.println("bid: " +  ac.getValue().getBid() + " sname: " + ac.getValue().getSname());
			System.out.println("city: " +  location.get(ac.getValue().getBid()).getCity());
 */ 
			int bid = ac.getValue().getBid();
			bplace.setId(bid);
			bplace.setCity(location.get(bid).getCity());
			bplace.setCounty(location.get(bid).getCounty());
			bplace.setCountry(location.get(bid).getCountry());
			int did = ac.getValue().getDid();
		
			if (did == 0)
			{
				dplace = null;
			}
			else
			{
				dplace.setId(did);
				dplace.setCity(location.get(bid).getCity());
				dplace.setCounty(location.get(bid).getCounty());
				dplace.setCountry(location.get(bid).getCountry());
			}
			
			actor.setSname(ac.getValue().getSname());
			actor.setFname(ac.getValue().getFname());
			actor.setBname(ac.getValue().getBname());
			actor.setBdate(ac.getValue().getBdate());
			actor.setDdate(ac.getValue().getDdate());
			actor.setBplace(bplace);
			actor.setDplace(dplace);
			
			this.actorservice.add(actor);	
		}
		
		HashMap<Integer, MovieLoad> movies = new HashMap<>();
		
		movies.put(1,  new MovieLoad("Rooster Cogburn", "", 1975, 108, "colour", "2.39:1", new Integer[]{1,2}));
		movies.put(2,  new MovieLoad("Bringing Up Baby", "", 1938, 102, "b&w", "1.37:1", new Integer[]{2,3}));
		movies.put(3,  new MovieLoad("Philadelphia Story", "The", 1940, 112, "b&w", "1.37:1", new Integer[]{2,3,4}));
		movies.put(4,  new MovieLoad("Live and Let Die", "", 1973, 121, "colour", "1.85:1", new Integer[]{7}));
		movies.put(5,  new MovieLoad("Man Who Shot Liberty Valance", "The", 1962, 123, "b&w", "1.85:1", new Integer[]{1,4}));
		movies.put(6,  new MovieLoad("Die Another Day", "", 2002, 133, "colour", "2.39:1", new Integer[]{8}));
		movies.put(7,  new MovieLoad("Syriana", "", 2005, 128, "colour", "2.39:1", new Integer[]{9}));
		movies.put(8,  new MovieLoad("Mulan", "", 1998, 87, "colour", "1.85:1", new Integer[]{14, 15}));
		movies.put(9,  new MovieLoad("Charlie's Angels", "", 2000, 98, "colour", "2.39:1", new Integer[]{16, 12}));
		movies.put(10, new MovieLoad("Avengers: Infinity War", "", 2018, 149, "colour", "2.39:1", new Integer[]{17, 18, 13, 20, 21}));
		movies.put(11, new MovieLoad("Spoilers", "The", 1942, 87, "b&w", "1.37:1", new Integer[]{6, 1}));
		movies.put(12, new MovieLoad("Destry Rides Again", "", 1939, 95, "b&w", "1.37:1", new Integer[]{6, 4}));
		movies.put(13, new MovieLoad("Spider-Man: Homecoming", "", 2017, 133, "colour", "2.39:1", new Integer[]{19, 17, 20}));
		movies.put(14, new MovieLoad("Suicide Squad", "The", 2021, 132, "colour", "1.90:1", new Integer[]{22, 13}));
		movies.put(15, new MovieLoad("Spider-Man: No Way Home", "", 2021, 148, "colour", "1.37:1", new Integer[]{19, 21}));
		movies.put(16, new MovieLoad("War Wagon", "The", 1967, 101, "colour", "2.35:1", new Integer[]{1}));
		
		
		for(Map.Entry<Integer, MovieLoad> movie : movies.entrySet())
		{
			this.movieservice.add(movie.getValue());	
		}
	}
}