package pkg017_recursion_overload;

/**
 * Learn about recursion and overload
 * 
 * We used different recursion methods to count, overloaded recurse evens but had
 * to add a var so it didn't glyph
 * 
 * @author compsci
 */
public class StartRecursion {

    /**
     * starts program
     * 
     * code to start programs, calls other methods within the class
     * 
     * @param args common list name for starting program
     */
    
    public static void main(String[] args) {

        int n = 10;
        recurse(n);
        n = 1;
        System.out.println();
        System.out.println();
        recurseUp(n);
        System.out.println();
        int startValue = 0;
        int stopValue = 50;
        recurseEvens(startValue, stopValue);
        System.out.println();
        startValue = 0;
        stopValue = 50;
        n = 2;
        recurseEvens(startValue, stopValue, n);

    }

    /**
     * first attempt at recursion
     * 
     * first try at recursion, counts down instead of up
     * 
     * @param n output counts number of times run
     */
    private static void recurse(int n) {

        System.out.println("We have done recurse " + n + " times");
        n--;
        if (n >= 0) {
            recurse(n);
        }
    }

    /**
     * second attempt at recursion
     * 
     * another try at recursion, counts correctly
     * 
     * @param n output counts number of times run
     */
    private static void recurseUp(int n) {

        System.out.println("We have done recurseUp " + n + " times");
        n++;
        if (n <= 10) {
            recurseUp(n);
        }
    }
    /*
    overload: methods have the same name but different past params
    so java doesnt confuse them
    */
    /**
     * More advanced recursion
     * 
     * takes start and stop and counts even numbers between
     * 
     * @param startValue var that code starts at
     * @param stopValue var that code stops at
     */
    private static void recurseEvens(int startValue, int stopValue) {

        if (startValue % 2 == 0) {
            System.out.println("recurseEven value on this run is " + startValue);
        }

        startValue++;
        
        if (startValue < stopValue) {
            recurseEvens(startValue, stopValue);
        }
    }

    /**
     * More advanced recursion and overload
     * 
     * takes start and stop and counts even numbers between, also overload class
     * an overload is a class with same name but different params
     * 
     * @param startValue var that code starts at
     * @param stopValue var that code stops at
     * @param n counts numbers between start and stop
     */
    private static void recurseEvens(int startValue, int stopValue, int n) {

        
        if (startValue % 2 != 0) {
            startValue++;
            n = startValue;
        }
        System.out.println("recurseEven value on this run is " + n);
        n=n+2;
        
        if (n < stopValue) {
            recurseEvens(startValue, stopValue, n);
        }
    }
    
}//end of class
