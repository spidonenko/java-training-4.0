import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        // // SOLUTION #1  // //
        // filter values of `array1` that can be found in `array2` at least once
        //      then remove duplicates and creates a new array of the results
        String[] common = Arrays.stream(array1).filter(i -> Arrays.stream(array2).anyMatch(i::equals))
                .distinct().toArray(String[]::new);
        return common;

        // // SOLUTION #2 // //
        // Create a Set collection that can hold only unique values
        // Convert an array to a List to have access to the `contains` method
        // Manually iterate through `array1` and if a value exist in the `array2` store it to the Set
        // Finally convert the result back to the array
//        Set<String> uniqueItems = new HashSet<>();
//        List<String> list2 = Arrays.asList(array2);
//        for (var item : array1){
//            if (list2.contains(item)){
//                uniqueItems.add(item);
//            }
//        }
//        return uniqueItems.toArray(new String[0]);
    }
}