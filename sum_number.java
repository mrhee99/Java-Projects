public class sum_number {
    public static void  main(String[] args) {
        int x = 0;
        int sum = 0;
        
        while (x<10)
           
            {System.out.println (sum);
            x = x + 1;
            // In every loop, it will produce 0 to 9
            sum = sum + x;
            // the logic here is as each loop produce a number, it adds to the previous sum. 
            // for example; when x  = 0, sum= 0 + 0 =0. when x = 1, sum = 0 + 1=1. when x = 2, sum = 1 +2 =3
            // Thus, it will print out 0, 1, 3, 6, etc... 
        
            }
    
    }

 

}