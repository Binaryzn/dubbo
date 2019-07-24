package com.zheng.nie.spi.java;

import com.alibaba.dubbo.common.extension.SPI;

/**
 * @author: niezheng1
 * @Date: 2019/7/22 17:26
 */
@SPI
public interface Robot {
    void sayHello();
}
