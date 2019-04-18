package tests.rest;

import definition.rest.dto.CurrentDateTimeResponse;
import definition.rest.service.GetTimeService;
import execution.BaseAPITest;
import execution.logger.AllureLogger;
import features.SuiteParam;
import org.testng.ITestContext;
import org.testng.annotations.Test;

public class DateTimeTest extends BaseAPITest {

    @Test
    public void dateTest(ITestContext context) {
        String country = context.getSuite().getParameter(SuiteParam.country.name());

        CurrentDateTimeResponse currentDateTimeResponse = GetTimeService.getInstance().getCurrentTime();
        AllureLogger.logInfo("Current time : [" + currentDateTimeResponse.getCurrentDateTime() + "]");
    }
}
