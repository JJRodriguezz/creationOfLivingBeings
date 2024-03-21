package Creators;

import LivingBeings.LivingBeing;
import beingsOfTheEarth.LandAnimals.*;
import beingsOfTheEarth.HumanTypes.*;
import SkyBeings.SkyCreatures.*;
import SkyBeings.SkyAnimals.*;

public class LivingBeingCreator implements Creator{

    public static LivingBeing createLivingBeings(String type) {
        if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Horse")) {
            return new Horse();
        } else if (type.equalsIgnoreCase("OrdinaryHuman")) {
            return new OrdinaryHuman();
        } else if (type.equalsIgnoreCase("Vampire")) {
            return new Vampire();
        } else if (type.equalsIgnoreCase("Wizard")) {
            return new Wizard();
        } else if (type.equalsIgnoreCase("Angel")) {
            return new Angel();
        } else if (type.equalsIgnoreCase("Dragon")) {
            return new Dragon();
        } else if (type.equalsIgnoreCase("Gargoyle")) {
            return new Gargoyle();
        } else if (type.equalsIgnoreCase("Butterfly")) {
            return new Butterfly();
        } else if (type.equalsIgnoreCase("Heron")) {
            return new Heron();
        } else if (type.equalsIgnoreCase("Pigeon")) {
            return new Pigeon();
        } else
            throw new IllegalArgumentException("Tipo de ser vivo no reconocido: " + type);
        }
    }

