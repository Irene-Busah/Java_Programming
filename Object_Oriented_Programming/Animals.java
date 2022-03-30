package Object_Oriented_Programming;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of abstractions using an animal as the object
 */

abstract class Animals {
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Zzzz");
    }
}

class Pigs extends Animals{
    public void animalSound(){
        System.out.println("The pig says, wee wee");
    }
}

class Mains{
    public static void main(String args[]){
        Pigs myPig = new Pigs();
        myPig.animalSound();

        System.out.println("");
        myPig.sleep();
    }

}
