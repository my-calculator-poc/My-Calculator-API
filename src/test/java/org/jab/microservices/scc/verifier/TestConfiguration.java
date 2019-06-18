package org.jab.microservices.scc.verifier;

import lombok.extern.slf4j.Slf4j;
import org.jab.microservices.SumRequest;
import org.jab.microservices.SumService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfiguration {

    @Primary
    @Bean
    public SumService mockedSumService() {
        return new FakeSumService();
    }
}

@Slf4j
class FakeSumService implements SumService {

    public FakeSumService() {
        LOGGER.info("Creating instance for FakeSumService");
    }

    @Override
    public Integer sum(SumRequest request) {
        LOGGER.info("Executing Sum");
        return request.getNumber1() + request.getNumber2();
    }
}
