class student
{
	String name;
	int rollno;
	double mark;
}
public class arrayobj
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.name="anu";
		s1.rollno=1;
		s1.mark=90;
		student s2=new student();
		s2.name="arun";
		s2.rollno=2;
		s2.mark=80;
		student students[]=new student[2];
		students[0]=s1;
		students[1]=s2;
		int i;
		for(i=0;i<students.length;i++)
		{
			System.out.println(students[i].name+":"+students[i].mark);
		}
	}
}
