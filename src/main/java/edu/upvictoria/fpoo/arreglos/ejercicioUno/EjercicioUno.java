package edu.upvictoria.fpoo.arreglos.ejercicioUno;

import edu.upvictoria.fpoo.utilidades.Input;



/**
 * EjercicioUno
 */
public class EjercicioUno {

    public EjercicioUno(){

        double[] array = new double[10];

        Input entrada = new Input();

        for (int i = 0; i<10; i++){

            array[i] = entrada.entradaDouble("Ingrese un número: ");

        }


    }

}