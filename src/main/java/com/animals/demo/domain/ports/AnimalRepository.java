/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.animals.demo.domain.ports;

import java.util.List;

import com.animals.demo.domain.model.Animal;
import com.animals.demo.infrastructure.adapters.out.AnimalResponse;

/**
 *
 * @author sleepless
 */
public interface AnimalRepository {
    List<AnimalResponse> getAnimal();
    AnimalResponse saveAnimal(Animal animal);
    void deleteAnimal(Long id);
    void updateAnimal(Animal animal);
}
