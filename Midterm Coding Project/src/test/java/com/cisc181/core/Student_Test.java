package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {


	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	
	static ArrayList<Enrollment> ECONF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ECONS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CISCS = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CALCF = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> CALCS = new ArrayList<Enrollment>();


	public static Date studDate(int year, int month, int day) 
	{
		Calendar CalB = Calendar.getInstance();
		CalB.set(year, month, day);
		return CalB.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {

		Course ECON = new Course(UUID.randomUUID(), "Macroeconomics", 100, eMajor.BUSINESS);
		Course CISC = new Course(UUID.randomUUID(), "Intro to Java", 100, eMajor.CHEM);
		Course CALC = new Course(UUID.randomUUID(), "Calculus B", 100, eMajor.PHYSICS);

		courses.add(ECON);
		courses.add(CISC);
		courses.add(CALC);

		Semester fall17 = new Semester(UUID.randomUUID(), studDate(2017, 8, 24), studDate(2017, 12, 22));
		Semester spring18 = new Semester(UUID.randomUUID(), studDate(2018, 2, 5), studDate(2018, 5, 25));

	
		semesters.add(spring18);
		semesters.add(fall17);

		
		Section fallECON = new Section(ECON.getCourseID(), fall17.getSemesterID(), UUID.randomUUID(), 515);
		Section fallCISC = new Section(CISC.getCourseID(), fall17.getSemesterID(), UUID.randomUUID(), 203);
		Section fallCALC = new Section(CALC.getCourseID(), fall17.getSemesterID(), UUID.randomUUID(), 310);

		Section springECON = new Section(ECON.getCourseID(), spring18.getSemesterID(), UUID.randomUUID(), 220);
		Section springCISC = new Section(CISC.getCourseID(), spring18.getSemesterID(), UUID.randomUUID(), 101);
		Section springCALC = new Section(CALC.getCourseID(), spring18.getSemesterID(), UUID.randomUUID(), 419);

		
		sections.add(fallECON);
		sections.add(fallCISC);
		sections.add(fallCALC);
		sections.add(springECON);
		sections.add(springCISC);
		sections.add(springCALC);
		
		
		Student StudA = new Student("Kijai", "Lee", "Daniels", studDate(1997, 6, 30), eMajor.COMPSI, "1150 Langley Road",
				"(777)-777-2452", "danielsk@udel.com", UUID.randomUUID());

		Student StudB = new Student("Gia", "Raven", "North", studDate(1995, 2, 18), eMajor.NURSING,
				"188 Main Street", "(123)-987-5461", "ggsopoppin95@udel.edu", UUID.randomUUID());

		Student StudC = new Student("Tatiana", "Tia", "Perez", studDate(1990, 10, 6), eMajor.COMPSI,
				"732 YellowBrick Road", "(203)-813-9999", "uncleben@yahoo.edu", UUID.randomUUID());

		Student StudD = new Student("Taylor", "Lauren", "Smith", studDate(1992, 1, 15), eMajor.CHEM, "30 Bitterman Street",
				"(414)-905-7536", "tlosmitty@udel.edu", UUID.randomUUID());

		Student StudE = new Student("Tom", "Chris", "Jackson", studDate(1997, 12, 22), eMajor.BUSINESS,
				"294 Rumbleton Road", "(856)-613-8433", "sorrymsjackson122297@aol.com", UUID.randomUUID());

		Student StudF = new Student("Bria", "Nae", "Brown", studDate(1994, 8, 7), eMajor.CHEM,
				"2004 Spruce Street", "(555)-774-8888", "naebrown@udel.edu", UUID.randomUUID());

		Student StudG = new Student("Gabbie", "Asia", "Jones", studDate(1996, 4, 14), eMajor.PHYSICS, "315 Punk Pike",
				"(267)-302-2596", "gabthephysicist@aol.com", UUID.randomUUID());

		Student StudH = new Student("Marcus", "Tyson", "Lawler", studDate(1991, 5, 23), eMajor.NURSING, "2203 Galloway Court",
				"(230)-111-2289", "miketysonmay@ymail.com", UUID.randomUUID());

		Student StudI = new Student("Emmanuel", "Brett", "Yates", studDate(1993, 3, 17), eMajor.BUSINESS,
				"101 Brant Way", "(610)-521-0001", "mannyboi@gmail.com", UUID.randomUUID());

		Student StudJ = new Student("Joe", "Nathan", "Pierson", studDate(1998, 6, 1), eMajor.PHYSICS, "13 Passyunk Drive",
				"(776)-034-9994", "notthehotdognathan@msn.net", UUID.randomUUID());

		
		students.add(StudA);
		students.add(StudB);
		students.add(StudC);
		students.add(StudD);
		students.add(StudE);
		students.add(StudF);
		students.add(StudG);
		students.add(StudH);
		students.add(StudI);
		students.add(StudJ);

		
		ArrayList<Integer> gradesA = new ArrayList<Integer>(Arrays.asList(100, 89, 51, 76, 89, 90, 64, 70, 42, 96));
		ArrayList<Integer> gradesB = new ArrayList<Integer>(Arrays.asList(95, 88, 49, 63, 78, 99, 100, 76, 96, 84));
		ArrayList<Integer> gradesC = new ArrayList<Integer>(Arrays.asList(83, 75, 40, 87, 60, 97, 31, 58, 80, 91));

		
		for (int i = 0; i < students.size(); i++) {

			ECONF.add(new Enrollment(sections.get(0).getSectionID(), students.get(i).getStudentID()));
			ECONF.get(i).setGrade(gradesA.get(i));

			ECONS.add(new Enrollment(sections.get(1).getSectionID(), students.get(i).getStudentID()));
			ECONS.get(i).setGrade(gradesB.get(i));

			CISCF.add(new Enrollment(sections.get(2).getSectionID(), students.get(i).getStudentID()));
			CISCF.get(i).setGrade(gradesC.get(i));

			CISCS.add(new Enrollment(sections.get(3).getSectionID(), students.get(i).getStudentID()));
			CISCS.get(i).setGrade(gradesA.get(i));

			CALCF.add(new Enrollment(sections.get(4).getSectionID(), students.get(i).getStudentID()));
			CALCF.get(i).setGrade(gradesB.get(i));

			CALCS.add(new Enrollment(sections.get(5).getSectionID(), students.get(i).getStudentID()));
			CALCS.get(i).setGrade(gradesC.get(i));
		}

	}

	
	public double GPACalculator(ArrayList<Enrollment> ECONF, ArrayList<Enrollment> ECONS, ArrayList<Enrollment> CISCF,
			ArrayList<Enrollment> CISCS, ArrayList<Enrollment> CALCF, ArrayList<Enrollment> CALCS, int Student) {
		
		final int numofcourses = 6;
		
		double GPA = 0;

		if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 95) 
		{
			GPA = 4.0;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 90) 
		{
			GPA = 3.75;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 85) 
		{
			GPA = 3.5;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 80) 
		{
			GPA = 3.0;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 75) 
		{
			GPA = 2.5;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 70) 
		{
			GPA = 2.0;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 65) 
		{
			GPA = 1.5;
		} 
		else if ((ECONF.get(Student).getGrade() + ECONS.get(Student).getGrade() + CISCF.get(Student).getGrade()
				+ CISCS.get(Student).getGrade() + CALCF.get(Student).getGrade() + CALCS.get(Student).getGrade())
				/ numofcourses >= 60) 
		{
			GPA = 1.0;
		} 
		else 
		{
			GPA = 0.0;
		}
		return GPA;
	}


	@Test
	public void GPATest() 
	{
		assertEquals(4.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 0), 0.001);
		assertEquals(3.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 1), 0.001);
		assertEquals(1.5, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 2), 0.001);
		assertEquals(3.75, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 3), 0.001);
		assertEquals(2.5, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 4), 0.001);
		assertEquals(1.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 5), 0.001);
		assertEquals(2.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 6), 0.001);
		assertEquals(3.25, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 7), 0.001);
		assertEquals(4.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 8), 0.001);
		assertEquals(0.0, GPACalculator(ECONF, ECONS, CISCF, CISCS, CALCF, CALCS, 9), 0.001);
	}


	public static double CourseGr(ArrayList<Enrollment> courses) 
	{

		double avg = 0;
		double courseAvg = 0;

		for (int a = 0; a < students.size(); a++) 
		{
			avg += courses.get(a).getGrade();
			courseAvg = (avg / students.size());
		}
		return courseAvg;
	}


	@Test
	public void testCourseGr() 
	{
		assertEquals(76.7, CourseGr(ECONF), .01);
		assertEquals(82.8, CourseGr(ECONS), 01);
		assertEquals(70.2, CourseGr(CISCF), .01);
		assertEquals(76.7, CourseGr(CISCS), .01);
		assertEquals(82.8, CourseGr(CALCF), 01);
		assertEquals(70.2, CourseGr(CALCS), .01);
	}

	public static void MajorChange(eMajor major, Student student) 
	{
		student.seteMajor(major);
	}

	@Test
	public void MajorChangeTest() 
	{
		MajorChange(eMajor.NURSING, students.get(5));
		assertEquals(eMajor.NURSING, students.get(5).geteMajor());
	}

}