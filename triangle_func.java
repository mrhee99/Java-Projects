public class triangle_func {
    public static void drawTriangle (int N)
    {
        for (int i = 1; i <= N; ++i) {
            for (int j = 1 ; j <= i; ++j) {
                System.out.print ("*"); }
            System.out.println ();
            }

        }
    public static void main (String[] args) {
        int N = 10;
            drawTriangle (N);



    }




}