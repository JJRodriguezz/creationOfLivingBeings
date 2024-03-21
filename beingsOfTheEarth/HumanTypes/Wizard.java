package beingsOfTheEarth.HumanTypes;
import beingsOfTheEarth.Human;

public class Wizard extends Human {
    
    @Override
    public void born() {
        System.out.println("The Wizard is born");
    }

    @Override
    public void walk(){
        System.out.println("The Wizard is walking");
    }

    @Override
    public void grow() {
        System.out.println("The Wizard is growing");
    }

    @Override
    public void jump(){
        System.out.println("The Wizard is jumping");
    }
    @Override
    public void run(){
        System.out.println("The Wizard is running");
    }
    @Override
    public void fall(){
        System.out.println("The Wizard is falling");
    }

    @Override
    public void teleport() {
        System.out.println("The Wizard is teleporting");
    }
    public void castSpell() {
        System.out.println("The Wizard is casting a spell");
    }

    public void conjure() {
        System.out.println("The Wizard is conjuring a curse");
    }

    @Override
    public void reproduce() {
        System.out.println("The Wizard is reproducing");
    }

    public void train() {
        System.out.println("The Wizard is training an adept");
    }

    @Override
    public void die() {
        System.out.println("The Wizard is dead");
    }
    
}