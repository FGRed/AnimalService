/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

/**
 *
 * @author Niko
 */
public interface AnimalService {

    public void addAnimal(Animal animal);

    public void deleteAnimal(int index);

    public void printAllAnimalSelection();

    public Animal getAnimalByName(String name);

}
