/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.shared;

import com.animals.demo.domain.model.Animal;
import com.animals.demo.infrastructure.out.AnimalEntity;

/**
 *
 * @author sleepless
 */
public class Mapper {
    public static Animal toDomain(AnimalEntity animalEntity) {
        return new Animal(animalEntity.getSpecie(), animalEntity.getDiet(), animalEntity.isEndangered(),
                animalEntity.isDomesticated(), animalEntity.isExtinct());
    }

    public static AnimalEntity toEntity(Animal animal) {
        return new AnimalEntity(animal.getSpecie(), animal.getDiet(), animal.isEndangered(), animal.isDomesticated(), animal.isExtinct());
    }
}
