package beingsOfTheEarth.HumanTypes;
import beingsOfTheEarth.Human;

public class Vampire extends Human {
    @Override
    public void born() {
        System.out.println("The Vampire is born");
    }

    @Override
    public void grow() {
        System.out.println("The Vampire is growing");
    }

    @Override
    public void walk(){
        System.out.println("The Vampire is walking");
    }
    @Override
    public void jump(){
        System.out.println("The Vampire is jumping");
    }

    public void bite() {
        System.out.println("The Vampire is biting");
    }

    @Override
    public void run(){
        System.out.println("The Vampire is running");
    }
    @Override
    public void fall(){
        System.out.println("The Vampire is falling");
    }

    public void drinkBlood() {
        System.out.println("The Vampire is drinking blood");
    }

    @Override
    public void reproduce() {
        System.out.println("The Vampire is reproducing");
    }

    @Override
    public void teleport() {
        System.out.println("The Vampire is teleporting");
    }
    @Override
    public void fly() {
        System.out.println("The Vampire is flying");
    }
    @Override
    public void land() {
        System.out.println("The Vampire is landing");
    }

    public void killHuman() {
        System.out.println("The Vampire is killing a human");
    }

    @Override
    public void die() {
        System.out.println("The Vampire is dead");
    }
}