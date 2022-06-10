package com.qa.cinema.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.qa.cinema.domain.Location;
import com.qa.cinema.service.LocationService;

public class LocationTest 
{
	@BeforeAll
	static void testStart() {
		System.out.println("Starting test suite!");
	}
	
	@Test
	public void test01(LocationService service) 
	{
		assertEquals(service.list(), 27);
	}
	
	@Test
	public void test02(LocationService service) 
	{
		String city = "Edinburgh";
		String county = "Midlothian";
		String country = "UK";
		
		Location input = new Location();
		input.setCity(city);
		input.setCounty(county);
		input.setCountry(country);
		Location location = service.add(input);
		assertEquals(location.getCity(), city);
		assertEquals(location.getCounty(), county);
		assertEquals(location.getCountry(), country);
	}
	
	@AfterAll
	static void testEnd() {
		System.out.println("All done!");
	}
}
