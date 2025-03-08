package com.example.demo.repository.relational;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BlogRepositoryTest {

    @Autowired
    private BlogRepository blogRepository;

    @Test
    public void testFindByName() {
        blogRepository.findByName("1900");
    }

}
