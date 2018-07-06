package com.mile1.service;

import com.mile1.bean.Student;

public class StudentService {

	public int findNumberOfNullMarks(Student data[])
	{
	           // write code here 
		int nullmarks = 0;
		/*
		int m[]= data[0].getMarks();
		
		for(int i=0;i<m.length;i++)
		{
			System.out.println("--"+m[i]);
		}
		*/
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null && data[i].getMarks()==null)
			{
				nullmarks++;
			}
		}
		
		
		
		return nullmarks;
	}
	
	public int findNumberOfNullNames(Student data [])
	{
	            // write code here 
		int names = 0;
		for(int i=0;i<data.length;i++)
		{
			if(data[i]!=null && data[i].getName()==null)
			{
				names++;
			}
		}
		return names;
	}
	
	public int findNumberOfNullObjects(Student data [])
	{
	               // write code here 
		int nullobj=0;
		
		for(int i=0;i<data.length;i++)
		{
			if(data[i]==null)
			{
				nullobj++;
			}
		}
		
		return nullobj;
		
	}



	
	
}
