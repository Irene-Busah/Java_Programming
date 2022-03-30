package Object_Oriented_Programming;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of polymorphism using Animal as an object
 */

public class Animal {
    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal{
    @Override
    public void animalSound() {
        super.animalSound();
        System.out.println("The dog says, bow wow");
    }
}

class Pig extends Animal{
    @Override
    public void animalSound(){
        super.animalSound();
        System.out.println("The pig says, wee wee");
    }
}

class Main{
//    creating the main method to run the code
    public static void main(String args[]){
        Pig myPig = new Pig();
        myPig.animalSound();

        System.out.println("");

        Dog myDog = new Dog();
        myDog.animalSound();
    }
}
