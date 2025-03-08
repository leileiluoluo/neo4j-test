package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MergeServiceTest {

    @Autowired
    private MergeService mergeService;

    @Test
    public void test() {
        mergeService.merge();
    }

}
