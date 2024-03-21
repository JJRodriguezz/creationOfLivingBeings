import java.util.Scanner;
import Creators.LivingBeingCreator;
import LivingBeings.LivingBeing;
import SkyBeings.SkyType;
import SkyBeings.SkyCreatures.Angel;
import SkyBeings.SkyCreatures.Dragon;
import SkyBeings.SkyCreatures.Gargoyle;
import beingsOfTheEarth.Animals;
import beingsOfTheEarth.Human;
import beingsOfTheEarth.HumanTypes.OrdinaryHuman;
import beingsOfTheEarth.HumanTypes.Vampire;
import beingsOfTheEarth.HumanTypes.Wizard;
import beingsOfTheEarth.LandAnimals.Cat;
import beingsOfTheEarth.LandAnimals.Dog;
import beingsOfTheEarth.LandAnimals.Horse;
import SkyBeings.SkyAnimals.Butterfly;
import SkyBeings.SkyAnimals.Heron;
import SkyBeings.SkyAnimals.Pigeon;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            // Mostrar las opciones disponibles
            System.out.println("================================");
            System.out.println("Welcome to the creation paradise");
            System.out.println("================================");
            System.out.println("Select the type of specimen you want to create:");
            System.out.println("1. Land animal");
            System.out.println("2. Human");
            System.out.println("3. Sky creature");

            // Leer la elección del usuario
            System.out.print("Enter the corresponding number: ");
            int choice = scanner.nextInt();
            System.out.println("==================================================");

            // Crear el espécimen según la elección del usuario
            LivingBeing specimen = null;
            switch (choice) {
                case 1:
                    specimen = createLandAnimal(scanner);
                    break;
                case 2:
                    specimen = createHuman(scanner);
                    break;
                case 3:
                    specimen = createSkyCreature(scanner);
                    break;

                default:
                    System.out.println("Invalid option. Leaving the program.");
                    System.exit(1);
            }

            if (specimen != null) {
                System.out.println("The type of specimen created is: " + specimen.getClass().getSimpleName());
                System.out.println("================================================");
                System.out.println("Performing actions of the specimen:\n");
                if (specimen instanceof Animals) {
                    Animals animal = (Animals) specimen;
                    animal.born();
                    animal.grow();
                    animal.reproduce();
                    animal.walk();
                    animal.jump();
                    animal.run();
                    animal.fall();
                    if (animal instanceof Cat) {
                        Cat cat = (Cat) animal;
                        cat.Meow();
                        cat.poop();
                        cat.die();
                    } else if (animal instanceof Dog) {
                        Dog dog = (Dog) animal;
                        dog.bark();
                        dog.pee();
                        dog.die();
                    } else if (animal instanceof Horse) {
                        Horse horse = (Horse) animal;
                        horse.neigh();
                        horse.gallop();
                        horse.die();
                    }
                } else if (specimen instanceof Human) {
                    Human human = (Human) specimen;
                    human.born();
                    human.grow();
                    human.walk();
                    human.run();
                    human.jump();
                    human.fall();
                    human.reproduce();
                    if (human instanceof OrdinaryHuman) {
                        OrdinaryHuman ordinaryHuman = (OrdinaryHuman) human;
                        ordinaryHuman.work();
                        ordinaryHuman.study();
                        ordinaryHuman.cry();
                        ordinaryHuman.die();
                    } else if (human instanceof Vampire) {
                        Vampire vampire = (Vampire) human;
                        vampire.teleport();
                        vampire.fly();
                        vampire.land();
                        vampire.drinkBlood();
                        vampire.bite();
                        vampire.killHuman();
                        vampire.die();
                    } else if (human instanceof Wizard) {
                        Wizard wizard = (Wizard) human;
                        wizard.teleport();
                        wizard.castSpell();
                        wizard.conjure();
                        wizard.train();
                        wizard.die();
                    }
                } else if (specimen instanceof SkyType) {
                    SkyType skyCreature = (SkyType) specimen;
                    skyCreature.born();
                    skyCreature.grow();
                    skyCreature.fly();
                    skyCreature.land();
                    skyCreature.changeDimension();
                    skyCreature.teleport();
                    skyCreature.reproduce();
                    if (skyCreature instanceof Angel) {
                        Angel angel = (Angel) skyCreature;
                        angel.sing();
                        angel.fight();
                        angel.attack();
                        angel.die();
                    } else if (skyCreature instanceof Dragon) {
                        Dragon dragon = (Dragon) skyCreature;
                        dragon.breatheFire();
                        dragon.hoard();
                        dragon.fight();
                        dragon.die();
                    } else if (skyCreature instanceof Gargoyle) {
                        Gargoyle gargoyle = (Gargoyle) skyCreature;
                        gargoyle.petrify();
                        gargoyle.guard();
                        gargoyle.fight();
                        gargoyle.die();
                    } else if (skyCreature instanceof Butterfly) {
                        Butterfly butterfly = (Butterfly) skyCreature;
                        butterfly.pollinate();
                        butterfly.migrate();
                        butterfly.die();
                    } else if (skyCreature instanceof Heron) {
                        Heron heron = (Heron) skyCreature;
                        heron.feed();
                        heron.hunt();
                        heron.die();
                    } else if (skyCreature instanceof Pigeon) {
                        Pigeon pigeon = (Pigeon) skyCreature;
                        pigeon.coo();
                        pigeon.poop();
                        pigeon.feed();
                        pigeon.die();
                    }
                }

            } else {
                System.out.println("The specimen could not be created.");
            }
            System.out.println("================================================");
            System.out.print("Do you want to create another specimen? (yes/no): ");
            String answer = scanner.next();
            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Leaving the creation paradise...");
                break; // Salir del bucle si la respuesta no es "yes"
            }

        } while (true);

    }

    // Método para crear un animal terrestre
    private static LivingBeing createLandAnimal(Scanner scanner) {
        System.out.println("Select the type of land animal you want to create:");
        System.out.println("1. Cat");
        System.out.println("2. Dog");
        System.out.println("3. Horse");
        System.out.print("Enter the corresponding number: ");
        int choice = scanner.nextInt();
        System.out.println("================================================");
        switch (choice) {
            case 1:
                return LivingBeingCreator.createLivingBeings("Cat");
            case 2:
                return LivingBeingCreator.createLivingBeings("Dog");
            case 3:
                return LivingBeingCreator.createLivingBeings("Horse");
            default:
                System.out.println("Invalid option. Leaving the program.");
                System.exit(1);
        }
        return null;
    }

    // Método para crear un ser humano
    private static LivingBeing createHuman(Scanner scanner) {
        System.out.println("Select the type of human you want to create:");
        System.out.println("1. Ordinary Human");
        System.out.println("2. Vampire");
        System.out.println("3. Wizard");
        System.out.print("Enter the corresponding number: ");
        int choice = scanner.nextInt();
        System.out.println("================================================");
        switch (choice) {
            case 1:
                return LivingBeingCreator.createLivingBeings("OrdinaryHuman");
            case 2:
                return LivingBeingCreator.createLivingBeings("Vampire");
            case 3:
                return LivingBeingCreator.createLivingBeings("Wizard");
            default:
                System.out.println("Invalid option. Leaving the program.");
                System.exit(1);
        }
        return null;
    }

    // Método para crear una criatura celestial
    private static LivingBeing createSkyCreature(Scanner scanner) {
        System.out.println("Select the type of Sky creature you want to create:");
        System.out.println("1. Angel");
        System.out.println("2. Dragon");
        System.out.println("3. Gargoyle");
        System.out.println("4. Butterfly");
        System.out.println("5. Heron");
        System.out.println("6. Pigeon");
        System.out.print("Enter the corresponding number: ");
        int choice = scanner.nextInt();
        System.out.println("================================================");
        switch (choice) {
            case 1:
                return LivingBeingCreator.createLivingBeings("Angel");
            case 2:
                return LivingBeingCreator.createLivingBeings("Dragon");
            case 3:
                return LivingBeingCreator.createLivingBeings("Gargoyle");
            case 4:
                return LivingBeingCreator.createLivingBeings("Butterfly");
            case 5:
                return LivingBeingCreator.createLivingBeings("Heron");
            case 6:
                return LivingBeingCreator.createLivingBeings("Pigeon");
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                System.exit(1);
        }
        return null;
    }

}