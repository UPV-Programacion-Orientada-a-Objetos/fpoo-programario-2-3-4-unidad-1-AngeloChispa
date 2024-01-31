package edu.upvictoria.fpoo.estructurasSelectivas.ejercicioDos;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EjercicioDosTest {
    @Test
    public void testMayor() {

        EjercicioDos obj = new EjercicioDos(true);

        assertTrue(obj.mayorMenor(3));

    }

    @Test
    public void testMenor() {

        EjercicioDos obj = new EjercicioDos(true);

        assertFalse(obj.mayorMenor(-3));

    }

    @Test
    public void testCero() {

        EjercicioDos obj = new EjercicioDos(true);

        assertTrue(obj.mayorMenor(0));

    }
}
