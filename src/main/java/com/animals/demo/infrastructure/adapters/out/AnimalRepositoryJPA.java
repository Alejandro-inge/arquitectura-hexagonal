/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.out;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
    private Logger log = LoggerFactory.getLogger(AnimalRepositoryJPA.class);

    public AnimalRepositoryJPA(JPAAnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Animal> getAnimal() {
        log.info("Consulting information...");
        return repository.findAll().stream().map(Mapper::toDomain).collect(Collectors.toList());
    }

    @Override
    public Animal saveAnimal(Animal animal) {
        log.info("Processing request for {}", animal.getSpecie());
        AnimalEntity entity = Mapper.toEntity(animal);
        Animal createdAnimal = Mapper.toDomain(repository.save(entity));
        log.info("Resgister for {} has been created successfully", animal.getSpecie());
        return createdAnimal;
    }

    @Override
    public void deleteAnimal(Long id) {
        log.info("Processing delete request for id: {}", id);
        repository.deleteById(id);
        log.info("Register with id: {} has been deleted successfully", id);
    }

}
