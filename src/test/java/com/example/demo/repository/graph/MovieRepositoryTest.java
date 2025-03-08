package com.example.demo.repository.graph;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MovieRepositoryTest {

    @Autowired
    private MovieRepository movieRepository;

    @Test
    public void testFindByName() {
        movieRepository.findByName("太极宗师");
    }

}
