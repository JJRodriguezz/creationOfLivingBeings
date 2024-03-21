package beingsOfTheEarth.LandAnimals;
import beingsOfTheEarth.Animals;

public class Cat extends Animals {

    @Override
    public void born() {
        System.out.println("The Cat is being born");
    }
    @Override
    public  void grow() {
        System.out.println("The Cat is growing");
    }
    @Override
    public  void reproduce() {
        System.out.println("The Cat is reproducing");
    }
    @Override
    public  void die() {
        System.out.println("The Cat is dying");
    }
    @Override
    public void walk(){
        System.out.println("The Cat is walking");
    }
    @Override
    public void jump(){
        System.out.println("The Cat is jumping");
    }
    @Override
    public void run(){
        System.out.println("The Cat is running");
    }
    @Override
    public void fall(){
        System.out.println("The Cat is falling");
    }
    public void Meow() {
        System.out.println("The Cat is meowing");
    }
    public void poop() {
        System.out.println("The Cat is pooping at the sandbox");}
}