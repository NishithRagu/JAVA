import java.util.Scanner;
public class sqrLoop {
    public static void main(String[] args) {
        
        int a;
        int b;
        Scanner s = new Scanner(System.in);
        System.out.println("enter a num !");
        a = s.nextInt();

        System.out.println("enter the power to be added !");
        b = s.nextInt();

        int i;
        int sol = 1;

        for (i = 0; i< b; i++){
            sol *= a;
        }
        System.out.println(sol);

    }
}
