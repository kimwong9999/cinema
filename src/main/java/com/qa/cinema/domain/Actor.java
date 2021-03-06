package com.qa.cinema.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@CrossOrigin
public class Actor 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String sname;
	private String fname;
	private String bname;
	private String bdate;
	private String ddate;
	
	@OneToOne()
	@JoinColumn(name = "bplace")
	private Location bplace;
	
	@OneToOne()
	@JoinColumn(name = "dplace")
	private Location dplace;
	
}