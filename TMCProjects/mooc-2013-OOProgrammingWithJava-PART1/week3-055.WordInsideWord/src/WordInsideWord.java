
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type the first word: ");
        String word = reader.nextLine(); 
        System.out.print("Type the second word: ");
        String wordTwo = reader.nextLine(); 
        int index = word.indexOf(wordTwo); 
        if (index >= 0) {
            System.out.println("The word '" + wordTwo + "' is found in the word '" + word + "'.");
        } else {
        System.out.println("The word '" + wordTwo + "' is not found in the word '" + word + "'.");
    }
    }
}
