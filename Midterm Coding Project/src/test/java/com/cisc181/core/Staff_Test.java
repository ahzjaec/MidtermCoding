package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eTitle;


public class Staff_Test {
	
	public static Date staffDate(int year, int month, int day)
	{
		Calendar Cals = Calendar.getInstance();
		Cals.set(year,  month, day);
		return Cals.getTime();
	}
	
	static ArrayList<Staff> StaffMembers = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() throws PersonException
	{
		StaffMembers.add(new Staff("John", "B", "Doe", staffDate(1987, 2, 8), "123 Fairytale Drive", "3021234567", "jbd@aol.com",  "Graveyard: Mon 2-4", 1, 30000, staffDate(2000, 7, 17), eTitle.MRS));
		StaffMembers.add(new Staff("Gary", "J","Johnson", staffDate(1990, 11, 11), "20 Front Street", "(267)-714-5600", "longhairdontcare@udel.edu", "The Sun: Sat 1-4", 3, 62100, staffDate(1993, 5, 30), eTitle.MR));
		StaffMembers.add(new Staff("Cathy", "Jelly", "Grifiin", staffDate(1899, 6, 12), "32 Main Street", "(911)-249-7760", "jjtheplane@yahoo.com", "Bridekirk: Tues 7-9", 3, 25400, staffDate(1999, 1, 15), eTitle.MS));
		StaffMembers.add(new Staff("Corn", "Pizza", "Bread", staffDate(1971, 4, 12), "451 Bellair Avenue", "(678)-999-8212", "auntjemima@gmail.com", "James: Wed 5-6", 6, 45000, staffDate(1980, 3, 24), eTitle.MRS));
		StaffMembers.add(new Staff("Janice", "Bernice", "Greene", staffDate(1994, 5, 28), "1150 Pine Lane", "(512)-090-6018", "jgreenisthequeen007@hotmail.com", "TarzanLand: Fri 10-1", 2, 71300, staffDate(2013, 12, 5), eTitle.MS));
	}
	
	@Test
	public void SalaryTest() throws PersonException 
	{
		double sum = 0;
		for (Staff i : StaffMembers) 
		{
			sum += i.getSalary();
		}
		double avgSalary = sum / StaffMembers.size();
		assertEquals(avgSalary, 46760, 0.01);
	}	
	
	@Test
	public void DOBExceptionTest() throws PersonException 
	{
		new Staff("Cathy", "Jelly", "Grifiin", staffDate(1899, 6, 12), "32 Main Street", "(911)-249-7760", "jjtheplane@yahoo.com", "Bridekirk 7-9", 3, 25400, staffDate(1999, 1, 15), eTitle.MS);
	}

	@Test
	public void PhoneExceptionTest() throws PersonException 
	{
		new Staff("John", "B", "Doe", staffDate(1987, 2, 8), "123 Fairytale Drive", "3021234567", "jbd@aol.com",  "Graveyard: Mon 2-4", 1, 30000, staffDate(2000, 7, 17), eTitle.MRS);
	}
}
