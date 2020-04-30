public class Digit_Sum
{
public static void main(String arg[])
{
int m, n,sum=0;
m=355;
while(m>0)
{
n=m%10;
sum=sum+n;
m=m/10;
}
System.out.println("sum of digits:"+sum);
}
}