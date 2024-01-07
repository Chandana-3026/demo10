//Fibonacci series
class Fibonacci
{
public static void main(String args[])
{
int a=1;
int b=1;
int c;
System.out.println(a+" "+b);
for(int i=2;i<20;i++)
{
c=a+b;
System.out.print(c+" ");
//System.out.println(a+"+"+b+"="+c);
a=b;
b=c;
}
}
}
