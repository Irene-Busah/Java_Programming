package Unit_testing;
import org.junit.Test;
//import org.junit.Test.*;

import static org.junit.Assert.*;
/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of unit testing in Java using a simple arithmetic
 */

public class TestSum {
//    creating an addition method
    public static int add(int a, int b){
        return a + b;
    }

    public int square(int a){
        return a * a;
    }
}

// creating another class to test the add method

class addTest{
    @Test
    public static void test(){
        TestSum test = new TestSum();
        int output = test.add(10, 11);
        assertEquals(21, TestSum.add(10, 11));

//        testing the square method
        TestSum test1 = new TestSum();
        int result = test1.square(3);
        assertEquals(9, result);
    }

//    creating the main method
    public static void main(String args[]){
        test();

    }
}
