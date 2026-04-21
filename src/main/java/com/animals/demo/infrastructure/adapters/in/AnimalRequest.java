/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */

package com.animals.demo.infrastructure.adapters.in;

import com.animals.demo.shared.Diet;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 *
 * @author sleepless
 */
public record AnimalRequest(
    @NotBlank String specie, 
    @NotNull Diet diet, 
    @NotNull boolean isEndangered, 
    @NotNull boolean isDomesticated, 
    @NotNull boolean isExtinct) {

}
