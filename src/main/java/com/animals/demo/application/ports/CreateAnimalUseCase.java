/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.animals.demo.application.ports;

import com.animals.demo.application.AnimalCommand;
import com.animals.demo.infrastructure.adapters.out.AnimalResponse;

/**
 *
 * @author sleepless
 */
public interface CreateAnimalUseCase {
    AnimalResponse execute(AnimalCommand command);
}
