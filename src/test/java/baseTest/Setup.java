package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Setup {
    protected  WebDriver driver ;

    @BeforeClass
    public void setUP () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void goHome (){
        driver.get("https://the-internet.herokuapp.com/");
    }

    @AfterClass
    public void teardown () {
        driver.quit();
    }
}
