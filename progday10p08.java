//Calculate factorial without using recursion
import java.util.Scanner;
class Demo2
{
public long calculateFactorial(int n)
{
long res=1;
if(n==0)
return 1;
else
{
for(int i=1;i<=n;i++)
res=res*i;
}
return res;
} 
}
class Test6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int p=sc.nextInt();
Demo2 ob=new Demo2();
System.out.println(ob.calculateFactorial(p));
}
}
