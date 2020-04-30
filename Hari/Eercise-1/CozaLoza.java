public class CozaLoza {
    public static void main(String[] args) {
        for (int i = 1; i <=110 ; i++) {
            if(i%11 != 0)
            {
                if(i%3 == 0)
                {
                    if(i%5==0)
                    {
                        System.out.print("CozaLoza ");
                    }
                    else if(i%7==0)
                    {
                        System.out.print("CozaWoza ");
                    }
                    else
                    {
                        System.out.print("Coza ");
                    }
                }
                else if(i%5==0)
                {
                    if(i%7==0)
                    {
                        System.out.print("LozaWoza ");
                    }
                    else
                    {
                        System.out.print("Loza ");
                    }
                }
                else if(i%7==0){
                    System.out.print("Woza ");
                }
                else {
                    System.out.print(i+" ");
                }
            }
            else
            {
                System.out.println(i+"\n");
            }
        }
    }

}
