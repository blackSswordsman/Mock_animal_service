package com.example.mockanimalservice;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping
public class AnimalController {
    private final AnimalService animalService;

    @GetMapping("/animals")
    public List<Animal> getAllAnimals() {
       return animalService.getRandomAnimals();
    }

}
