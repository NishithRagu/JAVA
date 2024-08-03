import java.util.Scanner;
public class reverseLoop {
    public static void main(String[] args) {
        
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num !");
        n = s.nextInt();

        int sol = 0;

        while(n>0){
            sol = (sol*10) + (n % 10);
            n /= 10;
        }
        System.out.println(sol);
    }
}
