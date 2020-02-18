/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import lombok.Data;
import lombok.ToString;

/**
 *
 * @author Niko
 */
@ToString
@Data
public class Fish extends Animal {

    private String species;

    private boolean isPredatorFish;

    public Fish(String paramSpecies, boolean paramIsPredatorFish) {
        this.species = paramSpecies;
        this.isPredatorFish = paramIsPredatorFish;

        super.setKingdom("Animalia");
        super.setNumberOfFeet(0);
        super.setName("Fish");
        super.setMammal(false);
    }

    @Override
    public void theAnimalSays() {
        System.out.println("...");
    }

}
