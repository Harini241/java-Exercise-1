class Fib
{
public static void main(String arg[])
{
int n=10,f=0,s=1;
System.out.println("first " + n + " terms: ");
for(int i=1; i<=n; ++i)
{
System.out.println(f + " + ");
int sum=f+s;
f=s;
s=sum;
}
}
}