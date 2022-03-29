import static java.lang.Character.getNumericValue;
import static java.lang.Character.isDigit;
import static java.lang.Character.*;
import java.util.Random;

public class RandomCharacter {

    public char getRandomLowerCaseLetter() {
        char charLowRandom = (char)('a' + Math.random() * ('z' - 'a') );
        return charLowRandom;
    }

    public char getRandomUpperCaseLetter() {
        char charUpRandom = (char)('A' + Math.random() * ('Z' - 'A') );
        return charUpRandom;
    }

    public char getRandomDigitCharacter() {
        Random rand = new Random();
        char intRandom = forDigit((rand.nextInt(10)), 10);
        return intRandom;
    }

    public char getRandomCharacter() {
        int random = (int)(Math.random() * (3 - 0));
        char ans = 'a';
        if(random == 0){
            ans = getRandomLowerCaseLetter();
        }
        if(random == 1){
            ans = getRandomUpperCaseLetter();
        }
        if(random == 2){
            ans = getRandomDigitCharacter();
        }
        return ans;
    }

    public boolean checkPrime(char a) {
        boolean prime = true;
        int b;
        if (isDigit(a)) {
            b = getNumericValue(a);
            if (b == 0 || b == 1) {
                prime = false;
            }
            for (int p = 2; p < b; p++) {
                if (b % p == 0) {
                    prime = false;
                    break;
                }
            }
        }
        return prime;
    }

    public static void main(String[] args) {
        RandomCharacter ran = new RandomCharacter();
        String low = "", upp = "", dig = "", randChar = "";
        //Generate 15 random characters of each category
        for(int i = 0; i<15; i++) {
            low += ran.getRandomLowerCaseLetter();
            upp += ran.getRandomUpperCaseLetter();
            dig += ran.getRandomDigitCharacter();
            randChar += ran.getRandomCharacter();
        }
        System.out.println("15 Random Lowercase: " + low);
        System.out.println("\n15 random Uppercase: " + upp);
        System.out.println("\n15 Random Digit: " + dig);
        System.out.println("\n15 Random Characters: " + randChar);

        //To check if generated value is prime
        char low2 = ran.getRandomLowerCaseLetter();
        char upp2 = ran.getRandomUpperCaseLetter();
        char dig2 = ran.getRandomDigitCharacter();
        char randChar2 = ran.getRandomCharacter();
        System.out.println("\nIs " + low2 + " prime: " + ran.checkPrime(low2));
        System.out.println("Is " + upp2 + " prime: " + ran.checkPrime(upp2));
        System.out.println("Is " + dig2 + " prime: " + ran.checkPrime(dig2));
        System.out.println("Is " + randChar2 + " prime: " + ran.checkPrime(randChar2));
    }
}
