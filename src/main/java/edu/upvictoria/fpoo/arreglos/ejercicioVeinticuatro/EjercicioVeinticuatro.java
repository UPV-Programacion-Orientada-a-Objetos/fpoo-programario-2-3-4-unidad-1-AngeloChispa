package edu.upvictoria.fpoo.arreglos.ejercicioVeinticuatro;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeinticuatro
 */
public class EjercicioVeinticuatro {

    public double magnitudVector(int n, double[] vector){

        double magnitud = 0;

        for (int i = 0; i<n; i++ ){

            magnitud += vector[i]*vector[i];

        }

        return  Math.sqrt(magnitud);

    }

    public EjercicioVeinticuatro(boolean test){

    }

    public EjercicioVeinticuatro(){

        
        int n = 0;

        double[] vector;

        Input entrada = new Input();

        n = (int) entrada.entradaDouble("Ingrese el tamaño del vector: ");

        vector = new double[n];

        System.out.println("La magnitud del vector es: " + magnitudVector(n, vector));

    }

}