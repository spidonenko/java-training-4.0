package example;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

// 4. Create another test class 'TestClassTwo' with 2 parametrised test methods
@Listeners(TestNameLogger.class)
public class TestClassTwo {
    @DataProvider(name = "numbers")
    public static Object[][] text() {
        return new Object[][]{
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {5, 0} // fail
        };
    }
    // 4.1 The first method has to accept parameters from testng.xml
    //  >> to start this test with parameters from `testng.xml`
    //       run following task: `./gradlew test_gamma`
    @Test(groups = "group-gamma")
    @Parameters({"login", "password"})
    public void test_21_login(@Optional String login, @Optional String password){
        var softAssert = new SoftAssert();
        System.out.printf(">Test-21 login:%s/%s\n", login, password);
        softAssert.assertNotNull(login, "Login empty!");
        softAssert.assertNotNull(password, "Login failed!");
        softAssert.assertAll();
    }
    // 4.2 The second method has to accept parameters from a dataprovider
    @Test(dataProvider="numbers", groups = "group-gamma-2")
    public void test_22_increments(int a, int b){
        System.out.printf(">Test-22 [%d -> %d]\n", a, b);
        Assert.assertEquals(++a,b, "Wrong increment!");
    }
}
