package uploadFile;

import baseTest.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.testng.Assert.assertTrue;

public class UploadFileFromPc extends Setup {

    @Test

    public void testUploadFileFromPc() {
        driver.findElement(By.linkText("File Upload")).click();
        WebElement fileupload = driver.findElement(By.id("file-upload"));
        fileupload.click();
        fileupload.sendKeys("C:\\Automation.txt");
        String excpectedResult = "Automation.txt";
        String actualResult= driver.findElement(By.id("uploaded-files")).getText();
        assertTrue(actualResult.contains(excpectedResult));
    }
}
