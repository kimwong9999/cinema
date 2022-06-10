package com.qa.cinema.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.cinema.domain.Location;
import com.qa.cinema.repository.LocationRepository;


@Service
public class LocationService 
{
	private LocationRepository service;
	
	public LocationService(LocationRepository service)
	{
		this.service = service;
	}
	
	public List<Location> list()
	{
		return this.service.findAll();
	}
	
	public List<Location> cities()
	{
		return this.service.cities();
	}
	
	public Optional<Location> view(int id)
	{
		return this.service.findById(id);
	}
	
	public Location add(Location location)
	{
		return this.service.saveAndFlush(location);
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
			message = "1:Deletion failed because there is no location with an id of " + id;
		}
		
		return message;
	}
	
	public List<Location> addmany(List<Location> location)
	{
		return this.service.saveAllAndFlush(location);
	}
}