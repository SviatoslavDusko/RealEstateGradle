import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;

public class BaseTest {
    @BeforeMethod
    public void before(){
        System.out.println("Before");
    }
    @AfterMethod
    public void after(){
        System.out.println("After");
    }
}
