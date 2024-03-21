package beingsOfTheEarth.LandAnimals;
import beingsOfTheEarth.Animals;

public class Dog extends Animals {
    @Override
    public void born() {
        System.out.println("The Dog is being born");
    }
    @Override
    public  void grow() {
        System.out.println("The Dog is growing");
    }
    @Override
    public  void reproduce() {
        System.out.println("The Dog is reproducing");
    }
    @Override
    public  void die() {
        System.out.println("The Dog is dying");
    }
    @Override
    public void walk(){
        System.out.println("The Dog is walking");
    }
    @Override
    public void jump(){
        System.out.println("The Dog is jumping");
    }
    @Override
    public void run(){
        System.out.println("The Dog is running");
    }
    @Override
    public void fall(){
        System.out.println("The Dog is falling");
    }
    public void bark() {
        System.out.println("The Dog is barking");
    }
    public void pee() {
        System.out.println("The Dog is peeing at the tree");}
}
