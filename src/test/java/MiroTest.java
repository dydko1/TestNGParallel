import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by ONUR on 03.12.2016.
 */
public class MiroTest extends BaseTest {

    @Test
    public void GOOGLE() {
        TestMiro testMiro = new TestMiro();
        System.out.println("Google Test Started! " + "Thread Id: " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.google.com");
        System.out.println("Google Test's Page title is: " + getDriver().getTitle() + " " + "Thread Id: " + Thread.currentThread().getId());
        Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Google Test Ended! " + "Thread Id: " + Thread.currentThread().getId());
        testMiro.method1(getDriver());
    }

    @Test
    public void ONET() {
        TestMiro testMiro = new TestMiro();
        System.out.println("Onet Test Started! " + "Thread Id: " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.onet.pl");
        System.out.println("Onet Test's Page title is: " + getDriver().getTitle() + " " + "Thread Id: " + Thread.currentThread().getId());
        //Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Onet Test Ended! " + "Thread Id: " + Thread.currentThread().getId());
        testMiro.method1(getDriver());
    }

    @Test
    public void WP() {
        TestMiro testMiro = new TestMiro();
        System.out.println("Wp Test Started! " + "Thread Id: " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.wp.pl");
        System.out.println("Wp Test's Page title is: " + getDriver().getTitle() + " " + "Thread Id: " + Thread.currentThread().getId());
        //Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Wp Test Ended! " + "Thread Id: " + Thread.currentThread().getId());
        testMiro.method1(getDriver());
    }

    @Test
    public void INTERIA() {
        TestMiro testMiro = new TestMiro();
        System.out.println("Interia Test Started! " + "Thread Id: " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.interia.pl");
        System.out.println("Interia Test's Page title is: " + getDriver().getTitle() + " " + "Thread Id: " + Thread.currentThread().getId());
        //Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Interia Test Ended! " + "Thread Id: " + Thread.currentThread().getId());
        testMiro.method1(getDriver());

    }

    @Test
    public void CHIP() {
        TestMiro testMiro = new TestMiro();
        System.out.println("Chip Test Started! " + "Thread Id: " + Thread.currentThread().getId());
        getDriver().navigate().to("http://www.interia.pl");
        System.out.println("Chip Test's Page title is: " + getDriver().getTitle() + " " + "Thread Id: " + Thread.currentThread().getId());
        //Assert.assertEquals(getDriver().getTitle(), "Google");
        System.out.println("Chip Test Ended! " + "Thread Id: " + Thread.currentThread().getId());
        testMiro.method1(getDriver());

    }
}