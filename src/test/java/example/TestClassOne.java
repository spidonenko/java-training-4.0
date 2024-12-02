package example;

import org.testng.annotations.*;
import org.testng.Assert;

// 3. Create a test class named 'TestClassOne' with several test groups
// 2.2 Each method has to output its name to console
@Listeners(TestNameLogger.class)
public class TestClassOne {
    // 2.1 Create a simple test with setup and teardown methods
    @BeforeClass
    public void setup() {
        System.out.println("Setup stuff here");
    }
    @AfterClass
    public void teardown() {
        System.out.println("Teardown stuff here");
    }
    // 3.2 Group precondition and teardown methods,
    //      excluding one of them from test execution (excluded in `build.gradle`)
    @BeforeGroups("group-A")
    public void before_group_A(){
        System.out.println("Group-A starts here");
    }
    @AfterGroups("group-A")
    public void after_group_A(){
        System.out.println("Group-A ends here");
    }
    @BeforeGroups("group-B")
    public void before_group_B(){
        System.out.println("Group-B starts here");
    }
    @AfterGroups("group-B")
    public void after_group_B(){
        System.out.println("Group-B ends here");
    }
    @BeforeGroups("group-C")
    public void before_group_C(){
        System.out.println("Group-C starts here");
    }
    @AfterGroups("group-C")
    public void after_group_C(){
        System.out.println("Group-C ends here");
    }

    // 3.1 Create several groups of tests
    @Test(groups = "group-A")
    public void test_A1(){
        System.out.println(">Test-A1");
        Assert.assertEquals(0,0, "Not good!");
    }
    @Test(groups = "group-A")
    public void test_A2(){
        System.out.println(">Test-A2");
        Assert.assertEquals(0,0, "Not good!");
    }
    @Test(groups = "group-A")
    public void test_A3(){
        System.out.println(">Test-A3");
        Assert.assertEquals(0,0, "Not good!");
    }
    @Test(groups = {"group-A", "group-B"})
    public void test_B1(){
        System.out.println(">Test-B1");
        Assert.assertEquals("A","A", "Not good!");
    }
    @Test(groups = {"group-A", "group-B"})
    public void test_B2(){
        System.out.println(">Test-B2");
        Assert.assertEquals("A","A", "Not good!");
    }
    // 3.2 ... excluded group below
    @Test(groups = {"group-C"})
    public void test_C1_fail(){
        System.out.println(">Test-C1");
        Assert.assertEquals(0,3, "Not good!");
    }
    @Test(groups = {"group-C"})
    public void test_C2(){
        System.out.println(">Test-C2");
        Assert.assertEquals(2,2, "Not good!");
    }
}
