/** This program will print out the larger number out of two */

public class larger_number {
    /** function in java must be within the class and it has to be defined a type */
    public static int larger(int x, int y) {
        if (x>y) {
            return x;
        }
        return y;
    }
    
    public static void  main(String[] args) {
      
            System.out.println (larger(123, 32));
        }
            
    }
