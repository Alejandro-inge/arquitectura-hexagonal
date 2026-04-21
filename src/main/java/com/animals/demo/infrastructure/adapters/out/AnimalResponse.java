/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.out;

import com.animals.demo.shared.Diet;

/**
 *
 * @author sleepless
 */
public record AnimalResponse(Long id, String specie, Diet diet, boolean isEndangered, boolean isDomesticated, boolean isExtinct) {

}
