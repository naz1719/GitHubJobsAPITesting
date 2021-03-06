package tests.ui;

import adaptation.ui.driver.WebDriverManager;
import definition.ui.bo.FrontBO;
import execution.BaseUITest;
import execution.injector.Injector;
import features.SuiteParam;
import features.wait.DelaySteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static definition.constants.CommonConsts.WEB_SITE_URL;

public class LoginCheckTest extends BaseUITest {

    @Test
    public void testGoogleSearch(ITestContext context) throws InterruptedException {
        FrontBO frontBO = new FrontBO();

        String country = context.getSuite().getParameter(SuiteParam.country.name());

        frontBO.openPortal(WEB_SITE_URL);
        WebElement webElement = WebDriverManager.getDriver().findElement(By.name("q"));
        waitManager.fluentElementWait(webElement);
        webElement.sendKeys("Hey " + country);
        webElement.submit();

        DelaySteps.getInstance().delayStep(4);

//        frontBO
//                .clickOnBuildingBlocks();

    }
}
