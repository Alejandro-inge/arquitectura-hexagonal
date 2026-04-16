/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.out;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.animals.demo.domain.model.Animal;
import com.animals.demo.domain.ports.AnimalRepository;
import com.animals.demo.shared.Mapper;

/**
 *
 * @author sleepless
 */
@Component
public class AnimalRepositoryJPA implements AnimalRepository{
    private final JPAAnimalRepository repository;

    public AnimalRepositoryJPA(JPAAnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Animal> getAnimal() {
        return repository.findAll().stream().map(Mapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        AnimalEntity entity = Mapper.toEntity(animal);
        Animal createdAnimal = Mapper.toDomain(repository.save(entity));
        return createdAnimal;
    }

}
