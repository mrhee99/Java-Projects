
public class age_sports {
    public int age;

    // using the user input 
    public age_sports (int aGE) {
        age = aGE;
    }

    public void suggestSports() {
        if (age < 20) {
            System.out.println ("Play basketball");
        } else if (age < 35) {
            System.out.println ("Play tennis");
        } else {
            System.out.println ("Play golf");
        }
    }


}