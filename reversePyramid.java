public class reversePyramid {
    public static void main(String[] args) {
        
        int i;
        int j;

        for (i = 4; i>0; i--){
            for (j = 1; j<=i; j++){
                System.out.print("@");
            }
            System.out.println();
            
        }
    }
}
