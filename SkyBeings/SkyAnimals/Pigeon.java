package SkyBeings.SkyAnimals;
import SkyBeings.SkyType;


public class Pigeon extends SkyType { 
    @Override
    public void born(){
        System.out.println("The pigeon is being born");
    }
    @Override
    public void grow(){
        System.out.println("The pigeon is growing");
    }

    public void coo() {
        System.out.println("The pigeon is cooing");
    }

    public void feed() {
        System.out.println("The pigeon is feeding");
    }

    @Override
    public void fly(){
        System.out.println("The pigeon is flying");
    }

    public void poop() {
        System.out.println("The pigeon is pooping on a car");
    }

    @Override
    public void land(){
        System.out.println("The pigeon is landing");
    }

    @Override
    public void reproduce(){
        System.out.println("The pigeon is reproducing");
    }
    @Override
    public void die(){
        System.out.println("The pigeon is dying");
    }
    
}