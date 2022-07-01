public class reverse_triangle {
    public static void main(String[] args) {
        int rows = 5;
        // outer loop for the number of rows
        // start with 5 and decrease by 1 until i becomes 1 
        for (int i = rows; i >= 1; --i) {

        // inner loop for the number of columns 
        // start with 1 column and increase by 1 until column becomes row
            for (int j = 1; j <= i; ++j) {
             System.out.print("* ");   
        }
        // creates a new line after each iteration
         System.out.println();
    }
  }
}

 