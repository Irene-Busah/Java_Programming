package Recursion;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of recursion using factorial
 */

public class Factorial {
//    creating the method factorial to find the factorial of a number
    public static int factorial(int num){
        if (num == 1 || num == 0){
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

//    creating the main to run the program
    public static void main(String args[]){
        System.out.println(factorial(6));
    }
}
