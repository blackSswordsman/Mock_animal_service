package com.example.mockanimalservice;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@RequiredArgsConstructor
@Service
public class AnimalService {
    private final List<String> speciesList = List.of("Cat", "Dog", "Snake", "Cow", "Lizard", "Turtle", "Mouse", "Parrot", "Spider", "Hamster");
    private final List<String> namesList = List.of("Whiskers", "Rover", "Slither", "Daisy", "Spike", "Shelly", "Squeaky", "Polly", "Webber", "Barry");
    private final Random random = new Random();

    public List<Animal> getRandomAnimals() {
        int animalCount = random.nextInt(11);
        List<Animal> result = new ArrayList<>();
        for (int i = 0; i < animalCount; i++) {
            result.add(getRandomAnimal());
        }
        return result;
    }

    public Animal getRandomAnimal() {
        String species = speciesList.get(random.nextInt(speciesList.size()));
        String name = namesList.get(random.nextInt(namesList.size()));
        int age = random.nextInt(30);
        return  new Animal(species,name,age);

    }

}





