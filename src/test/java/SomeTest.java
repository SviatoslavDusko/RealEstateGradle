import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

@Test
public class SomeTest extends BaseTest {
    private static final Logger logger = Logger.getGlobal();

    @Test
    public void doSomething() {
        logger.info("beforeDoSomethingAssert");
        Assert.assertTrue(false);
    }
}
