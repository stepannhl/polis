package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage2 {
        private WebDriver driver;
            public LoginPage2(WebDriver driver){
               this.driver = driver;
        }
        void clickButton(){
            WebElement element = driver.findElement(By.xpath(""));
            element.click();
    }
}
