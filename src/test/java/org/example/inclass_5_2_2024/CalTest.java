package org.example.inclass_5_2_2024;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalTest {

    Cal cal = new Cal();


    @Test
    void sum() {
        assertEquals(5, cal.sum(2, 3));
        assertEquals(0, cal.sum(-3, 3));
        assertEquals(-5, cal.sum(-2, -3));
    }

    @Test
    void sub() {
        assertEquals(-1, cal.sub(2, 3));
        assertEquals(-6, cal.sub(-3, 3));
        assertEquals(1, cal.sub(-2, -3));
    }

    @Test
    void mul() {
        assertEquals(6, cal.mul(2, 3));
        assertEquals(-9, cal.mul(-3, 3));
        assertEquals(6, cal.mul(-2, -3));
    }

    @Test
    void div() {
        assertEquals(2, cal.div(6, 3));
        assertEquals(-1, cal.div(-3, 3));
        assertEquals(2, cal.div(-6, -3));
    }
}