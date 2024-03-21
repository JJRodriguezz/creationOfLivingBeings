package beingsOfTheEarth.LandAnimals;
import beingsOfTheEarth.Animals;

public class Horse extends Animals {
    
    @Override
    public void born() {
        System.out.println("The Horse is being born");
    }
    @Override
    public  void grow() {
        System.out.println("The Horse is growing");
    }
    @Override
    public  void reproduce() {
        System.out.println("The Horse is reproducing");
    }
    @Override
    public  void die() {
        System.out.println("The Horse is dying");
    }
    @Override
    public void walk(){
        System.out.println("The Horse is walking");
    }
    @Override
    public void jump(){
        System.out.println("The Horse is jumping");
    }
    @Override
    public void run(){
        System.out.println("The Horse is running");
    }
    @Override
    public void fall(){
        System.out.println("The Horse is falling");
    }
    public void gallop() {
        System.out.println("The Horse is galloping");
    }
    public void neigh() {
        System.out.println("The Horse is neighing");}
}
