public class ArraySum {
    public static void main(String[] args) {
        int[] arr = { 25, 4, 16, 9, 10 }; // declare and initialize the array with given elements
        int sum = 0; // initialize the sum to 0

        for (int i = 0; i < arr.length; i++) { // iterate through the array
            sum += arr[i]; // add each element of the array to the sum
        }

        System.out.println("The sum of the array's vaalue is: " + sum);
    }

}