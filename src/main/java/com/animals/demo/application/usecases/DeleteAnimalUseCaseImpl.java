/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.application.usecases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.animals.demo.application.ports.DeleteAnimalUseCase;
import com.animals.demo.domain.ports.AnimalRepository;

/**
 *
 * @author sleepless
*/
@Service
public class DeleteAnimalUseCaseImpl implements DeleteAnimalUseCase{
    private final AnimalRepository repository;
    private Logger log = LoggerFactory.getLogger(CreateAnimalUseCaseImp.class);

    public DeleteAnimalUseCaseImpl(AnimalRepository repository) {
        this.repository = repository;
    }

    @Override
    public void execute(Long id) {
        log.info("Starting request to delete id: {}", id);
        repository.deleteAnimal(id);
    }

}
