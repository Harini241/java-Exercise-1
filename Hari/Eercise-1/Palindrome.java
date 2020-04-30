class Palindrome
{
public static void main(String arg[])
{
int n=151,d,n1,rev=0;
n1=n;
while(n>0)
{
d=n%10;
rev=rev*10+d;
n=n/10;
}
if(rev==n1)
{
System.out.println("palindrome number");
}
else
{
System.out.println("not a palindrome number");
}
}
}