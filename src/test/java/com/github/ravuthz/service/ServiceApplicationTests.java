package com.github.ravuthz.service;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT;

@SpringBootTest(classes = ServiceApplication.class, webEnvironment = RANDOM_PORT)
class ServiceApplicationTests {

    @Test
    void contextLoads() {
    }

}
