package com.example.demo.mapper;

import com.example.demo.model.graph.Movie;
import com.example.demo.model.relational.Blog;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    @Mapping(source = "blog.name", target = "name")
    Movie mergeBlog(Blog blog);

}
