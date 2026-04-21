/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

package com.animals.demo.application.ports;

import java.util.List;

import com.animals.demo.infrastructure.adapters.out.AnimalResponse;

/**
 *
 * @author sleepless
 */
public interface GetAnimalUseCase {
    List<AnimalResponse> execute();
}
