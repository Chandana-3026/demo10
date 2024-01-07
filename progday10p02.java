//No arguments with no return value
class Demo
{
public void displayMenu()//no argument no return value
{
System.out.println("+:Addition");
System.out.println("-:Subtraction\n* :Multiplication");
System.out.println("/:Division");
}
}
class Test
{
public static void main (String args[])
{
Demo ob=new Demo();
ob.displayMenu();
}
}
