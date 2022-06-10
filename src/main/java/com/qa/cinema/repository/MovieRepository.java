package com.qa.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.cinema.domain.Movie;

@Repository
public interface MovieRepository extends JpaRepository <Movie, Integer>
{	
	@Query(value = "select * from movie where id in (select movie_id from movie_actors where actor_id = ?1) order by title", nativeQuery=true)
	public List<Movie> movies(Integer id);
}

