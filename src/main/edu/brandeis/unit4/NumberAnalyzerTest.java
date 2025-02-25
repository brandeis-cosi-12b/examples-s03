package edu.brandeis.unit4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberAnalyzerTest {

    @Test
    public void testCalculateMedianWithOddNumberOfValues() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 2, 3, 4, 5});
        assertEquals(3, analyzer.calculateMedian());
    }

    @Test
    public void testCalculateMedianWithEvenNumberOfValues() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 2, 3, 4});
        assertEquals(2, analyzer.calculateMedian());
    }

    @Test
    public void testCalculateMeanWithValues() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 2, 3, 4, 5});
        assertEquals(3.0, analyzer.calculateMean(), 0.001);
    }

    @Test
    public void testCalculateMeanWithEmptyArray() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{});
        assertTrue(Double.isNaN(analyzer.calculateMean()));
    }

    @Test
    public void testCalculateStdev() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 2, 3, 4, 5});
        assertEquals(1.414, analyzer.calculateStdev(), 0.001);
    }

    @Test
    public void testGetEvenNumbersWithEvenAndOddValues() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 2, 3, 4, 5});
        assertArrayEquals(new int[]{2, 4}, analyzer.getEvenNumbers());
    }

    @Test
    public void testGetEvenNumbersWithOddValuesOnly() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{1, 3, 5});
        assertArrayEquals(new int[]{}, analyzer.getEvenNumbers());
    }

    @Test
    public void testGetEvenNumbersWithEmptyArray() {
        NumberAnalyzer analyzer = new NumberAnalyzer(new int[]{});
        assertArrayEquals(new int[]{}, analyzer.getEvenNumbers());
    }
}
