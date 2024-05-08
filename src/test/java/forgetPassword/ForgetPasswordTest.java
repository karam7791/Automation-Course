package forgetPassword;

import baseTest.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ForgetPasswordTest  extends Setup {

    @Test
    public void testForgetPassword () {
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.id("email")).sendKeys("a_karam_91@live.com");
        driver.findElement(By.xpath("//*[@id=\"form_submit\"]/i")).click();
        String forgetpassowrd = driver.findElement(By.cssSelector("body > h1")).getText();
        String excpectedResult = "Internal Server Error";
        assertTrue(forgetpassowrd.contains(excpectedResult));

    }
}
