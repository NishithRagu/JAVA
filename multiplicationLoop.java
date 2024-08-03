import java.util.Scanner;
public class multiplicationLoop {
    public static void main(String[] args) {
        
        int n;
        int i;
        int num = 1;
        Scanner s = new Scanner(System.in);
        System.out.println("enter the positive num !");
        n = s.nextInt();

        for (i = 1; i<= 10; i++){
            num = i*n;
            
            System.out.println(i + "x" + n + "=" + num);
        }
        

    }
}
