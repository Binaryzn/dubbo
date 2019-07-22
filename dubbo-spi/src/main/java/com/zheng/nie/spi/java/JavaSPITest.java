package com.zheng.nie.spi.java;


import org.junit.Test;

import java.util.ServiceLoader;

/**
 * @author: niezheng1
 * @Date: 2019/7/22 17:32
 */
public class JavaSPITest {

    @Test
    public void sayHello() throws Exception {
        ServiceLoader<Robot> serviceLoader = ServiceLoader.load(Robot.class);
        System.out.println("Java SPI");
        serviceLoader.forEach(Robot::sayHello);
    }

}
