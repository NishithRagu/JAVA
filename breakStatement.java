import java.util.Scanner;
public class breakStatement {
    public static void main(String[] args) {
        
   /*   break statement
   
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        n = sc.nextInt();

        while(n>=0){
            if (n%10==0){
                System.out.println(n);
                break;
            }
            n--;    
        }*/


 /*     double n;
        double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the -ve number to stop the loop!");

        while (true){
            n = sc.nextDouble();
            if (n< 0.0){
                break;
            }
            sum += n;

        }
        System.out.println("sum is" + " " + sum);*/


        int i,j;

        OuterLoop: //labelling
        for (i = 1; i<=5; i++) {
            
            InnerLoop: //labelling
            for (j = 1; j<=5; j++){
                System.out.print("*");
                if (i==3 && j==3)
            //  break;                  // this will only cancel the inner loop because the break stmnt is inside inner loop;
                break OuterLoop;        // this wil break the loop which we will specifies;              
            }
            System.out.print("\n");
        }
    }
}