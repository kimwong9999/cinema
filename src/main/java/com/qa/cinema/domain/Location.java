package com.qa.cinema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@CrossOrigin
public class Location 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String city;
	private String county;
	private String country;
}