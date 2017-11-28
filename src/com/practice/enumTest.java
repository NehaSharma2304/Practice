package com.practice;

enum Color { RED, GREEN, YELLOW;

    void testMethodInsideEnum() {
        System.out.println("Inside enum");
    }
}

public class enumTest {
/**
 * 1. Static block or function only handle static variables
 * 2. Color c1 = new Color() wrong, enum cant be instaniate
 * 3. enum internally implemented by using Class
 *
 * class Color
     {
     public static final Color RED = new Color();
     public static final Color BLUE = new Color();
     public static final Color GREEN = new Color();
     }

 4. All enums implicitly extend java.lang.Enum class.
 As a class can only extend one parent in Java, so an enum cannot extend anything else.

 5. enum can implement many interfaces.
 6. toString() method is overridden in java.lang.Enum class,which returns enum constant name.

 7. java.lang.Enum class contain values(), ordinal() and valueOf() methods

                            enum and methods :
 enum can contain concrete methods only i.e. no any abstract method.

 */
    Color c1;
    int a ;
    enumTest(int a) {
        this.a = a;
    }

    int aa = 10;
    static final double EULERCONSTANT;
    static {
        System.out.println("Neha Sharma ");
        EULERCONSTANT = 10;
    }


    public static void main(String[] arg) {
        Color c2 = Color.GREEN;
        System.out.println(c2);
        final enumTest obj = new enumTest(1);
        obj.a = 12;
        obj.printColor(c2);
        c2.testMethodInsideEnum();
        System.out.println("Its red  aa " + obj.a);

        int x = 0;
        final int THRESHOLD;
        THRESHOLD = 10;

//        // redeclaring x as long will not work
//        for(int y = 0, x = 1; x < 5; x++)
//        {
//            System.out.print(x + " ");
//        }
    }

    void printColor(Color c1) {
        switch (c1) {
            case RED:
                System.out.println("Its red");
                break;
            case GREEN:
                System.out.println("Its green");
                break;
            case YELLOW:
                System.out.println("Its YELLOW");
                break;
        }
    }
}
