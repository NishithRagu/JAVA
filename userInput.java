import java.util.Scanner;
public class userInput{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("what is your name");
        String name = scnr.nextLine();
        System.out.println("hello"+" "+name);

        System.out.println("enter your age");
        int age = scnr.nextInt();
        System.out.println("your age is"+" "+age);
        scnr.nextLine(); /*  this scanne is for enter statement because after the integer in takes the enter as next input and store. so by creating this scanner will take this scanner as input (demo scanner)*/

        String mailID = scnr.nextLine();
        System.out.println("match found!");

    }
}