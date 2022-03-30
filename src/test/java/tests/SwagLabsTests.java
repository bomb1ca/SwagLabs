package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductsPage;


public class SwagLabsTests extends BaseTest {


    @BeforeMethod
    public void setup(){
        baseSetup();
        driver.get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void tearDown(){
        baseTearDown();
    }

    @Test
    public void login() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce" );

        ProductsPage productsPage = new ProductsPage(driver);

        productsPage.addProduct("Sauce Labs Onesie");
        productsPage.addProduct("Test.allTheThings() T-Shirt (Red)");

        Assert.assertEquals(productsPage.getPrize("Sauce Labs Onesie"), "$7.99");


    }
}
