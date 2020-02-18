/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Niko
 */
@ToString
public class Dog extends Animal {

    @Getter
    @Setter
    private String breed;

    @Getter
    @Setter
    private char size;

    public Dog(String paramBreed, char paramSize) {
        super.setName("Dog");
        super.setMammal(true);
        super.setKingdom("Animalia");
        super.setNumberOfFeet(4);
        this.breed = paramBreed;
        this.size = paramSize;

    }

    @Override
    public void theAnimalSays() {
        System.out.println("Ruff!");
    }

}
