package com.example.bootsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;

@SpringBootApplication
public class BootSecurityApplication {

    static Logger logger = LoggerFactory.getLogger(BootSecurityApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(BootSecurityApplication.class, args);

        SpringApplication app = new SpringApplication(BootSecurityApplication.class);


        app.run(args);

        logger.trace("跟踪");
        logger.debug("调试");
        logger.info("信息");
        logger.warn("警告");
        logger.error("异常");
    }

}
