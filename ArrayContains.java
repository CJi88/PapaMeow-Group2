public class ArrayContains {
    public static void main(String[] args) {
        int[] arr = { 3, 7, 12, 6, 18 }; // declare and initialize the array with five elements
        int valueToCheck = 6; // the value we want to check if it's in the array

        boolean containsValue = false; // Initialize a boolean variable to keep track if the value is found

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == valueToCheck) { // If the value is found in the array, set the containsValue to true
                break; // break out of the loop since we don't need to check the rest of the elements
            }
        }

        if (containsValue) { // check the boolean variable to see if the vaalue was found
            System.out.println("The array contains the value " + valueToCheck);
        } else {
            System.out.println("The array does not contain the value " + valueToCheck);
        }
    }
}