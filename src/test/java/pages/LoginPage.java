package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    By username = By.cssSelector("#user-name");
    By password = By.cssSelector("#password");
    By login = By.cssSelector("#login-button");

    /**
     * Use this method to login to app with valid username and password
     * @param usernameValue username
     * @param passwordValue password
     */

    public void login(String usernameValue, String passwordValue){
     enterUsername(usernameValue);
     enterPassword(passwordValue);
     clickLogin();
    }

    public void enterUsername(String usernameValue){
        driver.findElement(username).sendKeys(usernameValue);
    }

    public void enterPassword(String passwordValue){
        driver.findElement(password).sendKeys(passwordValue);
    }

    public void clickLogin(){
        driver.findElement(login).click();
    }
}
