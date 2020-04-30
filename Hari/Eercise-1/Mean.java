import java.util.Scanner;
public class Mean
{
public static void main(String arg[])
{
Scanner s = new Scanner(System.in);
System.out.println("enter no-of items");
double size = s.nextDouble();
double meansum = 0;
double deviationsum=0;
double array[] = new double [(int) size];
System.out.println("enter the items");
for(int i=0; i<size; i++)
{
array[i] = s.nextDouble();
}
for(int i=0; i<size; i++)
{
meansum += array[i];
}
double mean = (meansum/size);
System.out.println("mean is: " + mean);
for(int i=0; i<size; i++)
{
array[i] = (Math.pow((array[i]-mean),2));
}
for(int i=0; i<size; i++)
{
deviationsum += array[i];
}
double variance = (deviationsum/size);
double standardDeviation = Math.sqrt(variance);

System.out.println("deviation is: " + standardDeviation);
}
}



