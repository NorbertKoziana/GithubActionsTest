package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
class AddServiceTest {

    private final AddService addService;

    @Autowired
    AddServiceTest(AddService addService) {
        this.addService = addService;
    }

    @Test
    void addIntegers() {
        int result = addService.addIntegers(2, 8);

        assertEquals(result, 10);
    }
}