package listners;

import com.base.BaseClass;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer extends BaseClass implements IRetryAnalyzer {

    private static final int maxRetryCount = 2; // Number of retries
    @Override
    public boolean retry(ITestResult result) {
        int currentRetryCount = retryCount.get(); // Get the value from ThreadLocal

        if (currentRetryCount < maxRetryCount) {
            retryCount.set(currentRetryCount + 1); // Increment the count
            System.out.println("Retrying test: " + result.getName() + " | Attempt: " + (currentRetryCount + 1));
            return true;
        }

        return false;
    }
}
