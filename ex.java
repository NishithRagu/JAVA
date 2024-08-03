public class ex {

    static int addingDigits(int num){

            int sol = 0;

            while(num > 0) {
                sol += num % 10;
                num /= 10;
            }

            return sol ;




    }
    public static void main(String[] args) {
        int out = addingDigits(2345);
        System.out.println(out);
    }
}
