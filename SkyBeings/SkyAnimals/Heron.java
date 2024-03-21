package SkyBeings.SkyAnimals;
import SkyBeings.SkyType;


public class Heron extends SkyType{ 
    @Override
    public void born(){
        System.out.println("The heron is being born");
    }
    @Override
    public void grow(){
        System.out.println("The heron is growing");
    }

    @Override
    public void fly(){
        System.out.println("The heron is flying");
    }

    public void hunt() {
        System.out.println("The heron is hunting its food");
    }

    public void feed() {
        System.out.println("The heron is feeding");
    }

    @Override
    public void land(){
        System.out.println("The heron is landing");
    }

    @Override
    public void reproduce(){
        System.out.println("The heron is reproducing");
    }
    @Override
    public void die(){
        System.out.println("The heron is dying");
    }
    
    
    
}