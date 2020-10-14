import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /* *** Write a program to sum all the values of a given Array *** */
        /*
         * // Generate array of 20 random numbers between 0-10 ArrayList<Integer>
         * intArray = new ArrayList<Integer>(); for (int i = 0; i < 20; i++) { Random
         * random = new Random(); intArray.add(random.nextInt(10)); }
         * 
         * int intArraySum = 0; // Sum variable
         * 
         * // Loop through array and add each index for (int index : intArray) {
         * intArraySum = intArraySum + intArray.get(index); }
         * System.out.println(intArraySum); // Print the sum
         */

        /* *** Explain output of this code *** */
        /*
        double[] exampleArray = { 1, 5, 6, 5, 4, 1 };
        double maximum = exampleArray[0]; // Set the maximum value of the array to the first index initially
        int index = 0; // Variable to store the integer index value of the array's highest number
        for (int i = 1; i < exampleArray.length; i++) {
            if (exampleArray[i] > maximum) {
                maximum = exampleArray[i]; // Update maximum value if greater than prior maximum
                index = i; // Store the current index, which is the index of the highest number in the array
            }
        }
        System.out.println(index);
        */
        /*
            The output of the code is 2. This is because the code calculates the maximum value in the array, and then prints the INDEX of that value. 
        */
    }

    /*
     * public static int[] toPower(int size, int power) {
     * 
     * }
     */
}
