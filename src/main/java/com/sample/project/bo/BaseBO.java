package com.sample.project.bo;

import com.sample.project.po.BasePO;
import com.sample.project.testUtils.TestLogger;
import com.sample.project.utils.WaitManager;
import com.sample.project.core.driver.WebDriverManager;

public abstract class BaseBO {
    protected WaitManager waitManager = new WaitManager();
    protected TestLogger LOG = TestLogger.getLogger();
    private BasePO basePO;

    public BaseBO() {
        basePO = new BasePO();
    }

    public void openPortal(String url) {
        WebDriverManager.getUrl(url);
    }

    public void error(String message) {
        LOG.error(message);
    }

    public void step(String message) {
        LOG.info(message);
    }
}
