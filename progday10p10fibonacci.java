//Java program to generate fibonacci series upto 'n' value
import java.util.Scanner;
class Main1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int sum=0,n;
int a=1;
int b=1;
System.out.println("Enter the nth value:");
n=sc.nextInt();
System.out.println("Fibonacci series:");
while(sum<=n)
{
System.out.print(sum+" ");
a=b;
b=sum;
sum=a+b;
}
}
}