import java.util.Scanner;
public class arrayLoops {
    public static void main(String[] args) {
      
        
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 6 random numbers:");
        
        for (int i = 0; i<arr.length; i++){
            arr[i] = 1sc.nextInt();
            
        }

       
        for (int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
}