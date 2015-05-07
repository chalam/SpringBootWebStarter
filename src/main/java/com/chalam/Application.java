package com.chalam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.joda.time.LocalTime;

/**
 * Starts Spring app and runs the war on embedded tomcat
 * java -jar build/libs/lam-rest-service-0.1.0.jar
 * or
 * gradle bootRun
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        LocalTime currentTime = new LocalTime();
        System.out.println("The joda current local time is: " + currentTime);
    }
}