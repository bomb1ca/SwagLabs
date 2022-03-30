package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {
    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    By menu = By.cssSelector("#react-burger-menu-btn");

     public void openMenu(){
        driver.findElement(menu).click();
     }
}
