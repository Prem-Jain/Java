package MiniProjectcom.mile.services;

import mp4com.mile.bean.*;
import mp4com.mile.exceptions.*;

public class StudentReport {
	public String findGrades(Student sObj)
	{
		int m[] = sObj.getMarks();
		if(m[0] < 35 || m[1] < 35 || m[2] < 35)
			return "F";
		int sum = m[0] + m[1] + m[2];
		if(sum < 150)
			return "C";
		if(sum < 200)
			return "B";
		if(sum < 250)
			return "A";
		return "A+";
	}
	
	public String validate(Student s) throws NullNameException, NullMarksArrException, NullStudentObjectException
	{
		if(s == null)
			throw new NullStudentObjectException();
		if(s.getName() == null)
			throw new NullNameException();
		if(s.getMarks() == null)
			throw new NullMarksArrException();
		return "Valid";
	}
}
