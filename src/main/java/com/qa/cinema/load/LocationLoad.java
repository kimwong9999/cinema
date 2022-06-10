package com.qa.cinema.load;

import lombok.Data;

@Data
public class LocationLoad 
{
	private int id;
	private String city;
	private String county;
	private String country;
	

	public LocationLoad(int id, String city, String county, String country) 
	{
		this.id = id;
		this.city = city;
		this.county = county;
		this.country = country;
	}
	
	public LocationLoad(String city, String county, String country) 
	{
		this.city = city;
		this.county = county;
		this.country = country;
	}
}
