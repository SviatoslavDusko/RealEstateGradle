import org.testng.Assert;
import org.testng.annotations.Test;

public class SomeTest extends BaseTest{
    @Test
    public void doSomething(){
        System.out.println("bAssert");
        Assert.assertTrue(false);
        System.out.println("aAssert");
    }

}
