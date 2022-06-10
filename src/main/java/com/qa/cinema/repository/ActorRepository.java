package com.qa.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qa.cinema.domain.Actor;


@Repository
public interface ActorRepository extends JpaRepository <Actor, Integer>
{
	@Query(value = "select * from actor order by sname", nativeQuery=true)
	public List<Actor> names();
}