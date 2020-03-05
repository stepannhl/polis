package Tests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage2;

import java.util.concurrent.TimeUnit;

public class TestClass{
        @Test
        public void setUp() throws Exception{
            ChromeDriver driver = new ChromeDriver();
            String BaseUrl = "https://ok.ru/";
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            LoginPage2 loginPage2 = new LoginPage2(driver);



        }


}
