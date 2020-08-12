import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.logging.Logger;

public class BaseTest {
    private static final Logger logger = Logger.getGlobal();

    @BeforeMethod
    public void before() {
        logger.info("Before Method");
        System.out.println("Before");
    }

    @AfterMethod
    public void after() {
        logger.info("After Method");
        System.out.println("After");
    }
}
