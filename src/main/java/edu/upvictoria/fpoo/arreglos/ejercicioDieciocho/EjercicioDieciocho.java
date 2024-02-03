package edu.upvictoria.fpoo.arreglos.ejercicioDieciocho;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioDieciocho
 */
public class EjercicioDieciocho {

    public double[] nuevoVector(double[] vector, Input entrada, int n){

        double[] vectorDos = new double[n];

        for(int i = 0; i < n; i++){

            vector[i] = entrada.entradaDouble("Ingresa un numero para el vector: ");
            if( i == n -1 ){

                vectorDos[0] = vector[i];

            }else{

                vectorDos[i + 1] = vector[i];

            }
            

        }

        return vectorDos;

    }


    public EjercicioDieciocho(){

        
        int n = 0;
        double[] vector, vectorDos;

        Input entrada = new Input();

        n = (int) Math.abs(entrada.entradaDouble("Ingresa el tamaño del vector: "));

        vector = new double[n];
        
        vectorDos = nuevoVector(vector, entrada, n);

        for(int i = 0; i<n; i++){

            System.out.print("["+vectorDos[i]+"]");

        }

        System.out.println();

    }

}