//Recursive funtion 
//calling a function within its definition is called Recursive function
import java.util.Scanner;
class Demo1
{
public int calculateFactorial(int n)//It the factorial is out of range then give long to get value/factorial
{
if(n==0) return 1;
else
return n*calculateFactorial(n-1);
}
}
class Test5
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo1 ob=new Demo1();
System.out.println(ob.calculateFactorial(p));
}
}