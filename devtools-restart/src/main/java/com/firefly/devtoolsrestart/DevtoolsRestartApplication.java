package com.firefly.devtoolsrestart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DevtoolsRestartApplication {

    public static void main(String[] args) {

        SpringApplication.run(DevtoolsRestartApplication.class, args);
        System.out.println("restart test!");
    }

}
