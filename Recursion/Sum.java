package Recursion;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of recursion
 */

public class Sum {
//    creating a method that sums numbers up
    public static int sum(int num) {
        if (num > 0) {
            return num + sum(num - 1);
        } else {
            return 0;
        }
    }

//    creating the main method to run the program
    public static void main(String args[]){
        System.out.println(sum(10));
    }
}
