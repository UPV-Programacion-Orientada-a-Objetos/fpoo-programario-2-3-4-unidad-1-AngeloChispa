package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioCinco;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EjercicioCincoTest {
    @Test
    public void testMayorA() {

        EjercicioCinco obj = new EjercicioCinco(true);

        assertEquals(-4, obj.mayorTres(-4, -8, -10), 0.0001);

    }

    @Test
    public void testMayorB() {

        EjercicioCinco obj = new EjercicioCinco(true);

        assertEquals(11, obj.mayorTres(-4, 11, 3), 0.0001);

    }

    @Test
    public void testMayorC() {

        EjercicioCinco obj = new EjercicioCinco(true);

        assertEquals(28, obj.mayorTres(7, 6, 28), 0.0001);

    }

}
