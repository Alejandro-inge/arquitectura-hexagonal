/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.animals.demo.domain.ports;

import java.util.List;

import com.animals.demo.domain.model.Animal;

/**
 *
 * @author sleepless
 */
public interface AnimalRepository {
    List<Animal> getAnimal();
    Animal saveAnimal(Animal animal);
}
