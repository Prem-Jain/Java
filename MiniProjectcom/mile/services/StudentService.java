package MiniProjectcom.mile.services;

import mp4com.mile.bean.*;

public class StudentService {
	public int findNumberOfNullMarksArray(Student sArr[])
	{
		int count = 0;
		for(Student s : sArr)
		{
			if(s != null)
				if(s.getMarks() == null)
					count++;
		}
		return count;
	}
	public int findNumberOfNullNames(Student sArr[])
	{
		int count = 0;
		for(Student s : sArr)
		{
			if(s != null)
				if(s.getName() == null)
					count++;
		}
		return count;
	}
	public int findNumberOfNullObjects(Student sArr[])
	{
		int count = 0;
		for(Student s : sArr)
		{
			if(s == null)
				count++;
		}
		return count;
	}
}
