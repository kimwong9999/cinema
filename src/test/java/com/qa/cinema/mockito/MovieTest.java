package com.qa.cinema.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.qa.cinema.domain.Actor;
import com.qa.cinema.domain.Movie;
import com.qa.cinema.load.MovieLoad;
import com.qa.cinema.service.MovieService;

public class MovieTest 
{
	@BeforeAll
	static void testStart() {
		System.out.println("Starting Movie test suite!");
	}
	
	@Test
	public void test01(MovieService service) 
	{
		assertEquals(service.list(), 16);
	}
	
	@Test
	public void test02(MovieService service) 
	{
		String title = "Man Who Knew Too Much";
		String article = "The";
		int release = 1935;
		int duration = 90;
		String chroma = "b&w";
		String ratio = "4:3";
		Integer [] cast = {1,2};
		
		MovieLoad input = new MovieLoad(title, article, release, duration, chroma, ratio, cast);;
		Movie movie = service.add(input);
		assertEquals(movie.getTitle(), title);
		Actor actor = movie.getCast().get(1);
		assertEquals(actor.getSname(), "Wayne");
	}
	
	@AfterAll
	static void testEnd() {
		System.out.println("All done!");
	}
}
