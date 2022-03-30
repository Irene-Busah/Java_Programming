package Object_Oriented_Programming;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of inheritance using a vehicle and car object
 */

public class Vehicle {
    protected String brand = "Ford";
    public void honk(){
        System.out.println("Tuut tuut");
    }
}

class Car extends Vehicle{
    private String modelName = "Mustang";
    public static void main(String args[]){
        Car myCar = new Car();

        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}







