import java.util.Scanner;

public class ArraySumUserInput {
    public static void main(String[] args) {
        int[] arr = new int[5]; // create an integer array with five elements
        Scanner input = new Scanner(System.in); // create a scanner object

        System.out.println("Enter five interger values to fill the array:");
        
        // promt the user to enter 5 integer values to fill the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter Value #" + (i+1) + ": ");
            arr[i] = input.nextInt(); 
        }

        int sum = 0;    // initialize a variable to hold the sum of the array's value

        // use a for loop to iterate through each element of the array and add it to the sum
        for (int i = 0; i < arr.length; i++);
            sum += arr[i];
        }

        System.out.println("The sum of the array's values is: " + sum); // print the sum of the array's values
    }}
