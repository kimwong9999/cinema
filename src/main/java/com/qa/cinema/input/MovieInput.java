package com.qa.cinema.input;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@CrossOrigin
public class MovieInput 
{
	private int id;
	private String title;
	private String article;
	private int release;
	private int duration;
	private String chroma;
	private String ratio;
	private Integer[] cast;
}
