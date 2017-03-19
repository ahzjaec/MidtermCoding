package com.cisc181.core;

import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	public Course()
	{
		
	}
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major)
	{
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}
	
	public String getCourseName ( ) 
	{
		return this.CourseName;
	}
	public void setCourseName (String CourseName)
	{
		this.CourseName = CourseName;
	}
	
	
	public UUID getCourseID ( )
	{
		return this.CourseID;
	}
	public void setCourseID (UUID CourseID)
	{
		this.CourseID = UUID.randomUUID();
	} 
	
	
	public int getGradePoints ( )
	{
		return this.GradePoints;
	}
	public void setGradePoints (int GradePoints)
	{
		this.GradePoints = GradePoints;
	}
	
	public eMajor getMajor ( )
	{
		return this.Major;
	}
	public void setMajor (eMajor Major)
	{
		this.Major = Major;
	}
	
}
