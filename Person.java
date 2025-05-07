class Person
{
	String name;
	int phone;
	public void showAddress()
	{
		System.out.println("Name:"+name);
		System.out.println("Phone:"+phone);
	}
}
class Teacher extends Person
{
}
class Student extends Person
{
}
class Staff extends Person
{
}
public class Main
{
	public static void main(String args[])
	{
		Teacher t1=new Teacher();
		t1.name="john";
		t1.phone=1234;
		t1.showAddress();
		Student st1=new Student();
		st1.name="Anil";
		st1.phone=4567;
		st1.showAddress();
		Staff s1=new Staff();
		s1.name="Abhi";
		s1.phone=8910;
		s1.showAddress();
	}
}
		
		
