package com.qa.cinema.load;

import lombok.Data;

@Data
public class ActorLoad 
{
	private String sname;
	private String fname;
	private String bname;
	private String bdate;
	private String ddate;
	private int bid;
	private int did;

	public ActorLoad(String sname, String fname, String bname, String bdate, String ddate, int bid, int did)
	{
		this.sname		= sname;
		this.fname		= fname;
		this.bname		= bname;
		this.bdate		= bdate;
		this.ddate		= ddate;
		this.bid		= bid;
		this.did		= did;
	}
}
