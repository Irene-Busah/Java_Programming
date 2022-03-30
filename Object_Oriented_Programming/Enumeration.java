package Object_Oriented_Programming;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of enumeration
 */

public class Enumeration {
    enum level{
        LOW,
        MEDIUM,
        HIGH;

    }
    public static void main(String args[]){
        level myLevel = level.HIGH;
//        System.out.println(myLevel);
        switch (myLevel){
            case LOW:
                System.out.println("Low level"); break;
            case MEDIUM:
                System.out.println("Medium level"); break;
            case HIGH:
                System.out.println("High level"); break;
        }
    }
}
