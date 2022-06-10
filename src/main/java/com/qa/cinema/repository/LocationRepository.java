package com.qa.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.cinema.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository <Location, Integer>
{
	@Query(value = "select * from location order by city", nativeQuery=true)
	public List<Location> cities();
}