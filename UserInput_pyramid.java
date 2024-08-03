import java.util.Scanner;
public class UserInput_pyramid {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number");
        int py = sc.nextInt();
        System.out.println("   "+py); //1st row
        System.out.println("  "+py+py+py); //2nd row
        System.out.print(" "+py); //3rd row
        System.out.print(py);
        System.out.print(py);
        System.out.print(py);
        System.out.println(py);
        System.out.print(py); //4th row
        System.out.print(py);
        System.out.print(py);
        System.out.print(py);
        System.out.print(py);
        System.out.print(py);
        System.out.print(py);
        sc.nextInt();
        
}
}
