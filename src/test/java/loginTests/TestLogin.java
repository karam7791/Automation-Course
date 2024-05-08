package loginTests;

import baseTest.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestLogin extends Setup {
    @Test (priority = 1)
   public void testLoginValidCredentials() {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));
        String excpectedResult = "You logged into a secure area!";
        String actualResult= driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(excpectedResult));

    }
@Test (priority = 2)
    public void testInvalidUsername () {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText().contains("Your username is invalid!"));
        String excpectedResult = "Your username is invalid!";
        String actualResult= driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(excpectedResult));

    }

    @Test (priority = 3)
        public void testInvalidPassword () {

        driver.findElement(By.linkText("Form Authentication")).click();
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPasswor!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.xpath("//*[@id=\"flash\"]")).getText().contains("Your password is invalid!"));
        String excpectedResult = "Your password is invalid!";
        String actualResult= driver.findElement(By.id("flash")).getText();
        assertTrue(actualResult.contains(excpectedResult));


    }
    }


