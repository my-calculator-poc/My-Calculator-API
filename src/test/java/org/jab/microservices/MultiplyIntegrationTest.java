package org.jab.microservices;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureStubRunner(
        stubsMode = StubRunnerProperties.StubsMode.REMOTE,
        repositoryRoot = "git://https://github.com/my-calculator-poc/my-calculator-contracts-center-domain1.git",
        ids = {"com.example:My-Multiply-API:0.0.1-SNAPSHOT"})
public class MultiplyIntegrationTest {

    @Test
    public void noTest() {

    }

}
