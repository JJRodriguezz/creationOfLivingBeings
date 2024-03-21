package SkyBeings.SkyCreatures;
import SkyBeings.SkyType;

public class Dragon extends SkyType{
    @Override
    public void born(){
        System.out.println("The Dragon is being born");
    }
    @Override
    public void grow(){
        System.out.println("The Dragon is growing");
    }

    public void breatheFire(){
        System.out.println("The Dragon is breathing fire");
    }

    @Override
    public void teleport() {
        System.out.println("The Dragon is teleporting");
    }

    @Override
    public void reproduce(){
        System.out.println("The Dragon is reproducing");
    }

    @Override
    public void fly(){
        System.out.println("The Dragon is flying");
    }

    public void hoard(){
        System.out.println("The Dragon is hoarding treasure");
    }
    public void fight() {
        System.out.println("The Dragon is fighting the Knights");
    }

    @Override
    public void land(){
        System.out.println("The Dragon is landing");
    }
    @Override
    public void die(){
        System.out.println("The Dragon is dying");
    }
   
    
    
    
    
}