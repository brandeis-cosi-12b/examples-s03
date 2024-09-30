package edu.brandeis.lecture10;

import org.junit.Test;
import static org.junit.Assert.*;

public class AntTest {
    @Test
    public void testDefaultInitialization() {
        Ant a = new Ant();
        assertEquals(0, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());
    }

    @Test
    public void testInitialization() {
        Ant a = new Ant(3);
        assertEquals(3, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());
    }

    @Test public void testCrawlUp() {
        Ant a = new Ant();
        a.crawl();
        assertEquals(1, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());
    }

    @Test public void testCircuit() {
        Ant a = new Ant();
        assertEquals(0, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());

        a.crawl();
        assertEquals(1, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());

        a.crawl();
        assertEquals(2, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());

        a.crawl();
        assertEquals(3, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());

        a.crawl();
        assertEquals(4, a.getHeight());
        assertEquals(0, a.getTurnaroundCount());

        a.crawl();
        assertEquals(3, a.getHeight());
        assertEquals(1, a.getTurnaroundCount());

        a.crawl();
        assertEquals(2, a.getHeight());
        assertEquals(1, a.getTurnaroundCount());

        a.crawl();
        assertEquals(1, a.getHeight());
        assertEquals(1, a.getTurnaroundCount());

        a.crawl();
        assertEquals(0, a.getHeight());
        assertEquals(1, a.getTurnaroundCount());

        a.crawl();
        assertEquals(1, a.getHeight());
        assertEquals(2, a.getTurnaroundCount());

        a.crawl();
        assertEquals(2, a.getHeight());
        assertEquals(2, a.getTurnaroundCount());
    }

    @Test public void testManyCircuits() {
        Ant a = new Ant();
        for(int i = 0; i < 41; i++) {
            a.crawl();
        }
        assertEquals(10, a.getTurnaroundCount());
    }

    @Test public void testToStringNew() {
        Ant a = new Ant();
        assertEquals("Ant at floor 0 (going up)", a.toString());
    }

    @Test public void testToStringUp() {
        Ant a = new Ant();
        for(int i = 0; i < 3; i++) {
            a.crawl();
        }
        assertEquals("Ant at floor 3 (going up)", a.toString());
    }

    @Test public void testToStringDown() {
        Ant a = new Ant();
        for(int i = 0; i < 7; i++) {
            a.crawl();
        }
        assertEquals("Ant at floor 1 (going down)", a.toString());
    }
}
