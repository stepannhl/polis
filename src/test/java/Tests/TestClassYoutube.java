package Tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassYoutube {
    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ok.ru/");
    }
    @Test
    public void userLogin(){

        WebElement search = driver.findElement(By.name("st.email"));

        search = driver.findElement(By.name("st.password"));

        

    }

    @AfterClass
    public static void tearDown(){
        driver.get("https://ok.ru/messages/576606610465");

    }

}
