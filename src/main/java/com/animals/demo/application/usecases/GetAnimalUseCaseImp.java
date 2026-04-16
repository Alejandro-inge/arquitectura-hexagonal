/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.application.usecases;

import java.util.List;

import org.springframework.stereotype.Service;

import com.animals.demo.application.ports.GetAnimalUseCase;
import com.animals.demo.domain.model.Animal;
import com.animals.demo.domain.ports.AnimalRepository;

/**
 *
 * @author sleepless
 */

@Service
public class GetAnimalUseCaseImp implements GetAnimalUseCase {
    private final AnimalRepository repository;

    public GetAnimalUseCaseImp(AnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Animal> execute() {
        return repository.getAnimal();
    }

}
