public class foreachLoop {
    public static void main(String[] args) {
        int arr[] = {2,3,4,5,6,7};
        int sum = 0;

        for(int x : arr) { //foreach loop
            sum += x;
        }

        System.out.println("sum of array is :" + sum );
    }
}
