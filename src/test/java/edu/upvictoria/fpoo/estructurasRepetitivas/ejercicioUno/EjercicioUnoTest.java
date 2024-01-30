package edu.upvictoria.fpoo.estructurasRepetitivas.ejercicioUno;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EjercicioUnoTest {
    @Test
    public void testMayorA() {

        double a = 5, b = 3;

        EjercicioUno obj = new EjercicioUno("");

        System.setIn(new java.io.ByteArrayInputStream("5\n".getBytes()));
        System.setIn(new java.io.ByteArrayInputStream("3\n".getBytes()));

        assertEquals(5, obj.mayor(a, b), 0.0001);


    }

    @Test
    public void testMayorB() {

        double a = 4, b = 7;

        EjercicioUno obj = new EjercicioUno("");

        assertEquals(7, obj.mayor(a, b), 0.0001);

    }

    @Test
    public void testMayorADecimal() {

        double a = 4.6, b = 4.5;

        EjercicioUno obj = new EjercicioUno("");

        assertEquals(4.6, obj.mayor(a, b), 0.0001);


    }

    @Test
    public void testMayorNegativo() {

        double a = -8, b = -4;

        EjercicioUno obj = new EjercicioUno("");

        assertEquals(-4, obj.mayor(a, b), 0.0001);

    }

    @Test
    public void testMayorMezcla() {

        double a = 8, b = -4.78;

        EjercicioUno obj = new EjercicioUno("");

        assertEquals(8, obj.mayor(a, b), 0.0001);

    }
}
