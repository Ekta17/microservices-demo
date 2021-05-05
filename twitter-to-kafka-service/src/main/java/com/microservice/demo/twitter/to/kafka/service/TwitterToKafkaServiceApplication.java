package com.microservice.demo.twitter.to.kafka.service;

import com.microservice.demo.twitter.to.kafka.service.config.TwitterToKafkaServiceConfigData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class TwitterToKafkaServiceApplication implements CommandLineRunner {

    private static final Logger LOG = LoggerFactory.getLogger(TwitterToKafkaServiceApplication.class);

    //Prefer constructor injection over field injection using Autowired as it favors immutability using final keyword
    //and forces object creation with the injected object & no reflection & No @Autowired annotation is required.
    //Reflection resolution slows down the application as the dependencies are resolved at runtime
    /*private final TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;
    public TwitterToKafkaServiceApplication(TwitterToKafkaServiceConfigData configData) {
        this.twitterToKafkaServiceConfigData = configData;
    }*/

    @Autowired
    private TwitterToKafkaServiceConfigData twitterToKafkaServiceConfigData;

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
        LOG.info("App starts...");
        LOG.info(twitterToKafkaServiceConfigData.getWelcomeMessage());
        LOG.info(Arrays.toString(twitterToKafkaServiceConfigData.getTwitterKeywords().toArray(new String[] {})));
    }
}
