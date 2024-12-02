package example;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

// 5. Create third test class named 'TestClassThree'
//      where test methods are executed from the bottom to the top using priorities
@Listeners(TestNameLogger.class)
public class TestClassThree {
    @Test(priority = 3)
    public void test_31_third(){
        System.out.println(">Test-31 (3rd)");
        Assert.assertTrue(true, "Wrong increment!");
    }@Test(priority = 2)
    public void test_32_second(){
        System.out.println(">Test-32 (2nd)");
        Assert.assertTrue(true, "Wrong increment!");
    }@Test(priority = 1)
    public void test_33_first(){
        System.out.println(">Test-33 (1st)");
        Assert.assertTrue(true, "Wrong increment!");
    }
}
