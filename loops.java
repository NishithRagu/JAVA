import java.util.Scanner;
 class loops {
    public static void main(String args[]){
        
        /*for loop
        int n;
        for(n = 1; n<=10; n++){
            System.out.println(n);
        }
        
        System.out.println("outside of the loop is" + " " + n);  */


        /* while loop
        int n = 1;
        while(n<=5){
            System.out.println(n);
            n++;
        }*/

            /* 
            int n = 1;
            do{
                System.out.println(n);
                n++;
            } while(n<=5); */

            int n;
            
            Scanner sc = new Scanner(System.in);
            System.out.println("how many times do you want to print the star !");
            n = sc.nextInt();

            
            int i = 1;
            while (i<=n){
                System.out.println("*");
                i++;
            }
    }
}

