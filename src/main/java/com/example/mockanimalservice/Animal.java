package com.example.mockanimalservice;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Animal {
    private String species;
    private String name;
    private int age;
}
