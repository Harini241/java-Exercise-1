public class Pattern {
   public static void main(String args[]){
      int n,i,j;
      n = 5;
      for(i = 0; i<= n; i++) {
         for(j = 0; j<= i; j++){
            System.out.print("*"+" ");
         }
         System.out.print("\n");
      }
   }
}