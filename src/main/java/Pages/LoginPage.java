package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By usernamefield = By.id("username");
    private final By passwordfield = By.id("password");
    private final By loginbutton = By.className("radius");

    public void insertusername (String username)
    {
        driver.findElement(usernamefield).sendKeys(username);
    }

    public void insertpassword (String password )
    {
        driver.findElement(passwordfield).sendKeys(password);
    }

    public SecureAreaPage clickloginbutton ()
    {
        driver.findElement(loginbutton).click();
        return new SecureAreaPage (driver);
    }

}