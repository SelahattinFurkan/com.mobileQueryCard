package Hooks;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
    private AppiumDriverLocalService service;
    private final int port = 4723;

    @Before
    public void startAppiumServer() {
        service = new AppiumServiceBuilder()
                .usingPort(port)
                .withArgument(GeneralServerFlag.LOG_LEVEL, "error")
                .build();
        service.start();
        System.out.println("Appium Server started");
    }

    @After
    public void stopAppiumServer() {
        if (service != null) {
            service.stop();
            System.out.println("Appium Server stopped");
        }
    }
}