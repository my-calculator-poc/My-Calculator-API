package org.jab.microservices;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MainConfiguration {

    @Bean
    SumService sumService() {
        return new SumServiceImpl();
    }

}
