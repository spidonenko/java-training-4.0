package example;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestNameLogger extends TestListenerAdapter {
    // Runner start
    @Override
    public void onStart(ITestContext context) {
        System.out.println("==> " + context.getClass().getName() + " -> " + context.getName());
    }
    // Setup or teardown start
    @Override
    public void beforeConfiguration(ITestResult itr) {
        System.out.println("==> " + itr.getTestClass().getName() + " -> " + itr.getName());
    }
    // Individual test start
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("==> " + result.getTestClass().getName() + " -> " + result.getName());
    }
}
