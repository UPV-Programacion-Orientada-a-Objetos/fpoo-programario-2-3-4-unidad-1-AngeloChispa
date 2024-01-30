package edu.upvictoria.fpoo.utilidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InputTest {
    @Test
    public void EntradaDecimal() {

        Input entrada = new Input();

        System.setIn(new java.io.ByteArrayInputStream("56.78\n".getBytes()));

        assertEquals(56.78, entrada.entradaDouble("Ingresa un número: "), 0.0001);

    }

    @Test
    public void EntradaDecimalNegativo() {

        Input entrada = new Input();

        System.setIn(new java.io.ByteArrayInputStream("-78.90\n".getBytes()));

        assertEquals(-78.90, entrada.entradaDouble("Ingresa un número: "), 0.0001);

    }

}
