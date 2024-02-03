package edu.upvictoria.fpoo.arreglos.ejercicioVeinte;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeinte
 */
public class EjercicioVeinte {

    public EjercicioVeinte(){

        double[] vector = new double[100], vectorDos = new double[100], vectorTres = new double[100]; 

        Input entrada = new Input();

        for (int i = 0; i<100; i++){

            vector[i] = entrada.entradaDouble("Ingresa un número para el vector 1: ");

            vectorDos[i] = entrada.entradaDouble("Ingresa un número para el vector 2: ");

            vectorTres[i] = vector[i] + vectorDos[i];

        }

        System.out.println("Vector resultante:");
        for(int i = 0; i<100; i++){

            System.out.print("["+vectorTres[i]+"]");

        }

    }

}