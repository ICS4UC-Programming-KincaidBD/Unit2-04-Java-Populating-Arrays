
/**
 * This class demonstrates populating an array with random numbers,
 * calculating the average, and displaying the array before and after sorting.
 * 
 * @author KincaidBD
 * @since 2026-10-26
 * @version 1.0
 */

import java.util.*;

public class PopulatingArrays {
    public static int[] PopulateArray() {
        Random rand = new Random();
        int[] number_array = new int[10];
        for (int i = 0; i < number_array.length; i++) {
            number_array[i] = rand.nextInt(100);
        }
        return number_array;
    }

    public static int AverageArray(int[] number_array) {
        int sum = 0;
        for (int i = 0; i < number_array.length; i++) {
            sum += number_array[i];
        }
        return sum / number_array.length;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int[] numbers = PopulateArray();
            int avg = AverageArray(numbers);
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
            java.util.Arrays.sort(numbers);
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println(" Average: " + avg);
            System.out.println();
        }
    }
}