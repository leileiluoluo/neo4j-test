package com.example.demo.repository.relational;

import com.example.demo.model.relational.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, String> {

    Blog findByName(String name);

}
