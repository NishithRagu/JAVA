import java.util.Scanner;
public class switch_statement2 {
    public static void main(String args[]){
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: 1,2,3,4,5,6,7:");
        num = sc.nextInt();

        switch(num){
            case 1: 
            System.out.println("monday!");
            break;

            case 2:
            System.out.println("tuesday!");
            break;

            case 3:
            System.out.println("wednesday!");
            break;

            case 4:
            System.out.println("thursday!");
            break;

            case 5:
            System.out.println("friday!");
            break;

            case 6:
            System.out.println("saturday!");
            break;

            case 7:
            System.out.println("sunday");
            break;

            default :
            System.out.println("out of week!");
            break;

        }
        
    }
}
