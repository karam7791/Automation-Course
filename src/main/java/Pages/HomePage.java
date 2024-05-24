package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {
    WebDriver driver ;


    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private final By formAuthenticationLink = By.linkText("Form Authentication");

    private final By dynamicLoadingLink = By.linkText("Dynamic Loading");

    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DynamicLoadingPage clickOnDynamicLoadingLink(){
        driver.findElement(dynamicLoadingLink).click();
        return new DynamicLoadingPage(driver);
    }
}