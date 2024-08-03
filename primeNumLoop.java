import java.util.Scanner;
public class primeNumLoop {
    public static void main(String[] args) {
        
        int i;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();  
        
        boolean isprime = true;
        

        for (i = 2; i<n/2 ; i++){
            
            if (n % i == 0) {
                    isprime = false;
                    System.out.println("num is not a prime");
                    break;
            }
           
        }

        if (isprime) {
            System.out.println("num is prime");
        }

    }
}
