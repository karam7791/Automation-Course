package Wait;

import Pages.DynamicLoadingPage;
import Pages.OnePage;
import Pages.TwoPage;
import baseTest.Setup;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class DynamicLoadingTests extends Setup {

    @Test
    public void testExampleOne()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        OnePage onePage = dynamicLoadingPage.clickOnExampleOneLink();
        onePage.clickOnStartButton();
        String actualResult = onePage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testExamplTwo()
    {
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingLink();
        TwoPage twoPage =dynamicLoadingPage.clickOnExampleTwoLink();
        twoPage.clickOnStartButton();
        String actualResult = twoPage.getValidationMessage();
        String expectedResult = "Hello World!";
        assertEquals(actualResult, expectedResult);
    }
}
