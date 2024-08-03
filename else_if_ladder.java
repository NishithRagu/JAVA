import java.util.Scanner;
public class else_if_ladder {
    public static void main(String[] args) {
        
        int mark;

        Scanner obj = new Scanner(System.in);
        System.out.println("enter your mark:");
        mark = obj.nextInt();

        if (mark >= 90){
            System.out.println("you have scored A grade !");
        }
        else if (mark >= 80){
            System.out.println("you have score B grade !");
        }
        else if (mark >= 70){
            System.out.println("you have scored C grade !");
        }
            else if (mark >= 50){
                System.out.println("you have scored D grade !");
            }
        
        else {
            System.out.println("you have failed !");
        
        }

    }
}

