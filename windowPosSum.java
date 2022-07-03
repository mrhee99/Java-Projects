public class windowPosSum {
  public static void windowPosSum(int[] a, int n) {
    /** your code here */ 
    // start with index 0; if i is less than the length, add 1 to i
    for (int i = 0; i <a.length; ++i) {
      // if a[i] is negative, skip the second for loop and go back to the first loop
      if (a[i] < 0) {
        continue;
      }
      // if a[i] is positive, come to this second for loop
      // index j is i +1 and it indicates the next number of index i;
      
      for (int j = i + 1; j <= i +n ; j++){
        // j is greater than the length of array a, terminate the following if statement and go back to first for loop 
        if (j >= a.length){
          break;
        }
        
        // replace a[i] with a[i] + all rest of numbers in the array accounting for j number of index
        // ex) if i =1 and n = 3 and the a.length = 5, new a[1] = a[1] + a[2] + a[3] +a[4] 
        // j can only go up to 4
        // if i = 0, n =3; j can only go up to 3. Thus, a[0] = a[0]+a[1]+a[2]+a[3]
        a[i] = a[i]+a[j];
      
      }
       
  }

}
  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}