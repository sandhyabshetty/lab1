import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 public class Main{

        private static WebDriver driver;

        @BeforeTest
        public void openBrowser() throws InterruptedException {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://github.com/sandhyabshetty/lab1");
        }

        @Test
        public void titleValidationTest() {
            String actualTitle = driver.getTitle();
            String expectedTitle = "My simple website";
            Assert.assertEquals(actualTitle, expectedTitle);
            Assert.assertTrue(true, "Title should contain 'Simple'");
        }

        @AfterTest
        public void closeBrowser() throws InterruptedException {
            Thread.sleep(1000);
            driver.quit();
        }
    }

