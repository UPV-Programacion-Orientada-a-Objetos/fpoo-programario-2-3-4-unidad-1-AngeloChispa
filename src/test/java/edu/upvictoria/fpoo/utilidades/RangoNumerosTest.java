package edu.upvictoria.fpoo.utilidades;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RangoNumerosTest {
    @Test
    public void testLimitar() {

        RangoNumeros obj = new RangoNumeros();

        assertTrue(obj.limitar(-1, 0, 5));

    }

    @Test
    public void testLimitarFalse() {

        RangoNumeros obj = new RangoNumeros();

        assertFalse(obj.limitar(4, 0, 5));

    }
}
