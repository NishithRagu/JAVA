import java.util.Scanner;
public class factorialLoops {
    public static void main(String args[]) {

        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the number !");
        n = s.nextInt();
        
        
        int i;
        int sol = 1;
        

        for (i = 1; i<= n; i++){
            
         sol *= i;   
            
        }
        System.out.println(sol);
    }
}
