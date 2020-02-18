/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;

/**
 *
 * @author Niko
 */
public class AnimalSeriviceImpl implements AnimalService {

    @Getter
    private static List<Animal> animalList = new ArrayList();

    @Override
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    @Override
    public void deleteAnimal(int index) {
        animalList.remove(index);
    }

    @Override
    public void printAllAnimalSelection() {
        int index = -1;
        System.out.format("+--------+--------------------------------------------------+%n");
        System.out.format("| ID     | ANIMAL INFO                                      |%n");
        System.out.format("+--------+--------------------------------------------------+%n");
        for (Animal animal : animalList) {
            index++;
            String leftAlignFormat = "| %-6d | %-48s |%n";

            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.format(leftAlignFormat, index, dog.toString().replace("(", ", ").replace(")", ""));
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                System.out.format(leftAlignFormat, index, fish.toString().replace("(", ", ").replace(")", ""));
            }
            System.out.format("+--------+--------------------------------------------------+%n");
        }
    }

    @Override
    public Animal getAnimalByName(String name) {
        for (Animal animal : animalList) {
            if (animal.getName().contentEquals(name)) {
                return animal;
            }
        }
        return null;

    }

}
