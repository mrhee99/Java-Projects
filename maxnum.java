public class maxnum {
/** returns the maximum value in the array m */
   public static int max(int[] m){ 
     
      /** compare number in order and return the bigger one */
      int max_num = m[0]; 
      for (int i = 0; i < m.length; i++) {
            if (m[i] > max_num) 
              max_num = m[i]; 
         
      }
        return max_num;
   }
   
      public static void main(String[] args){
        int[]m = new int[]{9, 2, 15, 2, 22, 10, 6};  
        System.out.println(max(m));
   }
  
}
  
     