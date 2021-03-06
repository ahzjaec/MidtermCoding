package com.cisc181.core;

import java.util.UUID;
import java.util.Date;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester() 
	{
		
	}
	public Semester(UUID SemesterID, Date StartDate, Date EndDate) 
	{
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public UUID getSemesterID ( )
	{
		return this.SemesterID;
	}
	public void setSemesterID (UUID SemesterID)
	{
		this.SemesterID = SemesterID;
	}
			
	public Date getStartDate ( ) 
	{
		return StartDate;
	}

	public void setStartDate (Date StartDate)
	{
		this.StartDate = StartDate;		
	}
			
	public Date getEndDate ( ) 
	{
		return EndDate;
	}

	public void setEndDate (Date EndDate)
	{
		this.EndDate = EndDate;		
	}
			
}
