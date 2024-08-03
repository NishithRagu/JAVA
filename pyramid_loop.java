import java.util.Scanner;
public class pyramid_loop{
    public static void main (String args[]){
   
       int n;
       Scanner sc = new Scanner(System.in);
       System.out.println("enter how many times to print the star:"); 
       n = sc.nextInt();
       System.out.println();



        int i;
        int j;

        for (i = 1; i <=n; i++){
            for (j = 1; j<=i; j++) {
                System.out.print("*");
            } 
            System.out.println();  
        }
        
    }
}