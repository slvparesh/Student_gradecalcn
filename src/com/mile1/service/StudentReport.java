package com.mile1.service;

import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;

public class StudentReport {

	public String findGrade(Student studentObject)
	{
		String grade = "";
		int marks[] = studentObject.getMarks();
		int m1 = marks[0];
		int m2 = marks[1];
		int m3 = marks[2];
		
		if(m1<35 || m2<35 || m3<35)
		{
			grade = "F";
		}
		else
		{
			int sum = m1+m2+m3;
			
			if(sum<=150)
			{
				grade = "D";
			}
			else if(sum>150 && sum<=200)
			{
				grade = "C";
			}
			else if(sum>200 && sum<=250)
			{
				grade = "B";
			}
			else if(sum>250 && sum<=300)
			{
				grade = "A";
			}
			
		}
		return grade;
	}
	
	public String validate(Student studentObject) throws NullStudentException, NullNameException, NullMarksArrayException
	{
		String str = "";
		
		if(studentObject == null)
		{
			throw new NullStudentException();
				
			}
		
		else if( studentObject.getName()==null)
		{
			
				throw new NullNameException();
			
		}
		
		else if( studentObject.getMarks()==null)
		{
			
				throw new NullMarksArrayException();
			
		}
		else 
		{
			str = findGrade(studentObject);
		}
		
		
		return str;
		
	}
	
	

}
