import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ExampleExceptionTest {

    /**
     * Test data for positive test.
     *
     * @return test data array
     */
    @DataProvider(name = "data")
    public static Object[][] data() {
        return new Object[][]{
                {2, 2, 4},
                {2, 3, 6},
                // TODO add 2 more test data here
                {5, 4, 20},
                {1, 0, 0}  // valid corner case
        };
    }

    /**
     * Test data for exception test.
     *
     * @return test data array
     */
    @DataProvider(name = "negativeData")
    public static Object[][] negativeData() {
        return new Object[][]{
                {-2, 2},
                {2, -2},
                // TODO add 2 more test data here
                {-3, -5},
                {-2, 0}
        };
    }

    @Test(dataProvider = "data")
    public void testRectangleArea(int a, int b, int c) {
        // TODO put your code here
        assertEquals(ExampleException.rectangleArea(a, b), c, "Wrong calculated rectangle area");
    }


    @Test(dataProvider = "negativeData")
    public void testRectangleAreaNegative(int a, int b) {
        // TODO put your code here
        //// Solution #1 ////
        // using test framework method
        var e = expectThrows(IllegalArgumentException.class, () -> ExampleException.rectangleArea(a, b));
        assertTrue(e.getMessage().contains("input value is below zero!"), "Exception message is wrong: " + e.getMessage());

        //// Solution #2 ////
        // manually catch expected exception
//        try {
//            var area = ExampleException.rectangleArea(a, b);
//        } catch (IllegalArgumentException e) {
//            assertTrue(e.getMessage().contains("input value is below zero!"), "Exception message is wrong");
//            return;
//        }
//        fail("expected IllegalArgumentException is not detected");
    }
}