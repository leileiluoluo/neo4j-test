package com.example.demo.service.impl;

import com.example.demo.mapper.MovieMapper;
import com.example.demo.model.graph.Movie;
import com.example.demo.model.relational.Blog;
import com.example.demo.repository.graph.MovieRepository;
import com.example.demo.repository.relational.BlogRepository;
import com.example.demo.service.MergeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MergeServiceImpl implements MergeService {

    @Autowired
    private BlogRepository blogRepository;
    @Autowired
    private MovieMapper mapper;
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public void merge() {
        Blog blog = blogRepository.findByName("1900");
        Movie movie = mapper.mergeBlog(blog);

        movieRepository.save(movie);
    }
}
