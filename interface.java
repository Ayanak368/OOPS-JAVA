interface interfaceOne
{
	public void show();

}
interface interfaceTwo
{
	public void display();
}
class A implement inferfaceone,interfaceTwo
{
	@override
	public void show()
	{
		System.out.println("Show something");
	}
	@override
	public void display()
	{
		System.outprintln("Display nothing");
	
	}
}
public class Test
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.show();
		obj.display();
	
	}
}
