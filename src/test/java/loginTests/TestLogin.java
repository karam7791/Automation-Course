package loginTests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.SecureAreaPage;
import baseTest.Setup;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class TestLogin extends Setup {
    @Test (priority = 1)
   public void testLoginValidCredentials()  {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertusername("tomsmith");
        loginPage.insertpassword("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickloginbutton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult = "You logged into a secure area!";
        assertTrue(actualResult.contains(expectedResult));

    }


@Test (priority = 2)
    public void testInvalidUsername () {

    LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
    loginPage.insertusername("dsafads");
    loginPage.insertpassword("SuperSecretPassword!");
    SecureAreaPage secureAreaPage = loginPage.clickloginbutton();
    String actualResult = secureAreaPage.getValidationMessage();
    String expectedResult = "Your username is invalid!";
    assertTrue(actualResult.contains(expectedResult));

    }

    @Test (priority = 3)
        public void testInvalidPassword () {

        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertusername("tomsmith");
        loginPage.insertpassword("fasdf");
        SecureAreaPage secureAreaPage = loginPage.clickloginbutton();
        String actualResult = secureAreaPage.getValidationMessage();
        String expectedResult = "Your password is invalid!";
        assertTrue(actualResult.contains(expectedResult));

    }
    }


