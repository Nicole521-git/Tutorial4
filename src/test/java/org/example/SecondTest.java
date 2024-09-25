package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondTest {
    Calc c = new Calc();
    @Test
    public void testSubtraction() {
        assertEquals(2, c.subtract(4, 2));
    }
}
