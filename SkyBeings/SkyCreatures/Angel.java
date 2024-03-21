package SkyBeings.SkyCreatures;
import SkyBeings.SkyType;

public class Angel extends SkyType {
    @Override
    public void born(){
        System.out.println("The Angel is being born");
    }
    @Override
    public void grow(){
        System.out.println("The Angel is growing");
    }

    public void sing() {
        System.out.println("The Angel is singing divine song");
    }

    @Override
    public void changeDimension() {
        System.out.println("The Angel is changing dimensions");
    }
    @Override
    public void teleport() {
        System.out.println("The Angel is teleporting");
    }

    @Override
    public void fly(){
        System.out.println("The Angel is flying");
    }

    public void fight() {
        System.out.println("The Angel is fighting the Demons");
    }
    public void attack() {
        System.out.println("The Angel is attacking the Vampires");
    }

    @Override
    public void land(){
        System.out.println("The Angel is landing");
    }

    @Override
    public void reproduce(){
        System.out.println("The Angel is reproducing");
    }
    @Override
    public void die(){
        System.out.println("The Angel is dying");
    }

}