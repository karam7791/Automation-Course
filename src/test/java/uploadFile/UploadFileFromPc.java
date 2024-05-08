package uploadFile;

import baseTest.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class UploadFileFromPc extends Setup {

    @Test

    public void testUploadFileFromPc() throws InterruptedException {
        driver.findElement(By.linkText("File Upload")).click();
        WebElement fileupload = driver.findElement(By.id("file-upload"));
        fileupload.sendKeys("C:\\Automation.txt");
        driver.findElement(By.id("file-submit")).click();
        String excpectedResult = "Automation.txt";
        String actualResult= driver.findElement(By.id("uploaded-files")).getText();
        assertTrue(actualResult.contains(excpectedResult));
    }
}
