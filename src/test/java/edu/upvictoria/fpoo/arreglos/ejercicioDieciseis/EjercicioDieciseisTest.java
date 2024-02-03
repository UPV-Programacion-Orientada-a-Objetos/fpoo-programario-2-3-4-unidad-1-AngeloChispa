package edu.upvictoria.fpoo.arreglos.ejercicioDieciseis;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EjercicioDieciseisTest {
    @Test
    public void testMayorEdad() {

        int[] edad={19,20,13,45,17,23,56,12,14,28}; 

        EjercicioDieciseis obj = new EjercicioDieciseis(true);

        assertEquals(6, obj.mayorEdad(edad));
        

    }
}
