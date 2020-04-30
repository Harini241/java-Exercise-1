import java .io.*;
class Harmon
{
static double sum(int n)
{
double i,s=0.0;
for (i=1;i<=n;i++)
s=s+1/i;
return s;
}
public static void main(String ar[])
{
int n=70000;
System.out.printf("sum is %f",sum(n));
}
}