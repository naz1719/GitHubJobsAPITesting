package com.sample.project;

import com.sample.project.bo.SampleBO;
import com.sample.core.core.injector.Injector;
import com.sample.core.testUtils.BaseTestClass;
import org.testng.annotations.Test;

import static com.sample.project.constants.CommonConsts.WEB_SITE_URL;

public class LoginCheckTest extends BaseTestClass {


    @Injector
    private
    SampleBO sampleBO;

    @Test
    public void testCheckLogin() {
        sampleBO.openPortal(WEB_SITE_URL);
        sampleBO
                .clickOnBuildingBlocks();

    }
}
