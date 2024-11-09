import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                // TODO add 2 more test data here
                {
                        new String[]{"unique_str1", "unique_str2", "same_str1", "same_str2", "same_str1", "unique_str4"},
                        new String[]{"unique_str2", "same_str2", "same_str1", "unique_str3", "same_str2"},
                        new String[]{"unique_str2", "same_str1", "same_str2"}
                },{
                        new String[]{"empty", "array", "as", "an argument", "produces", "no errors"},
                        new String[]{},
                        new String[]{}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {

        assertEquals(ArrayUtil.findCommon(array1, array2), expectedResult,
                "Common elements are not correct");
    }
}