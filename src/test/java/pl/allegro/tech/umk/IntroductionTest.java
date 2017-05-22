package pl.allegro.tech.umk;

import org.junit.Test;

import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntroductionTest {

    private Introduction introduction = new Introduction();

    @Test
    public void upperCaseFemaleNames() throws Exception {
        assertEquals(
                introduction.upperCaseFemaleNames(Arrays.asList("Adam", "Beata", "Cezary", "Dominika", "Eugenia", "Franciszek", "Genowefa", "Honorata")),
                Arrays.asList("BEATA", "DOMINIKA", "EUGENIA", "GENOWEFA", "HONORATA")
        );
    }

    @Test
    public void sum() throws Exception {
        assertEquals(
                introduction.sum(0, 100),
                5050
        );
    }

    @Test
    public void sumOfSquares() throws Exception {
        assertEquals(
                introduction.sumOfSquares(0, 100),
                338350
        );
    }

    @Test
    public void howMany() throws Exception {
        assertEquals(
                introduction.howMany(100),
                50
        );
    }

    @Test
    public void fileLines() throws Exception {
        assertEquals(
                introduction.fileLines(Paths.get("src/test/resources/sample")),
                Collections.singletonList("Goodbye Cruel World (1:13)".toUpperCase())
        );
    }

    @Test
    public void distinct() throws Exception {
        assertEquals(
                introduction.distinct(Arrays.asList(1, 2, 3, 4, 2, 5, 2, 6, 4, 7, 8, 7, 9, 10)),
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        );
    }

    @Test
    public void allMatch() throws Exception {
        assertTrue(
                introduction.allMatch(-100, 1500)
        );
    }

    @Test
    public void isPrime() throws Exception {
        assertTrue(
                introduction.isPrime(2)
                        && introduction.isPrime(3)
                        && !introduction.isPrime(4)
                        && introduction.isPrime(5)
                        && !introduction.isPrime(6)
                        && introduction.isPrime(7)
                        && introduction.isPrime(97)
                        && !introduction.isPrime(9991)
        );
    }

    @Test
    public void biggestPrime() throws Exception {
        assertEquals(
                introduction.biggestPrime(100),
                97
        );
        assertEquals(
                introduction.biggestPrime(1000),
                997
        );
        assertEquals(
                introduction.biggestPrime(10000),
                9973
        );
    }

    @Test
    public void divisors() throws Exception {
        assertEquals(
                introduction.divisors(213543),
                Arrays.asList(1, 3, 9, 11, 27, 33, 99, 297, 719, 2157, 6471, 7909, 19413, 23727, 71181, 213543)
        );
    }
}