public class Deficient 
{
    static int divsum(int n) 
    {
        int sum = 0;
        for (int i = 1; i <= (Math.sqrt(n)); i++) {
            if (n % i == 0) {
  if (n / i == i) {
                    sum = sum + i;
                } else {
                    sum = sum + i;
                    sum = sum + (n / i);
                }
            }
        }
        return sum;
    }
 
    static boolean isDeficientNumber(int n) 
    {
        return (divsum(n) < (2 * n));
    }
 
    public static void main(String args[]) {
        System.out.println("21 is deficient number : " + isDeficientNumber(21));
        System.out.println("20 is deficient number : " + isDeficientNumber(20));
    }
} 