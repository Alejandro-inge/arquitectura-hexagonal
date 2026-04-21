/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.in;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.animals.demo.application.ports.CreateAnimalUseCase;
import com.animals.demo.application.ports.DeleteAnimalUseCase;
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
    @Autowired DeleteAnimalUseCase deleteAnimalUseCase;

    private Logger log = LoggerFactory.getLogger(AnimalController.class);

    @GetMapping
    public List<Animal> getAnimal() {
        log.info("Get animals request received.");
        return useCase.execute();
    }

    @PostMapping
    public Animal saveAnimal(@RequestBody Animal animal) {
        log.info("Create {} request receved", animal.getSpecie());
        return createUseCase.execute(animal);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteAnimal(@PathVariable Long id) {
        log.info("Delete id {} request received.", id);
        deleteAnimalUseCase.execute(id);
        return ResponseEntity.ok().body("Register: " +id+ " has been deleted");
    }
}
