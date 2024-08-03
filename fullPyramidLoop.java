//import java.util.Scanner;
public class fullPyramidLoop {
    public static void main(String args []) {

       /*int n;
       Scanner s = new Scanner(System.in);
       System.out.println("enter how many times you want to print the star !");
       n = s.nextInt();*/

       int i;
       int j;
       for (i = 1; i<=5; i++){
            for (j = 1; j<= 5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print("*"+" ");
            }
        
        System.out.println();
       }
      
    }
}
