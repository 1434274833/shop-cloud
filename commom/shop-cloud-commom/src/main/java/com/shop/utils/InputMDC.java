package com.shop.utils;

import org.slf4j.MDC;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

public class InputMDC implements EnvironmentAware {
    private static Environment environment;

    @Override
    public void setEnvironment(Environment environment) {
        InputMDC.environment = environment;
    }

    public static void putMDC() {
        MDC.put("hostName", NetUtil.getLocalHostName());
        MDC.put("ip", NetUtil.getLocalIp());
        MDC.put("applicationName", environment.getProperty("spring.application.name"));
    }
}
