import org.openqa.selenium.WebDriver;

public class TestMiro {
    public void method1(WebDriver driver) {
        System.out.println("Test Mira: " + driver.getTitle() + "\t" + Thread.currentThread().getId());
    }
}
