/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Niko
 */
abstract class Animal {

    @Getter
    @Setter
    private String name, kingdom;

    @Getter
    private String animalType;

    @Getter
    @Setter
    private boolean isMammal;

    @Getter
    @Setter
    private int numberOfFeet;

    public abstract void theAnimalSays();

}
