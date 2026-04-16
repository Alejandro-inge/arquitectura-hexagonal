/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.animals.demo.infrastructure.out;

import com.animals.demo.shared.Diet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 *
 * @author sleepless
 */
@Entity
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String specie;
    private Diet diet;
    private boolean isEndangered;
    private boolean isDomesticated;
    private boolean isExtinct;

    public AnimalEntity() {};

    public AnimalEntity(String specie, Diet diet, boolean isEndangered, boolean isDomesticated,
            boolean isExtinct) {
        this.specie = specie;
        this.diet = diet;
        this.isEndangered = isEndangered;
        this.isDomesticated = isDomesticated;
        this.isExtinct = isExtinct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
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
