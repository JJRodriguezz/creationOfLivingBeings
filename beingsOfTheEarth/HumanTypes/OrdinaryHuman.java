package beingsOfTheEarth.HumanTypes;
import beingsOfTheEarth.Human;

public class OrdinaryHuman extends Human{
    
    @Override
    public void born() {
        System.out.println("The Human is born");
    }

    @Override
    public void walk(){
        System.out.println("The Human is walking");
    }
    
    @Override
    public void grow() {
        System.out.println("The Human is growing");
    }

    @Override
    public void jump(){
        System.out.println("The Human is jumping");
    }

    public void study() {
        System.out.println("The Human is studying");
    }

    @Override
    public void run(){
        System.out.println("The Human is running");
    }
    @Override
    public void fall(){
        System.out.println("The Human is falling");
    }

    public void cry() {
        System.out.println("The Human is crying");
    }

    public void work() {
        System.out.println("The Human is working");
    }

    @Override
    public void reproduce() {
        System.out.println("The Human is reproducing");
    }
    
    @Override
    public void die() {
        System.out.println("The Human is dead");
    }
}
