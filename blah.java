public class blah {
    /** This program will print out number of bottles until it reaches 1 bottle.  */
    public static void  main(String[] args) 
    {int bottles = 99;
    while (bottles > 0) {
        System.out.println(bottles + " bottles of beer on the wall.");
        // after every iteration, the number of bottle will decrease by 1
        bottles = bottles - 1;
        }
    }
}