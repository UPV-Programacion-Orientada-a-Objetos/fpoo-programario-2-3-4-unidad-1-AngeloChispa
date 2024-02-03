package edu.upvictoria.fpoo.arreglos.ejercicioVeintiseis;

import edu.upvictoria.fpoo.utilidades.Input;

/**
 * EjercicioVeintiseis
 */


public class EjercicioVeintiseis {

    public double productoPunto(double[] vector,int n,  double[] vectorDos, int m){


        int menor = 0;
        double resultado = 0;
        
        if (n>m){
            menor = m;
        }else{
            menor = n;
        }

        
        for(int i = 0; i< menor; i++){

            resultado += vector[i]*vectorDos[i];  


        }

        return resultado;

    }

    public EjercicioVeintiseis(boolean test){

        

    }

    public EjercicioVeintiseis(){

        int n = 0, m = 0;
        double[] vector, vectorDos;

        Input entrada = new Input();

        n = (int) entrada.entradaDouble("Ingrese el tamaño del primer vector: ");
        m = (int) entrada.entradaDouble("Ingrese el tamaño del segundo vector: ");

        vector = new double[n];
        vectorDos = new double[m];


        System.out.println("El resultado es: " + productoPunto(vector, n, vectorDos, m));


    }


}