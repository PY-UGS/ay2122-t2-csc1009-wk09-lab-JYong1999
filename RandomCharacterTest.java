import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import java.util.Random;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomCharacterTest {
    private RandomCharacter randomCharacter;
    private Random r;

    @BeforeEach
    public void setUp() {
        randomCharacter = new RandomCharacter();
        r = new Random();
    }

    @RepeatedTest(15)
    @DisplayName("Get a random lowercase letter")
    public void testGetRandomLowerCaseLetter() {
        assertTrue(Character.isLowerCase(randomCharacter.getRandomLowerCaseLetter()));
    }

    @RepeatedTest(15)
    @DisplayName("Get a random uppercase letter")
    public void testGetRandomUpperCaseLetter() {
        assertTrue(Character.isUpperCase(randomCharacter.getRandomUpperCaseLetter()));
    }

    @RepeatedTest(15)
    @DisplayName("Get a random digit from 0 to 9")
    public void testGetRandomDigitCharacter() {
        assertTrue(Character.isDigit(randomCharacter.getRandomDigitCharacter()));
    }

    @RepeatedTest(15)
    @DisplayName("Check if it is a prime character")
    public void testIsPrime() {

        String primeTest = "2357";
        String nonPrimeTest = "014689";

        // Get a random prime value
        char prime = primeTest.charAt(r.nextInt(primeTest.length()));
        // Get a random non-prime value
        char nonPrime = nonPrimeTest.charAt(r.nextInt(nonPrimeTest.length()));

        // As prime is a prime number, return true
        assertEquals(true, randomCharacter.checkPrime(prime));
        // As nonPrime is not a prime number, return false
        assertEquals(false, randomCharacter.checkPrime(nonPrime));
    }
}