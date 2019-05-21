import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.random = new Random(); 
    }

    public int roll() {
        // create here a random number belongig to range 1-numberOfSided
        return (int) (Math.random() * numberOfSides) + 1; 
        
        
    }
}
