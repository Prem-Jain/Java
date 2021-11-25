package std.grd;

public class Grade {
	private int total, avg;
	private char grade;
	public Grade(int t)
	{
		total = t;
		avg = total / 3;
	}
	public char getGrade()
	{
		if(avg >= 70)
			grade = 'A';
		else if(avg >= 50)
			grade = 'B';
		else
			grade = 'C';
		return grade;
	}
}
