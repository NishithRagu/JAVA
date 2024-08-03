import java.util.Scanner;
public class switch_statement {
    public static void main(String[] args) {
        
        int a,b;
        Scanner bag = new Scanner(System.in);
        System.out.println("enter the first number:");
        a = bag.nextInt();
        System.out.println("enter the second number:");
        b = bag.nextInt();

        char operator;
        System.out.println("enter the opertor +,-,*,/ or % :");
        operator = bag.next().charAt(0);

        switch(operator) {
            case '+' :
            System.out.println(a + "+" + b + "=" + (a+b));
            break;

            case '-' :
            System.out.println(a + "-" + b + "=" + (a-b));
            break;

            case '*' :
            System.out.println(a + "*" + b + "=" + (a*b));
            break;

            case '/' :
            System.out.println(a + "/" + b + "=" + (a/b));
            break;

            case '%' :
            System.out.println(a + "%" + b + "=" + (a%b));
            break;

            default:
            System.out.println("invalid operator");
        }

        

    }
}
