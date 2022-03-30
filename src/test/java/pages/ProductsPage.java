package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage extends BasePage {

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    String productNameXpath = "//div[@class='inventory_item_name' and contains(text(), '$$')]";
    String productPriceXpath = "//div[@class='inventory_item_name' and contains(text(), '$$')]/../../..//div[@class='inventory_item_price']";
    String productAddBtnXpath = "//div[@class='inventory_item_name' and contains(text(), '$$')]/../../..//button[text()='Add to cart']";
    String productRemoveBtnXpath = "//div[@class='inventory_item_name' and contains(text(), '$$')]/../../..//button[text()='Remove']";

    public void addProduct(String productName) throws InterruptedException {
        driver.findElement(By.xpath(productAddBtnXpath.replace("$$", productName))).click();
        Thread.sleep(500);
    }

    public void removeProduct(String productName) {
        driver.findElement(By.xpath(productRemoveBtnXpath.replace("$$", productName))).click();
    }

    public String getPrize(String productName){
        return driver.findElement(By.xpath(productPriceXpath.replace("$$", productName))).getText();

    }
}
