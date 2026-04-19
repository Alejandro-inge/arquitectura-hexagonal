/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.application.usecases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.animals.demo.application.ports.CreateAnimalUseCase;
import com.animals.demo.domain.model.Animal;
import com.animals.demo.domain.ports.AnimalRepository;

/**
 *
 * @author sleepless
 */

@Service
public class CreateAnimalUseCaseImp implements CreateAnimalUseCase{
    private final AnimalRepository repository;
    private Logger log = LoggerFactory.getLogger(CreateAnimalUseCaseImp.class);

    public CreateAnimalUseCaseImp(AnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public Animal execute(Animal animal) {
        log.info("Starting request for {}", animal.getSpecie());
        return repository.saveAnimal(animal);
    }

}
