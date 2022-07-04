import java.util.Scanner;

public class age_sports_launcher {
    public static void main(String[] args) {
        Scanner sports = new Scanner(System.in);
        System.out.println (" What is your age?");

        // reads the user input
        int aGE = sports.nextInt();
        
        // refers to the original class age_sports 
        age_sports b = new age_sports (aGE);
        b.suggestSports();
    }
}