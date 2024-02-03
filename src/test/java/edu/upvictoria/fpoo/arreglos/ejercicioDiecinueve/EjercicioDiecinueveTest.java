package edu.upvictoria.fpoo.arreglos.ejercicioDiecinueve;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class EjercicioDiecinueveTest {
    @Test
    public void testMenorElemento() {

        EjercicioDiecinueve obj = new EjercicioDiecinueve(true);

        double[][] matriz = {
            {1.5, -2.0, 3.7, 4.2, -5.8, 6.1, 7.4, -8.9, 9.0, 10.3, -11.5, 12.6},
            {-13.2, 14.4, -15.6, 16.8, 17.0, -18.2, 19.4, 20.6, -21.8, 22.0, 23.2, -24.4},
            {25.6, -26.8, 27.0, 28.2, -29.4, 30.6, 31.8, -32.0, 33.2, 34.4, -35.6, 36.8},
            {-37.0, 38.2, -39.4, 40.6, 41.8, -42.0, 43.2, 44.4, -45.6, 46.8, 47.0, -48.2},
            {49.4, -50.6, 51.8, -52.0, 53.2, 54.4, -55.6, 56.8, 57.0, -58.2, 59.4, 60.6},
            {-61.8, 62.0, 63.2, -64.4, 65.6, 66.8, -67.0, 68.2, 69.4, -70.6, 71.8, -72.0},
            {73.2, -74.4, 75.6, 76.8, -77.0, 78.2, 79.4, -80.6, 81.8, 82.0, -83.2, 84.4},
            {-85.6, 86.8, -87.0, 88.2, 89.4, -90.6, 91.8, 92.0, -93.2, 94.4, 95.6, -96.8},
            {97.0, -98.2, 99.4, 100.6, -101.8, 102.0, 103.2, -104.4, 105.6, 106.8, -107.0, 108.2},
            {-109.4, 110.6, 111.8, -112.0, 113.2, 114.4, -115.6, 116.8, 117.0, -118.2, 119.4, -120.6},
            {121.8, -122.0, 123.2, 124.4, -125.6, 126.8, 127.0, -128.2, 129.4, 130.6, -131.8, 132.0},
            {-133.2, 134.4, -135.6, 136.8, 137.0, -138.2, 139.4, 140.6, -141.8, 142.0, 143.2, -144.4},
            {145.6, -146.8, 147.0, 148.2, -149.4, 150.6, 151.8, -152.0, 153.2, 154.4, -155.6, 156.8},
            {-157.0, 158.2, -159.4, 160.6, 161.8, -162.0, 163.2, 164.4, -165.6, 166.8, 167.0, -168.2},
            {169.4, -170.6, 171.8, -172.0, 173.2, 174.4, -175.6, 176.8, 177.0, -178.2, 179.4, -180.6}
        };

        double[] vector = {-180.6, 506.6,68};

        assertArrayEquals(vector, obj.menorElemento(matriz), 0.0001);

    }
}