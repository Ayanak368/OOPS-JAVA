class Animal
{
String name;
void makesound()
{
System.out.println("some generic sound");
}
}
class Dog extends Animal
{
void bark()
{
System.out.println(name+"says:woof!woof");
}
}
public class inheritance
{
public static void main(String args[])
{
Dog mydog=new Dog();
mydog.name="Pabluo";
mydog.makesound();
mydog.bark();
}
}

