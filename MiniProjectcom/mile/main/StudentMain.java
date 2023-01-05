package mp4com.mile.main;

import mp4com.mile.bean.*;
import mp4com.mile.services.*;

public class StudentMain {
	static Student data[] = new Student[10];
	StudentMain()
	{
		for(int i = 0; i < data.length; i++)
		{
			data[i] = new Student();
		}
		data[0] = new Student ("A1", new int[] {72, 73, 74}); 
		data[1] = new Student ("B1", new int[] {75, 76, 77}); 
		data[2] = new Student ("C1", new int[] {99, 99, 99}); 
		data[3] = new Student ("C2", new int[] {100, 100, 99}); 
		data[4] = new Student ("B2", new int[] {13,88,13}); 
		data[5] = new Student ("C3", new int[] {14,14,99}); 
		data[6] = new Student ("A2", new int[] {77,55,12}); 
		data[7] = new Student (null, new int[] {13,88,13});
		data[8] = new Student ("A3", null); 
		data[9] = null;
	}
	public static void main(String args[])
	{
		StudentMain sm = new StudentMain();
		sm.StudentReportMethods();
		sm.StudentServiceMethods();
	}
	private void StudentReportMethods()
	{
		for(Student s : data)
		{
			StudentReport sr = new StudentReport();
			try
			{
				if(sr.validate(s).equals("Valid"))
					System.out.println(s.getName()+ " has got " + sr.findGrades(s) + " grade.");
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	private void StudentServiceMethods()
	{
		StudentService ss = new StudentService();
		System.out.println("Number of Null Marks Array = " + ss.findNumberOfNullMarksArray(data));
		System.out.println("Number of Names = " + ss.findNumberOfNullNames(data));
		System.out.println("Number of Null Objects = " + ss.findNumberOfNullObjects(data));
	}
}
