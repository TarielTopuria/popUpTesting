package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsPage {
    WebDriver driver;
    protected By jsAlert = By.cssSelector("#content > div > ul > li:nth-child(1) > button");
    protected By jsConfirm = By.cssSelector("#content > div > ul > li:nth-child(2) > button");
    protected By jsPrompt = By.cssSelector("#content > div > ul > li:nth-child(3) > button");

    public AlertsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickJsAlert (){
        driver.findElement(jsAlert).click();
    }

    public void acceptJsAlert(){
        driver.switchTo().alert().accept();
    }

    public void clickJsConfirm (){
        driver.findElement(jsConfirm).click();
    }

    public void acceptJsConfirm(){
        driver.switchTo().alert().accept();
    }

    public void dismissJsConfirm(){
        driver.switchTo().alert().dismiss();
    }

    public void clickJsPrompt (){
        driver.findElement(jsPrompt).click();
    }

    public void acceptJsPrompt(String text){
        driver.switchTo().alert().sendKeys(text);
        driver.switchTo().alert().accept();
    }
}
