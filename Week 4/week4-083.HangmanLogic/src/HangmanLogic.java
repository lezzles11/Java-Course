
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if (guessedLetters.contains(letter)) {
            System.out.println();
        } else if (word.contains(letter)) {
            guessedLetters+= letter; 
        } else {
            numberOfFaults++;
            guessedLetters = guessedLetters + letter; 
        }
    }

    public String hiddenWord() {
        String hiddenWord = "";
        int i = 0; 
        String guessLetter = "";
        while (i < this.word.length()) {
            char guess = this.word.charAt(i);
            guessLetter = Character.toString(guess);
            if (this.guessedLetters.contains(guessLetter)) {
                hiddenWord = hiddenWord + guessLetter; 
            } else {
                hiddenWord = hiddenWord + "_";
            }
            i++; 
        }
        return hiddenWord; 
            }
        }
// program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
    

