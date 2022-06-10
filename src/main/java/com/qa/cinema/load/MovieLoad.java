package com.qa.cinema.load;

import org.springframework.web.bind.annotation.CrossOrigin;

import lombok.Data;

@Data
@CrossOrigin
public class MovieLoad
{
	private int id;
	private String title;
	private String article;
	private int release;
	private int duration;
	private String chroma;
	private String ratio;
    private Integer[] cast;


	public MovieLoad(int id, String title, String article, int release, int duration, String chroma, String ratio,
			Integer[] cast) 
	{
		this.id = id;
		this.title = title;
		this.article = article;
		this.release = release;
		this.duration = duration;
		this.chroma = chroma;
		this.ratio = ratio;
		this.cast = cast;
	}
	
	public MovieLoad(String title, String article, int release, int duration, String chroma, String ratio,
			Integer[] cast) 
	{
		this.title = title;
		this.article = article;
		this.release = release;
		this.duration = duration;
		this.chroma = chroma;
		this.ratio = ratio;
		this.cast = cast;
	}
}
