import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        /* Write a program to sum all the values of a given Array */
        // Generate array of 20 random numbers between 0-10
        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            Random random = new Random();
            intArray.add(random.nextInt(10));
        }

        int intArraySum = 0; // Sum variable

        // Loop through array and add each index
        for (int index : intArray) {
            intArraySum = intArraySum + intArray.get(index);
        }
        System.out.println(intArraySum); // Print the sum
    }

    /*
    public static int[] toPower(int size, int power) {

    }
    */
}
