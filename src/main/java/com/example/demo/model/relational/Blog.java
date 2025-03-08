package com.example.demo.model.relational;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Blog {

    @Id
    private String domainName;
    private String name;

}
