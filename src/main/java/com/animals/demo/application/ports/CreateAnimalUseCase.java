/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.animals.demo.application.ports;

import com.animals.demo.domain.model.Animal;

/**
 *
 * @author sleepless
 */
public interface CreateAnimalUseCase {
    Animal execute(Animal animal);
}
