import java.util.Arrays;
import java.util.PrimitiveIterator;

/**
 * Compute the sum and average for running integers using loop.
 */
public class SumAverage {

    /**
     * Computes sum of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return sum of integers
     */
    public static int sum(int lowerBound, int upperBound) {
        // TODO fill in code here using for loop and replace the return statement
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++) {
            sum += i;
        }
        return sum;

        // Alternative solution for sum of continuous sequence of integers without a loop:
        //
        // return (lowerBound+upperBound) * (upperBound - lowerBound +1) / 2;
    }

    /**
     * Computes sum of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return sum of integers
     */
    public static int sum(int[] numbers) {
        // TODO fill in code here using for each loop and replace the return statement
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound.
     *
     * @param lowerBound lower bound
     * @param upperBound upper bound
     * @return average of integers
     */
    public static double average(int lowerBound, int upperBound) {
         // TODO fill in code here using while loop and replace the return statement
         if (lowerBound > upperBound){ return 0d;}
         //// Solution #1: reuse the sum function since it is already implemented
         //
         // var sum = sum(lowerBound, upperBound);
         // return (double) sum / (upperBound-lowerBound+1);

         //// Solution #2 with while loop
         int sum = 0;
         int count = 0;
         while (lowerBound <= upperBound){
             sum += lowerBound;
             lowerBound++;
             count++;
         }
         return (double) sum / count;
    }

    /**
     * Computes average of running integers from a lower bound to an upper bound within an array.
     *
     * @param numbers running integers array
     * @return average of integers
     */
    public static double average(int[] numbers) {
        // TODO fill in code here using do-while loop and replace the return statement
        if (numbers == null || numbers.length == 0){ return 0d;}
        //// Solution #1: reuse the sum function since it is already implemented
        //
        // var sum = sum(numbers);
        // return (double) sum / numbers.length;

        //// Solution #2 with do-while loop
        int sum = 0;
        PrimitiveIterator.OfInt iterator = Arrays.stream(numbers).iterator();
        do {
            sum += iterator.nextInt();
        } while (iterator.hasNext());
        return (double) sum / numbers.length;
    }
}