package checkBoxes;

import baseTest.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckAndUncheckBoxes extends Setup {

    @Test (priority = 1)
    public void testCheckBoxChecked() {
        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.id("checkboxes")).click();
        WebElement firstcheckbox = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
        firstcheckbox.click();
        assertTrue(firstcheckbox.isSelected());

        
    }



    @Test (priority = 2)
    public void testCheckBoxUnChecked() {
        driver.findElement(By.linkText("Checkboxes")).click();
        driver.findElement(By.id("checkboxes")).click();
        WebElement secondcheckbox = driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
        secondcheckbox.click();
        assertFalse(secondcheckbox.isSelected());
    }
}
