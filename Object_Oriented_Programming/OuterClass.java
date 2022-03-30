package Object_Oriented_Programming;

/**
 * @ AUTHOR: Irene Busah
 * This file implements the concept of classes within another class
 */

public class OuterClass {
    int x = 10;

    class InnerClass{
        int y = 5;
        public int innerMethod(){
            return x;
        }

    }
    public static void main(String args[]){
        OuterClass myOuterclass = new OuterClass();
        OuterClass.InnerClass myInnerclass = myOuterclass.new InnerClass();
        System.out.println(myInnerclass.y);
        System.out.println(myInnerclass.innerMethod());
    }
}
