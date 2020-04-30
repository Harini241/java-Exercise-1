class Armstrong
{
public static void main(String arg[])
{
int num=370,n,rem, sum=0;
n=num;
while(n!=0)
{
rem=n%10;
sum=sum+rem*rem*rem;
n=n/10;
}
if(sum==num)
System.out.println(num +"is an armstrong number");
else
System.out.println(num +"is not an armstrong number");
}
}