/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication65;

import java.util.Scanner;

/**
 *
 * @author Niko
 */
public class Client {

    private static final AnimalService animalSerivice = new AnimalSeriviceImpl();

    public static void main(String[] args) {
        Dog dog = new Dog("Husky", 'L');
        animalSerivice.addAnimal(dog);
        Scanner s = new Scanner(System.in);

        main_loop:
        for (;;) {
            System.out.println("***Animal service***");
            System.out.println("1) add animal");
            System.out.println("2) remove animal");
            System.out.println("3) view data3");
            System.out.println("0) exit");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    animalSerivice.addAnimal(chooseAnimal());
                    break;
                case 2:

                    animalSerivice.printAllAnimalSelection();
                    String index = null;
                    do {
                        index = inputStr("Give id of animal:");
                        try {
                            Integer.parseInt(index);
                        } catch (NumberFormatException ex) {
                            continue;
                        }
                    } while (Integer.parseInt(index) > 4 || Integer.parseInt(index) < 0);

                    animalSerivice.deleteAnimal(Integer.parseInt(index));
                    break;
                case 3:
                    animalSerivice.printAllAnimalSelection();
                    break;
                case 0:
                    break main_loop;

            }

        }
        System.out.println("System exit.");

    }

    private static Animal chooseAnimal() {
        Animal animal = null;
        Scanner s = new Scanner(System.in);
        System.out.println("Choose animal type");
        System.out.println("1) Dog");
        System.out.println("2) Fish");

        if (s.nextInt() == 1) {
            animal = initAnimal(1);
        } else {
            animal = initAnimal(2);
        }

        return animal;

    }

    private static Animal initAnimal(int animalType) {
        Animal animal = null;
        Scanner s = new Scanner(System.in);
        if (animalType == 1) {
            String breed = inputStr("Give dog breed: ");
            char size = inputChar("Give breed size. S, M or L");
            animal = new Dog(breed, size);
        } else if (animalType == 2) {
            String species = inputStr("Give fish species: ");
            boolean isPredatorFish = inputBool("Is the fist predator?");
            animal = new Fish(species, isPredatorFish);
        }
        return animal;

    }

    private static String inputStr(String message) {
        System.out.println(message);
        Scanner s = new Scanner(System.in);
        return s.next();

    }

    private static char inputChar(String message) {
        String retVal = null;
        do {
            System.out.println(message);
            Scanner s = new Scanner(System.in);
            retVal = s.next();
        } while (retVal.length() > 1
                || retVal.length() < 0);

        return retVal.charAt(0);

    }

    private static boolean inputBool(String message) {
        String retVal = null;
        do {
            System.out.println(message);
            Scanner s = new Scanner(System.in);
            retVal = s.next();
        } while (!retVal.toLowerCase().contentEquals("yes")
                && !retVal.toLowerCase().contentEquals("no"));

        if (retVal.equals("yes")) {
            retVal = "true";
        } else if (retVal.equals("no")) {
            retVal = "false";
        }

        return Boolean.valueOf(retVal);

    }

}
