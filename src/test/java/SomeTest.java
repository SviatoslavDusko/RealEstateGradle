import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SomeTest extends BaseTest{
    @Test
    public void doSomething(){
        System.out.println("bAssert");
        Assert.assertTrue(true);
        System.out.println("someTExt");
        System.out.println("aAssert");
    }
}
