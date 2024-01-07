//With argument with Return value
import java.util.Scanner;
class Demo
{
public void displayMenu()
{
System.out.println("+:Addition");
System.out.println("-:Subtraction\n* :Multiplication");
System.out.println("/:Division");
}
public void add(int a,int b)//with argument no return vauleImp
{
int res=a+b;
System.out.println(a+"+"+b+"="+res);
}
public int sub(int a1,int b1)//with argument return value function
{
int r=a1-b1;
return r;
}
}
class Test1
{
public static void main (String args[])
{
Demo ob=new Demo();
ob.displayMenu();
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
ob.add(n1,n2);
int r=ob.sub(n1,n2);//declaring with local variables n1,n2
System.out.println(n1+"-"+n2+"="+r);
}
}
