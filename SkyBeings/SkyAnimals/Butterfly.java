package SkyBeings.SkyAnimals;
import SkyBeings.SkyType;


public class Butterfly extends SkyType  {
    @Override
    public void born(){
        System.out.println("The worm became a beautiful butterfly!");
    }
    @Override
    public void grow(){
        System.out.println("The butterfly is growing");
    }

    @Override
    public void fly(){
        System.out.println("The butterfly is flying");
    }
    @Override
    public void land(){
        System.out.println("The butterfly is landing");
    }

    public void pollinate() {
        System.out.println("The butterfly is pollinating");
    }
    
    public void migrate() {
        System.out.println("The butterfly is migrating");
    }

    @Override
    public void reproduce(){
        System.out.println("The butterfly is reproducing");
    }
    @Override
    public void die(){
        System.out.println("The butterfly is dying");
    }
    
    
    
}