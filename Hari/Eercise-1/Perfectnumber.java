class Perfectnumber
{
public static void main(String arg[])
{
int n=6,s=0,i;
for(i=1;i<n-1;i++)
{
if(n%i==0)
{
s=s+i;
}
}
if(s==n)
{
System.out.println(n +"is perfect number");
}
}
}