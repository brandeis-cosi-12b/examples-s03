package edu.brandeis.lecture10;

import org.junit.Test;
import static org.junit.Assert.*;

public class BarbellTest {

    @Test
    public void testAddValid() {
        Barbell b = new Barbell();
        assertTrue(b.addWeight(10));
        assertTrue(b.addWeight(5));
        assertTrue(b.addWeight(2));
        assertEquals(17, b.getTotalWeight());
    }

    @Test
    public void testAddSameWeight() {
        Barbell b = new Barbell();
        assertTrue(b.addWeight(10));
        assertTrue(b.addWeight(10));
        assertEquals(20, b.getTotalWeight());
    }

    @Test
    public void testAddInvalid() {
        Barbell b = new Barbell();
        assertTrue(b.addWeight(10));
        assertFalse(b.addWeight(11));
        assertEquals(10, b.getTotalWeight());
    }

    @Test
    public void testRemove() {
        Barbell b = new Barbell();
        assertTrue(b.addWeight(10));
        assertTrue(b.addWeight(5));
        assertTrue(b.addWeight(2));
        assertEquals(17, b.getTotalWeight());

        assertEquals(2, b.removeWeight());
        assertEquals(15, b.getTotalWeight());

        assertEquals(5, b.removeWeight());
        assertEquals(10, b.getTotalWeight());

        assertEquals(10, b.removeWeight());
        assertEquals(0, b.getTotalWeight());

        assertEquals(0, b.removeWeight());
        assertEquals(0, b.getTotalWeight());
    }

    @Test
    public void testToString() {
        Barbell b = new Barbell();
        assertTrue(b.addWeight(10));
        assertEquals("5-----5", b.toString());

        assertTrue(b.addWeight(5));
        assertEquals("2-5-----5-2", b.toString());

        assertTrue(b.addWeight(2));
        assertEquals("1-2-5-----5-2-1", b.toString());
    }
}
