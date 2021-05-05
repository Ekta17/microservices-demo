package com.microservice.demo.twitter.to.kafka.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TwitterToKafkaServiceApplication.class, args);
    }

    /**
     * this method is called once after the Spring bean is created
     * as by default spring beans are created with Singleton strategy by default but you can change it
     */
    /*@PostConstruct
    public void init(){

    }*/

    @Override
    public void run(String... args) throws Exception{
        System.out.println("App starts...");
    }
}
