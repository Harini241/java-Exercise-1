import java.util.Scanner;
public class Sales {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Please enter the amount of your purchase: ");
double purchaseAmount = input.nextDouble();
System.out.println();
System.out.println("Your purchase amount is: $" + purchaseAmount);
System.out.println();
double statetax = purchaseAmount * 0.085;
System.out.println("The State sales tax for this purchase is: $" + (int)(statetax * 100)/100.0);
System.out.println();
double countytax = purchaseAmount * 0.025;
System.out.println("The County sales tax for this purchase is: $" + (int)(countytax * 100)/100.0);
System.out.println();
double totaltax = countytax + statetax;
System.out.println("The total amount of sales tax that you will pay for this purchase will be: $"+ String.format("%.2f",totaltax));
System.out.println();
double total = totaltax + purchaseAmount;
System.out.println("The total amount of your purchase including the sales tax will be: $" + String.format("%.2f",total));
}
}
