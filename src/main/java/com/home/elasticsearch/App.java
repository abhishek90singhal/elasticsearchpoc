package com.home.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * Main Class to boot up the Application 
 *
 */

@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
    	 SpringApplication.run(App.class, args);
    }
    
    
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
