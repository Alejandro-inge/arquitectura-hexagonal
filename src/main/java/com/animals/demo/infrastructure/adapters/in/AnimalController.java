/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.in;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animals.demo.application.ports.CreateAnimalUseCase;
import com.animals.demo.application.ports.GetAnimalUseCase;
import com.animals.demo.domain.model.Animal;



/**
 *
 * @author sleepless
 */
@RestController
@RequestMapping("/api/animal")
public class AnimalController {
    @Autowired GetAnimalUseCase useCase;
    @Autowired CreateAnimalUseCase createUseCase;

    @GetMapping
    public List<Animal> getAnimal() {
        return useCase.execute();
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal) {
        return createUseCase.execute(animal);
    }
    
    
}
