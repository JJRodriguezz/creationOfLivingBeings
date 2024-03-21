package SkyBeings.SkyCreatures;
import SkyBeings.SkyType;

public class Gargoyle extends SkyType {
    @Override
    public void born(){
        System.out.println("The gargoyle is being born");
    }
    @Override
    public void grow(){
        System.out.println("The gargoyle is growing");
    }
    @Override
    public void changeDimension() {
        System.out.println("The gargoyle is changing dimensions");
    }
    public void guard(){
        System.out.println("The gargoyle is guarding the castle");
    }
    @Override
    public void fly(){
        System.out.println("The gargoyle is flying");
    }
    public void fight() {
        System.out.println("The gargoyle is fighting the Vampires");
    }
    @Override
    public void land(){
        System.out.println("The gargoyle is landing");
    }
    public void petrify(){
        System.out.println("The gargoyle turned into a stone statue");
    }
    @Override
    public void die(){
        System.out.println("The gargoyle is dying");
    }
    
}