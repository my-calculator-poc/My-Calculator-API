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
        ids = {"org.jab.microservices:my-sum:0.1.0-SNAPSHOT"})
public class SumIntegrationTest {

    @Test
    public void noTest() {

    }

}
