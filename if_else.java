import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        
        // num declaration and scanner properties
        int num;

        Scanner scnr = new Scanner(System.in);
        System.out.println("enter a number:");
        num = scnr.nextInt();

        if (num>0){
            System.out.println("the number" + " " + num + " " + "you entered is valid!");
        
        }
        else {
            System.out.println("the number" + " " + num + " " +  "you entered is invalid!");
        }


    }
}
