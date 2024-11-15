import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers).filter(i -> i % 2 == 0).map(i -> i * i).sum();
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        // TODO replace return with your code
        return Arrays.stream(numbers).filter(i -> Math.abs(i % 2) == 1).sorted().toArray();
    }
}