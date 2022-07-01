public class triangle {
    public static void main(String[] args) {
        int rows = 5;
        // outer loop for the number of rows
        // start with 1 row, as long as i is less than or equal to the row number, add 1 more row each time until it gets to 5
        for (int i = 1; i <= rows; i++) {

        // inner loop for the number of columns 
        // start with 1 column, as long as j is less than or equal to the number of rows, add 1 more row each time until it becomes greater than i
            for (int j = 1; j <= i; j++) {
             System.out.print("* ");
        }
        // creates a new line after each iteration
         System.out.println();
    }
  }
}

 

