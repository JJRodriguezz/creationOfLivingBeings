package SkyBeings;
import beingsOfTheEarth.EarthBeing;
import LivingBeings.LivingBeing;

public class SkyType extends LivingBeing implements SkyBeing, EarthBeing{
    //LivingBeing
    public void born(){}
    public void grow(){}
    public void reproduce(){}
    public void die(){}
    //EarthBeing
    public void walk(){}
    public void jump(){}
    public void run(){}
    public void fall(){}
    //SkyBeing
    public void fly(){}
    public void land(){}
    public void changeDimension(){}
    public void teleport(){}
}
