package edu.upvictoria.fpoo.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrecioTest {
    @Test
    public void testTotalEntero() {

        Precio obj = new Precio();

        assertEquals(10, obj.total(2, 5), 0.0001);

    }

    @Test
    public void testTotalEnteroNegativo() {

        Precio obj = new Precio();

        assertEquals(10, obj.total(-2, -5), 0.0001);

    }

    @Test
    public void testTotalDecimal() {

        Precio obj = new Precio();

        assertEquals(25.5, obj.total(2.5, 10.2), 0.0001);

    }

    @Test
    public void testTotalDecimalNegativo() {

        Precio obj = new Precio();

        assertEquals(25.5, obj.total(-2.5, -10.2), 0.0001);

    }

    @Test
    public void testTotalMezcla() {

        Precio obj = new Precio();

        assertEquals(-5, obj.total(-2.5, 2), 0.0001);

    }

    @Test
    public void testPorcentaje() {

        Precio obj = new Precio();

        assertEquals(20, obj.porcentaje(100, 20), 0.0001);

    }

    @Test
    public void testPorcentajeDecimal() {

        Precio obj = new Precio();

        assertEquals(20.12, obj.porcentaje(100.60, 20), 0.0001);

    }

    @Test
    public void testPorcentajeDecimalNegativo() {

        Precio obj = new Precio();

        assertEquals(-20.12, obj.porcentaje(-100.60, 20), 0.0001);

    }

    @Test
    public void testPorcentajeEnteroNegativo() {

        Precio obj = new Precio();

        assertEquals(-20, obj.porcentaje(-100, 20), 0.0001);

    }

}
