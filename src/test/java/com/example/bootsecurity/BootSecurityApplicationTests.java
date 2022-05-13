package com.example.bootsecurity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

@SpringBootTest
class BootSecurityApplicationTests {

    @Test
    void contextLoads() {

        TestRestTemplate restTemplate = new TestRestTemplate();
    }

}
