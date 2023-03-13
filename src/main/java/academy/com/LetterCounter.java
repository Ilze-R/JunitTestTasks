package academy.com;

public class LetterCounter {

    public static int countCharacters(String word, char character){
        int charCounter = 0;
        for (int i =0; i < word.length(); i++){
            char letter = word.charAt(i);
            if(letter == character){
                charCounter++;
            }
        }
        return charCounter;
    }



}
