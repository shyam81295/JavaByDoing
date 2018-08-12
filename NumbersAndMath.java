// This class demonstrates how we deal with arithmetic operators
// in Java.
public class NumbersAndMath{
    public static void main( String args[] ){
        System.out.println("I will now count my chickens:");

        // '/' has more precedence than '+'
        System.out.println("Hens " + ( 25 + (float)30 / 6 ) );
        // '*' > '%' > '-'
        System.out.println("Roosters " + (float)( 100 -25 * 3 % 4 ) );

        System.out.println("Now I will count the eggs:");

        // '/' > '%' > '+' = '-'
        // '1 / 4' == 0 [ if float type-casting is not used ] else it is 0.25
        // '4 % 2' == 0
        System.out.println( 3 + 2 + 1 - 5 + 4 % 2 - (float)1 / 4 + 6 );

        System.out.println("Is it true that 3 + 2 < 5 - 7?");

        // Arithmetic operators has more precedence than comparison operators
        System.out.println( 3 + 2 < 5 - 7 );

        System.out.println("What is 3 + 2?" + (float)( 3 + 2 ) );
        System.out.println("What is 5 - 7?" + (float)( 5 - 7 ) );

        System.out.println("Oh, that's why it's false." );

        System.out.println("How about some more." );

        // Comparison operators returns boolean result
        System.out.println("Is it greater? " + ( 5 > -2 ) );
        System.out.println("Is it greater or equal? " + ( 5 >= -2 ) );
        System.out.println("Is it less or equal? " + ( 5 <= -2 ) );  
    }
}
