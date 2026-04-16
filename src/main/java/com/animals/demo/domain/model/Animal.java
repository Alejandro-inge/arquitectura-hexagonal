/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.domain.model;

import com.animals.demo.shared.Diet;

/**
 *
 * @author sleepless
 */
public class Animal {
    private final String specie;
    private final Diet diet;
    private boolean isEndangered;
    private boolean isDomesticated;
    private boolean isExtinct;

    public Animal(String specie, Diet diet, boolean isEndangered, boolean isDomesticated, boolean isExtinct) {
        this.specie = specie;
        this.diet = diet;
        this.isEndangered = isEndangered;
        this.isDomesticated = isDomesticated;
        this.isExtinct = isExtinct;
    }

    public String getSpecie() {
        return specie;
    }

    public Diet getDiet() {
        return diet;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean isEndangered) {
        this.isEndangered = isEndangered;
    }

    public boolean isDomesticated() {
        return isDomesticated;
    }

    public void setDomesticated(boolean isDomesticated) {
        this.isDomesticated = isDomesticated;
    }

    public boolean isExtinct() {
        return isExtinct;
    }

    public void setExtinct(boolean isExtinct) {
        this.isExtinct = isExtinct;
    }
    
}
